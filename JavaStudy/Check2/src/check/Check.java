package check;
import constants.Constants;

public class Check {
	private static String firstName = "祐哉";
	private static String lastName ="芳地";
	
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → "+lastName+firstName);
	}
	
	public static void main(String[] args) {
		printName(firstName, lastName);
		Pet my_Pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		my_Pet.introduce();
		RobotPet my_Robot = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		my_Robot.introduce();
	}
}
