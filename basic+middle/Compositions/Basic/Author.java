package basic;

public class Author {//task 1
	
	//part 1a
	private String name;
	private String adress;
	
	public Author(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
