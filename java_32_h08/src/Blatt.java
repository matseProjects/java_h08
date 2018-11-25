/**
 * 
 * @author lukas
 * Repaesentiert ein Blatt mit 3 Karten
 */
public class Blatt {
	
	private int[] blatt;
	
	public void setBlatt(int[] newBlatt) {
		String msg = validate(newBlatt);
		if (msg != null) {
			throw new IllegalArgumentException(msg);
		}else {
			this.blatt = newBlatt;
		}
	}
	
	/**
	 * Prueft auf die Anzahl der Karten
	 * @param blatt
	 * @return Fehler
	 */
	private String validate(int[] blatt) {
		if (blatt == null) {
			return "Bitte geben Sie 3 Karten an";
		}else if (blatt.length != 3) {
			return "Das Blatt muss 3 Karten enthalten";
		}
		for (int i = 0;i < 3;i++) {
			if (blatt[i] < 2 || blatt[i] > 14) {
				return "Ungueltige Kartenangabe (" + blatt[i] + ")";
			}
		}
		return null;
	}
	
	public Blatt(int[] blatt) {
		setBlatt(blatt);
	}
	
	/**
	 * 
	 * @return Summe aller Kartenwerte
	 */
	public int getSum() {
		int sum = 0;
		for (int i = 0;i < 3;i++) {
			sum += blatt[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * @return Paar oder Drilling oder Unterschiedlich
	 */
	public CombinationValue getCombination() {
		int same = 0;
		int sameValue = -1;
		if (blatt[0] == blatt[1]) {
			same++;
			sameValue = blatt[0];
		}
		if (blatt[1] == blatt[2]) {
			same++;
			sameValue = blatt[1];
		}
		Combination combination = Combination.values()[same];
		return new CombinationValue(combination, sameValue);
	}
	
	@Override
	public String toString() {
		return "Blatt: " + blatt[0] + ", " + blatt[1] + ", " + blatt[2];
	}
	
}
