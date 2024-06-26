import java.util.Random;

public class Javautility {
	public int getRandomNum() {
		Random ran = new Random();
		 int r = ran.nextInt(100);
		 return r;
	}

}
