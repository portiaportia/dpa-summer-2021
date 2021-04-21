import java.util.Random;

public class RandomCasing extends PasswordDecorator {
    private Random rand;

    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
        rand = new Random();
    }

    public String getPassword(){
        String password = passwordBeginning.getPassword();
        String newPassword = "";

        for(int i=0; i < password.length(); i++ ){
            if(rand.nextBoolean()) {
                newPassword += (Character.toString(password.charAt(i))).toLowerCase();
            } else {
                newPassword += (Character.toString(password.charAt(i))).toUpperCase();
            }
        }

        return newPassword;
    }
}