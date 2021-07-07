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
			System.out.println(" Ad ve soyad en az iki karakterden olu�mal�d�r.Tekrar deneyiniz.. ");
			
			return false;
		}
		

		
		if (user.getMail() == null || user.getMail().length() == 0 || user.getPasswd() == null
				|| user.getPasswd().length() == 0) {
			System.out.println("mail ve �ifre bo� olamaz.Tekrar deneyiniz.. ");
			return false;
		}
		
			if (!user.getMail().matches(User.getRegex())) {
				System.out.println(" Ge�ersiz email. Tekrar deneyiniz..");
				return false;
			}
			

		if (user.getPasswd().length() != 6) {
			System.out.println("�ifre en az 6 karakter olmal�. Tekrar deneyiniz..");
			//return;

		}
	    return true;

		 if(user.isMail_flag() ==true) {
			 this.userDao.add(user);
		 }
		 else
			 System.out.println("Kullan�c� "+user.getFirstname()+" "+user.getLastname()+" eklenemedi..Mailinizin do�ru olmas� gereklidir. Bu sayede do�rulama yapman�z gereklidir. ");

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
