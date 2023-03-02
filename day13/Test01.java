public class Test01 {
	public static void main(String[] args) {
		Musician lbb = new Musician();
		//Erhu erhu = new Erhu();
		//Piano piano = new Piano();
		//Violin violin = new Violin();

		lbb.play(new Erhu());
		lbb.play(new Piano());
		lbb.play(new Violin());
	}
}