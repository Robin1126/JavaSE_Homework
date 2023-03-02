public class Test {
	public static void main(String[] args) {
		Husband lbb = new Husband("LBB");
		Wife zky = new Wife("ZKY");

		lbb.frau = zky;
		zky.man = lbb;

		System.out.println(lbb.frau.name);
		System.out.println(zky.man.name);

		lbb.frau = null;
		System.out.println(lbb.frau.name); //NullPointerException
	}
}