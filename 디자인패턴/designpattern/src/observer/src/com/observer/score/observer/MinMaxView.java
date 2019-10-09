package observer.src.com.observer.score.observer;

import java.util.Collections;

import com.observer.score.subject.ScoreRecord;

public class MinMaxView implements Observer {

	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
		this.scoreRecord.addObserver(this);
	}

	@Override
	public void update() {
		int max = Collections.max(scoreRecord.getScores());
		int min = Collections.min(scoreRecord.getScores());
		System.out.println("[최대, 최소 값] : " + max + ", " + min);
	}
}
