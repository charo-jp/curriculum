package interfaces;
// インターフェイスの宣言
public interface OrderFromMotoki {
	//インターフェイスの基本的なアクセス修飾詞はpublic.　また、インターフェイスを実装するにはimplementsを用いる。
	 // 司令（月末までに勤務表出せや！
	public void daseyaKinmuhyo();
	
	// 司令（できれば月末までに交通費出せや！
	public void daseyaKotsuhi();
	
	// お邪魔虫な司令
    // 例）セブンイレブン行けや！
	public void goToSevenEleven();
}
