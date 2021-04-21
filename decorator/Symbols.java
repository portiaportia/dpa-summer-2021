public class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
    }
    
    public String getPassword(){
        String password = passwordBeginning.getPassword();
        password = password.replace("a","@");
        password = password.replace("b","8");
        password = password.replace("e","3");
        password = password.replace("g","9");
        password = password.replace("i","!");
        password = password.replace("o","0");
        password = password.replace("s","$");
        password = password.replace("t","7");

        return password;
    }
}