
public class Book_info extends Book {
 Book_info(int book, String name, String publica) {
		super(book, name, publica);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Book b=new Book(121,"core java","nikhil");
	Book b1=new Book(122,"python","lingala");
	Book b2=new Book(123,"c","bigilu");
    System.out.println("1st book datails....");
	System.out.println(b.book_id+" "+b.author_name+ " "+ b.publication);
	System.out.println("\n2nd book details.....");
	System.out.println(b1.book_id+" "+b1.author_name+ " "+ b1.publication);
	System.out.println("\n3rd book details.....");
	System.out.println(b2.book_id+" "+b2.author_name+ " "+ b2.publication);
}    
}    

