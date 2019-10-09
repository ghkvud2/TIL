package observer.src.com.observer.talent;

import com.observer.talent.observer.Observer;
import com.observer.talent.observer.Press;
import com.observer.talent.subject.Talent;

public class TalentMain {

    public static void main(String[] args) {

        Talent talent1 = new Talent("정우성");

        Observer observer1 = new Press("동아일보", talent1);
        Observer observer2 = new Press("중앙일보", talent1);
        Observer observer3 = new Press("YTN", talent1);
        Observer observer4 = new Press("KBS", talent1);
        Observer observer5 = new Press("SBS", talent1);

        talent1.setMeasurement("강남", "2019-09-01", "길거리 인터뷰");

    }
}
