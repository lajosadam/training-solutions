package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username){
        return !username.equals("");
    }

    public boolean isValidPassword(String password1, String password2){
        return password1.equals(password2) && password1.length() == 7;
    }

    public boolean isValidEmail(String email){
        int kukac = email.indexOf("@", 0);
        int pont = email.indexOf(".", 0);

        return  kukac > 1 && kukac < email.length() || pont < kukac && pont < email.length();
    }

}
