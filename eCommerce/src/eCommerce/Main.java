package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concrete.UserManager;
import eCommerce.dataAccess.concerets.AbcUserDao;
import eCommerce.entities.concerets.User;

public class Main {

	public static void main(String[] args) {	
		
		
		UserService userService= new UserManager(new AbcUserDao());
	    User user = new User("Derya","AKYÜZ","dyilmaz@engineer.com","123456");
        userService.control(user);


	}

}




