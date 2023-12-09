package flexibleFilteringCriteria;

public class AtLeastOne implements Criterion {
	
	private Criterion[] crit;

	public AtLeastOne(Criterion... crit) {
		super();
		this.crit = crit;
	}

	@Override
	public boolean complies(String line) {
		for (Criterion c : crit) {
			if (c.complies(line)) {
				return true;
			}
		}
		return false;
	}

}
