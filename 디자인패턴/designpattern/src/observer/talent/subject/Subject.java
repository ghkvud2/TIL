package observer.talent.subject;


import observer.talent.observer.Observer;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
