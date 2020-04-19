package Testsuite.Compare.Algebra;

public class Exist_Assertion implements Assertion{
	private Long min, max;
	private Assertion contains;
	
	public Exist_Assertion() {	}
	
	public Exist_Assertion(Long min, Long max, Assertion schema) {
		this.min = min;
		this.max = max;
		this.contains = schema;
	}

	public void setMin(Long min) {
		this.min = min;
	}
	
	public void setMax(Long max) {
		this.max = max;
	}
	
	public void setContains(Assertion schema) {
		this.contains = schema;
	}
	
	public Exist_Assertion intersect(Exist_Assertion exist) {
		Exist_Assertion intersectedExist = new Exist_Assertion();
		
		intersectedExist.setMin((min > exist.min)? min:exist.min);
		intersectedExist.setMax((max < exist.max)? max:exist.max);
		
		return intersectedExist;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Exist_Assertion that = (Exist_Assertion) o;

		if (min != null ? !min.equals(that.min) : that.min != null) return false;
		if (max != null ? !max.equals(that.max) : that.max != null) return false;
		return contains != null ? contains.equals(that.contains) : that.contains == null;
	}

	@Override
	public int hashCode() {
		int result = min != null ? min.hashCode() : 0;
		result = 31 * result + (max != null ? max.hashCode() : 0);
		result = 31 * result + (contains != null ? contains.hashCode() : 0);
		return result;
	}
}
