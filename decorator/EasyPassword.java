import java.util.Random;

public class EasyPassword extends Password {
    private Random rand = new Random();
    
    public EasyPassword(String phrase) {
        rand = new Random();
        this.password = compressWhiteSpace(phrase) + rand.nextInt(100);
    }

	public String getPassword() {
		return password;
	}

    public String compressWhiteSpace(String phrase){
        return phrase.replaceAll("\\s+","");
    }

}
