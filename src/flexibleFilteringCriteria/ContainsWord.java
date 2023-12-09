package flexibleFilteringCriteria;

public class ContainsWord implements Criterion {

	private String word;
	
	public ContainsWord(String word) {
		super();
		this.word = word;
	}

	@Override
	public boolean complies(String line) {
		
		return line.contains(word);
	}

}
