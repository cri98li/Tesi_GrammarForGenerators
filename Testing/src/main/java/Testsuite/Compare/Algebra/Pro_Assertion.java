package Testsuite.Compare.Algebra;

public class Pro_Assertion implements Assertion{
	
	private Long min, max;
	
	public Pro_Assertion(Long min, Long max) {
		this.min = min;
		this.max = max;
	}
	
	public Pro_Assertion() {
	}

	public Pro_Assertion intersect(Pro_Assertion pro) {
		Pro_Assertion intersectedPro = new Pro_Assertion();
		
		intersectedPro.min = (min > pro.min)? min:pro.min;
		intersectedPro.max = (max < pro.max)? max:pro.max;
		
		return intersectedPro;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pro_Assertion that = (Pro_Assertion) o;

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
