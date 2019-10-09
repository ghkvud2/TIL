package observer.src.com.observer.score.observer;

import com.observer.score.subject.ScoreRecord;

public class DataSheetView implements Observer {

	private int viewCount;
	private ScoreRecord scoreRecord;

	public DataSheetView(int viewCount, ScoreRecord scoreRecord) {
		this.viewCount = viewCount;
		this.scoreRecord = scoreRecord;
		this.scoreRecord.addObserver(this);
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public void update() {
		System.out.print("[점수 출력] : ");
		scoreRecord.getScores().stream().limit(viewCount).forEach(score -> System.out.print(score + " "));
		System.out.println();
	}

}
