package Testsuite.Compare.Algebra;

public class BetItems_Assertion implements Assertion{
	private Long min, max;
	
	public BetItems_Assertion() {	}
	
	public BetItems_Assertion(Long min, Long max) {
		this.min = min;
		this.max = max;
	}
	
	public void setMin(Long min) {
		this.min = min;
	}
	
	public void setMax(Long max) {
		this.max = max;
	}
	
	public BetItems_Assertion intersect(BetItems_Assertion bet) {
		BetItems_Assertion intersectedBet = new BetItems_Assertion();
		
		intersectedBet.setMin((min > bet.min)? min:bet.min);
		intersectedBet.setMax((max < bet.max)? max:bet.max);
		
		return intersectedBet;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BetItems_Assertion that = (BetItems_Assertion) o;

		if (min != null ? !min.equals(that.min) : that.min != null) return false;
		return max != null ? max.equals(that.max) : that.max == null;
	}

	@Override
	public int hashCode() {
		int result = min != null ? min.hashCode() : 0;
		result = 31 * result + (max != null ? max.hashCode() : 0);
		return result;
	}
}
