package jsp.dto;

public class Client {
	
	private int id;
	private String name;
	private String mobile;
	
	
	
	public Client( int id, String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	
	
	public Client(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
