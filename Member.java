
public class Member implements IMember {

	private String name;
	private IBook b;

	public void setB(IBook b) {
		this.b = (Book) b;
	}

	public String getName() {
		return name;
	}

	public Member() {
	}

	public Member(String name) {
		this.name = name;
	}

	public String getBookTitle() {
		if (this.b == null)
			return "no book issued";
		return this.b.getTitle();
	}

}
