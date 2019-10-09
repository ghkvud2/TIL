package adapter;

public class DuckMain {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("[Duck Say]");
		duck.quack();
		duck.fly();
		System.out.println();
		
		Turkey turkey = new WildTurkey();
		System.out.println("[Turkey Say]");
		turkey.gobble();
		turkey.fly();
		System.out.println();

		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		System.out.println("[Adapter Say]");
		adapter.quack();
		adapter.fly();
		System.out.println();

	}
}
