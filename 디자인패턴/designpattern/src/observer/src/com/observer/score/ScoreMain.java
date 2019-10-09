package observer.src.com.observer.score;

import java.util.Random;

import com.observer.score.observer.DataSheetView;
import com.observer.score.observer.MinMaxView;
import com.observer.score.subject.ScoreRecord;

public class ScoreMain {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(5, scoreRecord);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		for (int i = 1; i <= 5; i++) {
			Random random = new Random();
			int score = random.nextInt(100);
			System.out.println("[점수 추가] : " + score);
			scoreRecord.addScore(score);
		}
		scoreRecord.removeObserver(dataSheetView);
		for (int i = 1; i <= 5; i++) {
			Random random = new Random();
			int score = random.nextInt(100);
			System.out.println("[점수 추가] : " + score);
			scoreRecord.addScore(score);
		}

	}
}
