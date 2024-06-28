package book;

import java.util.Scanner;

public class Bookinfo {
	
	public static void main(String[] args) {
	}	
		private static Scanner sc = new Scanner(System.in);
		
		public static void bookInfoInsert() {
		Book b1 = new Book();
		
		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도서출판");
		b1.setPubYear("2024");
		b1.setIsbn("123545646");
		b1.setPage(1022);

		
		
		BookCreate.bookInfoInsert();
		
	}
	
}
