package flexibleFilteringCriteria;

public class Not implements Criterion {
	
	private Criterion crit;

	public Not(Criterion crit) {
		super();
		this.crit = crit;
	}

	@Override
	public boolean complies(String line) {
		
		return !crit.complies(line);
	}

}
