
public interface IBook {
	public String getMember();
	public void issueBook(IMember m);
	public void returnBook(IMember m);
	public String getTitle();
}
