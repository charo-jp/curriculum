package abstracts;

//メイン: 研修生クラス
public class TraineeMain {

public static void main(String[] args) {
	//サブクラス1でインスタンスを生成
	PolimoSuper polimo1 = new PolimoSub1();
	polimo1.call();
	//サブクラス2でインスタンスを生成
	PolimoSuper polimo2 = new PolimoSub2();
	polimo2.call();
}
}