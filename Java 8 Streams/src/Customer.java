import java.util.List;
import java.util.Objects;

public class Customer {
	
	String name;
	String email;
	List<String> mobile;
	
	
	
	public Customer(String name, String email, List<String> mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
