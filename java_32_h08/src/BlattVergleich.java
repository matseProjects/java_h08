import java.util.Comparator;
/**
 * 
 * @author lukas
 * Bietet die Moeglichkeit des Vegleichs von zwei Blaettern
 */
public class BlattVergleich implements Comparator<Blatt> {

	/**
	 * Vergleich von zwei Blaettern
	 */
	@Override
	public int compare(Blatt o1, Blatt o2) {
		CombinationValue value1 = o1.getCombination();
		CombinationValue value2 = o2.getCombination();
		Combination comb1 = value1.getCombination();
		Combination comb2 = value2.getCombination();

		if (comb1.ordinal() != comb2.ordinal()) {
			return comb1.ordinal() - comb2.ordinal();
		} else if (comb1 == Combination.Pair) {
			if (value1.getSameValue() != value2.getSameValue()) {
				return value1.getSameValue() - value2.getSameValue();
			} else {
				int third1 = o1.getSum() - 2 * value1.getSameValue();
				int third2 = o2.getSum() - 2 * value2.getSameValue();
				return third1 - third2;
			}
		} else if (comb1 == Combination.Triple) {
			return value1.getSameValue() - value2.getSameValue();
		} else if (comb1 == Combination.Different) {
			return o1.getSum() - o2.getSum();
		}
		return 404;
	}

}
