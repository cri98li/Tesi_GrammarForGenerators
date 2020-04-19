package Testsuite.Compare.Algebra;


public class Len_Assertion implements Assertion{
	private Long min, max;
	
	public Len_Assertion() { }
	
	public Len_Assertion(Long min, Long max) {
		this.min = min;
		this.max = max;
	}

	public void setMin(Long min) {
		this.min = min;
	}
	
	public void setMax(Long max) {
		this.max = max;
	}
	
	public Len_Assertion intersect(Len_Assertion len) {
		Len_Assertion intersectedLen = new Len_Assertion();
		
		intersectedLen.setMin((min > len.min)? min:len.min);
		intersectedLen.setMax((max < len.max)? max:len.max);
		
		return intersectedLen;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Len_Assertion that = (Len_Assertion) o;

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
