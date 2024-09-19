/**
 * 
 */
package challenge_AmazonBookApp;

/**
 * 
 */
public class AmazonWebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmazonBook b1 = new AmazonBook();
		b1.setTitle("The Body: A Guide for Occupants");
		b1.setAuthor("Bill Bryson");
		b1.setPrice(7.99);
		b1.setPages(464);
		b1.setISBN10("0857522418");
		b1.setAverageCustomerRating(5);
		b1.setLanguage("English");
		
		System.out.println(b1);
		
		AmazonBook b2 = new AmazonBook("Ulysses", "James Joyce", 3.99, 736, "1840226358",4, "English");
		System.out.println(b2);
		
		longestRead(b1, b2);
	}

	/**
	 * This method determines the longest read between the entered books.
	 * @param b1 - The Body: A Guide for Occupants by Bill Bryson
	 * @param b2 - Ulysses by James Joyce
	 */
	public static void longestRead(AmazonBook b1, AmazonBook b2) {
		if (b1.getPages() < b2.getPages()) {
			System.out.println("Longest read is : " + b1.getTitle());
		} else if (b2.getPages() > b1.getPages()) {
			System.out.println("Longest read is : " + b2.getTitle());
		} else {
			System.out.println("Both " + b1.getTitle() + " and " + b2.getTitle() + "are the same length");
		}
	}

}
