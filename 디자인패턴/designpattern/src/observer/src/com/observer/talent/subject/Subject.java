package observer.src.com.observer.talent.subject;

import com.observer.talent.observer.Observer;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
