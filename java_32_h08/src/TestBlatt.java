
public class TestBlatt {
	public static void main(String[] args) {
		Blatt drillingNiedrig = new Blatt(new int[] {2,2,2});
		Blatt drillingHoch = new Blatt(new int[] {9,9,9});

		Blatt paarNiedrig = new Blatt(new int[] {2,2,3});
		Blatt paarHoch = new Blatt(new int[] {5,5,2});
		Blatt paarHoch2 = new Blatt(new int[] {10,5,5});

		Blatt einfachNiedrig = new Blatt(new int[] {2,3,8});
		Blatt einfachHoch = new Blatt(new int[] {3,4,10});
		
		werteAus(paarHoch, drillingNiedrig);
		werteAus(paarNiedrig, einfachNiedrig);
		werteAus(drillingHoch, drillingNiedrig);
		werteAus(paarHoch, paarNiedrig);
		werteAus(paarHoch, paarHoch2);
		werteAus(einfachNiedrig, einfachHoch);
	}
	
	private static void werteAus(Blatt b1, Blatt b2) {
		BlattVergleich cb = new BlattVergleich();
		int vergleich = cb.compare(b1, b2);
		String ergebnis = "";
		if (vergleich == 404) {
			System.out.println("something went wrong.");
			return;
		}
		if (vergleich < 0) {
			ergebnis = " verliert gegen ";
		}else if (vergleich == 0) {
			ergebnis = " ist gleichwertig mit ";
		}else {
			ergebnis = " schlaegt ";
		}
		
		System.out.println(b1 + ergebnis + b2);
	}
}
