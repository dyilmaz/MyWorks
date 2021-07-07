package eCommerce.business.concrete;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concerets.User;


public class UserManager implements UserService {

	
	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}



	@Override
	private boolean control(User user) {


		if (user.getFirstname().length() <= 2 || user.getLastname().length() <= 2) {
			System.out.println(" Ad ve soyad en az iki karakterden oluþmalýdýr.Tekrar deneyiniz.. ");
			
			return false;
		}
		

		
		if (user.getMail() == null || user.getMail().length() == 0 || user.getPasswd() == null
				|| user.getPasswd().length() == 0) {
			System.out.println("mail ve þifre boþ olamaz.Tekrar deneyiniz.. ");
			return false;
		}
		
			if (!user.getMail().matches(User.getRegex())) {
				System.out.println(" Geçersiz email. Tekrar deneyiniz..");
				return false;
			}
			

		if (user.getPasswd().length() != 6) {
			System.out.println("Þifre en az 6 karakter olmalý. Tekrar deneyiniz..");
			//return;

		}
	    return true;

		 if(user.isMail_flag() ==true) {
			 this.userDao.add(user);
		 }
		 else
			 System.out.println("Kullanýcý "+user.getFirstname()+" "+user.getLastname()+" eklenemedi..Mailinizin doðru olmasý gereklidir. Bu sayede doðrulama yapmanýz gereklidir. ");

	}

	@Override
	public List<User> getAll() {
		return null;
	}



	@Override
	public void add(User user) {

		
		if(control(user))
		{
			
			 this.userDao.add(user);
		}		
	}

}
