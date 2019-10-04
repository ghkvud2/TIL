### 1. TCP Three-HandShaking

- TCP/IP 프로토콜에서 서버와 클라이언트간에 Connection을 맺기 위한 방법으로 3번의 과정을 거친다.

![](https://t1.daumcdn.net/cfile/tistory/2352F94A58D7287932)

1. 클라이언트는 서버에 접속 요청 메시지 `SYN M` 을 보내고 `<SYN_SENT>` 상태가 된다.
2. 서버는 클라이언트가 보낸 `SYN M` 요청을 받고 요청을 수락한다는 `ACK M+1과 SYN N`이 설정된 패킷을 전송한다. 이때 서버의 상태는 `<SYN_RECV>` 가 된다.
3. 클라이언트는 서버의 수락 응답인 `ACK M+1과 SYN N` 패킷을 받고 `ACK N+1` 패킷을 보내면 Connect가 맺어진다.

---

### 2. TCP Four-HandShaking

- 서버와 클라이언트간에 Connection을 끊기 위해 사용하는 방법이다.

![](https://t1.daumcdn.net/cfile/tistory/2336285058D7288E33)

1. 클라이언트가 연결을 끊기 위해 `FIN` 패킷을 보내고 소켓을 `FIN_WAIT1`상태로 변경한다.
2. 서버는 클라이언트로 받은 `FIN`패킷에 대해서 `ACK` 패킷을 보내고 `CLOSE_WAIT`상태로 변경한다. 그 이전에 데이터를 모두 보낼때 까지 잠깐 `TIME_OUT` 상태가 된다.
3. 서버로부터 `ACK` 패킷을 받은 클라이언트는 `FIN_WAIT2` 상태로 변경하고 서버로부터 `FIN` 패킷을 기다린다.
4. 서버는 연결을 끊기 위해 `FIN` 패킷을 보내고 `LAST_ACK` 상태로 변경한다.
5. 서버로부터 `FIN` 패킷을 받은 클라이언트는 `ACK` 패킷을 보내고 서버가 보내는 잉여 데이터를 수신하기 위해 잠시동안 `TIME_WAIT` 상태로 대기한다.
6. 클라이언트로부터 `ACK` 패킷을 받은 서버는 소켓을 `CLOSED`한다.

---

![](https://t1.daumcdn.net/cfile/tistory/995C23465C7DD7E30B)

### 3. 서버 소켓 프로그래밍

#### 1. 서버 소켓 생성 : socket()

- 소켓 통신을 위해 가장 먼저 `소켓`을 생성한다.
- 자바에서는 `new ServerSocket(int port)` 를 통해 생성할 수 있다.

#### 2. 바인딩 : bind()

- 서버 내부적으로 클라이언트와 통신할 `포트 번호`를 소켓과 바인딩하는 작업을 거친다.
- 클라이언트는 `서버 소켓`에 설정한 `포트 번호`로 서버와 통신할 수 있다.

#### 3. 클라이언트 요청 대기 : listen()

- 서버 소켓에 `포트 번호`를 바인딩하고 나면, 서버 소켓은 클라이언트의 요청을 받아들일 준비가 된 것이다.
- 클라이언트의 요청이 `수신`될 때 까지 대기 상태로 머무른다.
- `listen() API`가 대기 상태에서 빠져나오는 시점은 클라이언트의 요청이 확인되었을 때 이다.
- 이때, 클라이언트의 요청 정보는 별도의 `큐`에 저장되는데 이 시점의 `클라이언트 요청`은 아직 서버와 Connection을 맺지 않은 요청들이다.

#### 4. 클라이언트 요청 수립 : accept()

- `큐`에 클라이언트의 요청이 쌓이면 실제로 서버와의 `소켓 연결`하는 과정이 남아있는데 이를 `accept() API`가 수행하게 된다.
- `accept() API`는 내부적으로 클라이언트와 연결을 맺는 또 다른 소켓(서버 소켓과는 다른)을 생성하여 반환한다.

#### 5. 데이터 송수신 : send() / recv()

- 연결된 소켓을 통해 데이터를 송신할 때에는 `send() API`를 사용하고 데이터를 수신할 때에는 `recv() API`를 사용한다.
- 여기서 주의할 점이 있는데, 데이터를 송신하는 입장에서는 자기 자신이 얼마만큼의 데이터를 보내는 지 알기 때문에 크게 상관없지만, 데이터를 받는 입장에서는 얼마만큼의 데이터를 수신해야 할지 알 수 없다.
- 그렇기 때문에, 데이터 수신을 위한 `recv() API`는 별도의 스레드를 통해 실행한다.

#### 6. 소켓 닫기 : close()

- 더 이상 데이터 송수신이 필요없게 되면, 소켓을 닫기 위해 `close() API`를 호출합니다.
- 만약, 소켓이 `closed` 된 후 데이터를 다시 주고받고자 한다면 새로운 소켓을 생성해야한다.

---

### 4. 클라이언트 소켓 프로그래밍

#### 1. 클라이언트 소켓 생성 : socket()

- 소켓 통신을 위해 가장 먼저 `소켓`을 생성한다.
- 자바에서는 `new Socket(int ip, int port)`를 통해 클라이언트 소켓을 생성한다. 

#### 2. 연결 요청 : connect()

- `connect() API`는 IP주소와 포트번호에 해당하는 대상으로 연결 요청을 보낸다.
- `connect() API`는 연결 요청에 대한 결과 (성공, 거절 등)가 결정되기 전에는 `connect()`의 실행이 끝나지 않는다.

#### 3. 데이터 송수신 : send() / recv()

- 대상 (서버)와 Connection을 맺었다면, 데이터를 송수신한다.
- 이 과정은 서버의 `데이터 송수신`과 같다.

#### 4. 소켓 닫기 : close()

- 이 과정은 서버의 `소켓 닫기`와 같다.

---

```java
public class Server{
    
    public static void main(String[] args){
        
		try(ServerSocket serverSocket = new ServerSocket(8080)){
            //요청이 들어올 때 까지 listen()
            Socket socket = serverSocket.accept();
            
            OutputStream out = socket.getOuputStream();
            DataOutputStream dos = new DataOuputStream(out);
            
            dos.writeUTF("MessageFromServer");
            dos.close();
        }
    }
}

public class Client{
    public static void main(String[] args){
        
        String ip = "127.0.0.1";
        int port = 8080;
        
        try(Socket socket = new Socket(ip, port)){
            
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            System.out.println(dis.readUTF());
            
            dis.close();
        }
    }
}
```

