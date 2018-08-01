
public class Book implements IBook {
	
	private String title;
	private String memberName;

	public String getTitle() {
		return title;
	}

	public void Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public void issueBook(IMember m) {
		memberName = m.getName();
		m.setB(this);
	}

	public void returnBook(IMember m) {
		this.memberName = "";
		m.setB(null);
	}

	public String getMember() {
		if (this.memberName == "")
			return "nobody issued";
		return this.memberName;
	}
}
