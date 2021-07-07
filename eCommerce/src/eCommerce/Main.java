package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concrete.UserManager;
import eCommerce.dataAccess.concerets.AbcUserDao;
import eCommerce.entities.concerets.User;

public class Main {

	public static void main(String[] args) {	
		
		
		UserService userService= new UserManager(new AbcUserDao());
	    User user = new User("test","test","test@gmail.com","123456");
        userService.add(user);


	}

}




