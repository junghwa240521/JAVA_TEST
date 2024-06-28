package book;

import java.util.Scanner;

public class BookCreate {
		
			
			private static Scanner sc = new Scanner(System.in);
			
			public static void bookInfoInsert() {
				
				
				System.out.println("도서명을 입력해 주세요 : ");
				String bookTile = sc.next();

				System.out.println("가격을 입력해 주세요 : ");
				int bookPrice = sc.nextInt();
				
				System.out.println("저자를 입력해 주세요 : ");
				String bookAuthor = sc.next();
				
				
				System.out.println();
				
				
				
			Book b1 = new Book();
			
			b1.setTitle(bookTile);
			b1.setPrice(bookPrice);
			b1.setAuthor(bookAuthor);
			b1.setPublisher("도서출판");
			b1.setPubYear("2024");
			b1.setIsbn("123545646");
			b1.setPage(1022);

			
			System.out.println(b1.bookInfo());
			
		}

	}


