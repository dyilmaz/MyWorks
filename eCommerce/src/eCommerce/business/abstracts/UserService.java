package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concerets.User;


public interface UserService {

	void  control(User user);
	void  add(User user);
	List<User> getAll();
	
	
	
}
