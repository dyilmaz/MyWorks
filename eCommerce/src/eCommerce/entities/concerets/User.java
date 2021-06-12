package eCommerce.entities.concerets;

public class User {
 
	private String firstname; 
	private String lastname;
	private String mail;
	private String passwd;
	private static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	private boolean  mail_flag;
	
	public User() {

	}	
	
	
	public User(String firstname, String lastname, String mail, String passwd) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.passwd = passwd;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public static String getRegex() {
		return regex;
	}


	public boolean isMail_flag() {
		return mail_flag;
	}
	
	
	public void setMail_flag(boolean mail_flag) {
		this.mail_flag = mail_flag;
	}

	
	
}
