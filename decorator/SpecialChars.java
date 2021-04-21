import java.util.Random;

public class SpecialChars extends PasswordDecorator {
    private Random rand;
    private static final String[] SPECIAL_CHARS = new String[]{"*", "!", "%", "+", ".", "{", "}"};

    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
        rand = new Random();
    }

    public String getPassword(){
        String password = passwordBeginning.getPassword();
        String newPassword = "";

        for(int i=0; i < password.length(); i++ ){
            if(rand.nextInt(10) > 7) {
                newPassword += Character.toString(password.charAt(i)) + SPECIAL_CHARS[rand.nextInt(SPECIAL_CHARS.length)];
            } else {
                newPassword += Character.toString(password.charAt(i));
            }
        }

        return newPassword;
    }
}