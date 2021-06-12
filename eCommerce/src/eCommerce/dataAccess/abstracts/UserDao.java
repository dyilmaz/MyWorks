package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concerets.User;

public interface UserDao {
	
	
	void  control(User user);
	void add(User user);
}
