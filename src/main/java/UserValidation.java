public class UserValidation {
    private String NAME_REGEX="^[A-Z]{1}[a-z]{2,}$";
    public boolean validateUserName(String userName){ return userName.matches(NAME_REGEX);}
}
