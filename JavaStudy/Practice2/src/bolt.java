
public class bolt extends Pikatyu{
	public bolt(String attack) {
		super.attack = attack;
	}
	@Override
	public void attackName() {
		System.out.println(super.attack);
	};
}
