package activities;

public class Activity5 {

	public static void main(String[] args) {

		String title = "Harry Potter";

		Book newNovel = new MyBook();

		newNovel.setTitle(title);

		System.out.println("Book title is :" + newNovel.getTitle());
	}

}
