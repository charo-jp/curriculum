
public class denkou extends Pikatyu{
	public denkou(String attack) {
		super.attack = attack;
	}
	@Override
	public void attackName() {
		System.out.println(super.attack);
	};
}