package flexibleFilteringCriteria;

public class Main {

	public static void main(String[] args) {

		String address = "https://www.gutenberg.org/cache/epub/2148/pg2148.txt";
		GutenbergReader book = new GutenbergReader(address);
		
//		Criterion criterion = new EndsWithQuestionOrExclamationMark();
		Criterion criterion = new ContainsWord("AMONTILLADO");
//		Criterion criterion = new AllLines();
//		Criterion criterion = new LengthAtLeast(90);
		
		for (String line : book.linesWhichComplyWith(criterion)) {
			System.out.println(line);
		}

	}

}
