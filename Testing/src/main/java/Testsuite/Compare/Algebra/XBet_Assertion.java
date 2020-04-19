package Testsuite.Compare.Algebra;

public class XBet_Assertion implements Assertion{
	private Object min, max;
	
	public XBet_Assertion(Object min, Object max) {
		this.min = min;
		this.max = max;
	}

	public void setMin(Object min) {
		this.min = min;
	}
	
	public void setMax(Object max) {
		this.max = max;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		XBet_Assertion that = (XBet_Assertion) o;

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
