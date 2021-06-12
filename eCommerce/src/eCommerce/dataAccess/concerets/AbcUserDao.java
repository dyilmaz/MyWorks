package eCommerce.dataAccess.concerets;

import  eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concerets.User;

public class AbcUserDao implements UserDao{

	@Override
	public void add(User user) {
	 
		System.out.println("Sisteme kayýt oldun...."+user.getFirstname()+" "+user.getLastname());
		
	}

	@Override
	public void control(User user) {
		
		
	}

	
	
}
