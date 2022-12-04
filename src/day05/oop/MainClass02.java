package day05.oop;

import day05.mypac.Book;

public class MainClass02 {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		System.out.println("book1 제목 : " + book1.subject);
		System.out.println("book1 저자 : " + book1.writter);
		
		book1.read();
		book1.pillow();
		
	}

}
