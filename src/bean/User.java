package bean;

public class User {
	 private int id;
	    private String userName;
	    private String password1;
	    private String email;
	    private String phone;
	    private String village;
	 
	    public User(){
	    	
	    }
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getPassword1() {
	        return password1;
	    }
	 
	    public void setPassword1(String password1) {
	        this.password1 = password1;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	    public String getPhone() {
	        return phone;
	    }
	 
	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	 
	    public String getVillage() {
	        return village;
	    }
	 
	    public void setVillage(String village) {
	        this.village = village;
	    }
}
