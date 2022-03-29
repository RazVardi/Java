package basic;

public class EntryPoint {

	public static void main(String[] args) { //part 2
		Author gal = new Author("Gal Matalon", "Netanya");
		Book javaBook = new Book("The java world for QA", 97, gal);
		Book seleniumBook = new Book("The selenium world for QA", 197, gal);
		printAuthorName(javaBook,seleniumBook); //part 3
	}

	private static void printAuthorName(Book javaBook,Book seleniumBook) {
		System.out.println("the author name is: " + javaBook.whoIsAuthor());
		System.out.println("the author name is: " + seleniumBook.whoIsAuthor());
	}
}
