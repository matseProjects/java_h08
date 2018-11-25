/**
 * 
 * @author lukas
 * Repraesentiert eine Kombination (Paar, Drilling oder Unterschiedlich) und enthaelt den (eventuell) gleichen Wert
 */
public class CombinationValue {
	private Combination combination;
	private int sameValue;
	
	public Combination getCombination() {
		return this.combination;
	}
	
	public int getSameValue() {
		return this.sameValue;
	}
	
	public CombinationValue(Combination combination, int sameValue) {
		this.combination = combination;
		this.sameValue = sameValue;
		 
	}
}
