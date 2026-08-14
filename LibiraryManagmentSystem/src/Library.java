import java.util.ArrayList;

public class Library {
   private ArrayList<Book> books = new ArrayList<>();
   private ArrayList<Member> members = new ArrayList<>();

   public void addbook(Book book){
       books.add(book);
       System.out.println("Book added Successfully");
   }

   public void showBooks(){
       System.out.println("\nID | Title | Author | Status");

       for(Book book:books){
           book.displayBook();
       }
    }
   public void addMember(Member member){
       members.add(member);
       System.out.println("Member added Successfully");

   }

   public void showMembers(){
       System.out.println("\nID | Name ");
       for (Member member:members){
           member.displayMember();
       }
   }
   public void issueBook(Book book){
       for(Book book : books)
   }
}
