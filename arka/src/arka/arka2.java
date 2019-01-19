package arka;

public class arka2 {
	public static boolean is_username_valid(String username){
		boolean user;
		if (!(username.matches(".*[a-z].*")&&username.matches(".*[_].*")&&username.length()==8)) {
				user = false;
				System.out.println(user);
			}else{
				user = true;
				System.out.println(user);
			}
			return user;
		}	

	public static boolean is_password_valid(String password){											
		boolean pass;
		if (!(password.matches(".*[a-z].*")&&password.matches(".*[A-Z].*")&&password.matches(".*[0-9].*")&&password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*")&&password.length()==8)) {
				pass = false;
				System.out.println(pass);
			}else{
				pass = true;
				System.out.println(pass);
			}
			return pass;
	}

	public static void main(String[] args) {
		is_username_valid("_jakarta");
		is_password_valid("L_aisd91");
	}

}
