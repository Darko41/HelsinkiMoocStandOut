package flexibleFilteringCriteria;

public class LengthAtLeast implements Criterion {
	
	private int length;

	public LengthAtLeast(int length) {
		super();
		this.length = length;
	}

	@Override
	public boolean complies(String line) {
		
		return line.length() >= length;
	}

}
