package flexibleFilteringCriteria;

public class Both implements Criterion {
	
	private Criterion crit1;
	private Criterion crit2;

	public Both(Criterion crit1, Criterion crit2) {
		super();
		this.crit1 = crit1;
		this.crit2 = crit2;
	}

	@Override
	public boolean complies(String line) {
		
		return crit1.complies(line) && crit2.complies(line);
	}

}
