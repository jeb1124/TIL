package com.encore.test;

import java.util.Scanner;

import com.encore.manager.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;

public class BookTest {

	public static void main(String[] args) {// ����å DB
		
		Book a = new Book("111", "���̾�", "�츣�� �켼", "������", 10000.0, "���м���");
		Book b = new Book("222", "�����", "Peter", "������", 18000.0, "�ڼ���");
		Book c = new Magazine("333", "�����ǿ���", "James", "���ƻ��̾�", 8500.0, "���и�ȭ ����");
		Book d = new Book("444", "�Ƹ��", "�̳���", "���е���", 10000.0, "����Ʈ����");
		Book e = new Magazine("555", "����21", "������", "����21", 8000.0, "��ȭ ����");
		
		Book[] bs  = {a,b,c,d,e,};
		
		printBooks(bs);
	}
	
	
	public static void printBooks(Book[] bs) {// ��� �޼ҵ�
		
		BookManager service = new BookManager(100); // ���� �ִ� �����Ǽ��� 100������ ����
		
		// ���� �޼ҵ��� �迭���� �޾ƿ� ����å ��ü���� service�� �ִ� �迭�� �߰���
		for(int i = 0; i < bs.length; i++) {
			service.insertBook(bs[i]);
		}
		
		boolean menu = true; // �޴� ����ġ
		while(menu == true) { // �޴� ����ġ�� �����ִ� ���� ���ѹݺ�
			System.out.println("===============================");
			System.out.println("��ô ������ ���� �������Դϴ�.");
			System.out.println("1. å ��ȸ");
			System.out.println("2. å �߰�");
			System.out.println("3. å ã��");
			System.out.println("4. ��üå ���� �հ� �� ��� ��ȸ");
			System.out.println("===============================");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); // �޴� ��ȣ �Է�

			// 1. ������ ��ü å ��ȸ
			if(choice == 1) {
				System.out.println("��ü å �� "+service.getNumberOfBooks()+"��");
				for(Book b : service.getAllBook()) {
					System.out.println(b);
				}
			}
			
			// 2. ������ å �߰�
			else if(choice == 2) {
				// service.insertBook(new Book("777", "������Ʈ", "�츣�� �켼", "������", 12000.0, "�ڼ���"));
				// service.insertBook(new Magazine("888", "����", "������", "�����۴���", 14000.0, "���� ��������", 2019, 11));
				System.out.println("ISBN�� �Է��ϼ���."); 
				String isbn = sc.next(); 
				System.out.println("å ������ �Է��ϼ���."); sc.nextLine();
				String title = sc.nextLine();
				System.out.println("�۰��� �Է��ϼ���.");
				String author = sc.nextLine();
				System.out.println("���ǻ縦 �Է��ϼ���.");
				String publisher = sc.nextLine();
				System.out.println("������ �Է��ϼ���.");
				Double price = sc.nextDouble(); sc.nextLine();
				System.out.println("������ ������ �Է��ϼ���.");
				String desc = sc.nextLine();
				System.out.println("�Ϲݵ����̸� true, �����̸� false�� �Է��ϼ���."); 
				Boolean bkOrMaga = sc.nextBoolean();
				if(bkOrMaga.equals(true)) {
					service.insertBook(new Book(isbn, title, author, publisher, price, desc));
				}
				else if(bkOrMaga.equals(false)) {
					System.out.println("�Ⱓ������ �Է��ϼ���.");
					int year = sc.nextInt();
					System.out.println("�Ⱓ���� �Է��ϼ���.");
					int month = sc.nextInt();
					service.insertBook(new Magazine(isbn, title, author, publisher, price, desc));
				}
				System.out.println("����å�� �߰��Ǿ����ϴ�.");
			}
			
			// 3. å ã��
			else if(choice == 3) {
				System.out.println("===============================");
				System.out.println("� ������� å�� ã�ڽ��ϱ�?");
				System.out.println("1. ISBN");
				System.out.println("2. å ����");
				System.out.println("3. ���ǻ�");
				System.out.println("4. ����");
				System.out.println("5. ��������");
				System.out.println("===============================");
				sc.nextLine();
				int search = sc.nextInt(); 
				if(search == 1) {
					System.out.println("ISBN�� �Է��ϼ���.");
					String isbn = sc.next(); sc.nextLine();
					if(service.searchBook(isbn) == null) System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					else System.out.println(service.searchBook(isbn));
				}
				else if(search == 2) {
					System.out.println("å ������ �Է��ϼ���.");  sc.nextLine();
					String title = sc.nextLine(); 
					int count = 0;
					for(Book b : service.searchBookByTitle(title)) {
						if(b != null) System.out.println(b); 
						else count++;
					}
					if(count == service.searchBookByTitle(title).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
				}
				else if(search == 3) {
					System.out.println("���ǻ縦 �Է��ϼ���.");
					String publisher = sc.next();
					int count = 0;
					for(Book b : service.searchBookByPublisher(publisher)) {
						if(b != null) System.out.println(b);
						else count++;
					}
					if(count == service.searchBookByPublisher(publisher).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
					
				}
				else if(search == 4) {
					System.out.println("������ �Է��ϼ���.");
					double price = sc.nextDouble(); sc.nextLine();
					int count = 0;
					for(Book b : service.searchBookPrice((double)price)) {
						if(b != null) System.out.println(b);
						else count++;
					}
					if(count == service.searchBookPrice((double)price).length) {
						System.out.println("��ġ�ϴ� å�� �����ϴ�.");
					}
				}
				else if(search == 5) menu = true;
				else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			// 4. ��üå ���� �հ� �� ��� ��ȸ
			else if(choice == 4) {
				System.out.println("��üå ���� �հ� : " + service.getSumPriceOfBooks());
				System.out.println("��üå ���� ��� : " + service.getAveragePriceOfBooks());
			}
			
			// �߸� �Է����� ���
			
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}