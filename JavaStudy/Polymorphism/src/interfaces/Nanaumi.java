package interfaces;

public class Nanaumi implements OrderFromMotoki, OrderFromShihandai {
	String name;
	String date;

	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}
	private void submitOrder (final int shoriFlg) {
		String nameAnd = name + " ";
		if (shoriFlg == 0) {
			System.out.println(nameAnd + date + "の勤務表出しました。");
		} else if (shoriFlg == 1) {
			System.out.println(nameAnd + date + "の交通費も出しました。");
		} else {
			System.out.println(nameAnd + "本当はまだ何も出してません。");
		}
	}

	public void doNothing() {
		submitOrder(-1);
	}

	@Override
	public void daseyaKinmuhyo() {
		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		System.out.println("先にセブン行くね");
	}
	
	@Override
	public String doCreateJavaCurriculum() {
		return "Javaカリキュラム完成しました";
	}

	public static void main(String[] args) {
		Nanaumi nanaumi = new Nanaumi("七海", "2019/03");
		nanaumi.daseyaKinmuhyo();
		nanaumi.daseyaKotsuhi();
		nanaumi.doNothing();
		nanaumi.goToSevenEleven();
		
		final String message = nanaumi.doCreateJavaCurriculum();
		System.out.println("message = " + message);
	}
}
