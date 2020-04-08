public class UserValidation {

    private static final String PASSWORD_REGEX ="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}" ;
    private static final String NAME_REGEX="^[A-Z]{1}[a-z]{2,}$";

    public boolean validateUserName(String userName){ return userName.matches(NAME_REGEX);}

    public boolean validateUserPassword(String userPassword) { return userPassword.matches(PASSWORD_REGEX); }
}
