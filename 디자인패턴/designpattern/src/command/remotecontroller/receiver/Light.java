package command.remotecontroller.receiver;

public class Light {

	private String location;

	public Light(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void on() {
		System.out.println("[" + getLocation() + "] ���� On.");
	}

	public void off() {
		System.out.println("[" + getLocation() + "] ���� Off.");
	}
}
