
public class TestBookandMember {
	public static void main(String[] args) {

		IBook alc=new Book("Alchemist");
		IMember m=new Member("abc");
		alc.issueBook(m);
		System.out.println(m.getBookTitle());
		System.out.println(alc.getMember());
		alc.returnBook(m);
		System.out.println(alc.getMember());
		System.out.println(m.getBookTitle());
		
	}
}
