package lekce_jedna;

public class Lightning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float time=5.2f;
		float speed = 330;
		boolean iAMSafe;
		float distance = speed * time;
		
		if(distance > 1000) {
			iAMSafe = true;
		}else{
			iAMSafe = false;
		}
	}
}
