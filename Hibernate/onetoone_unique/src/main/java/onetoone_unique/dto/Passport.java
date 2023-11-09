package onetoone_unique.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	private int id;
	private String name;
	private String date_of_issue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_of_issue() {
		return date_of_issue;
	}
	public void setDate_of_issue(String date_of_issue) {
		this.date_of_issue = date_of_issue;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", date_of_issue=" + date_of_issue + "]";
	}
	
	
}
