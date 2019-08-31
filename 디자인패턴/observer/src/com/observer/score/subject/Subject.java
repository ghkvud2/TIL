package com.observer.score.subject;

import java.util.ArrayList;
import java.util.List;

import com.observer.score.observer.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}

}
