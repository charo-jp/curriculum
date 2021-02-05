package practice1;

import java.util.ResourceBundle;

public class ResourceMain {
	public static void main (String args[]) {
		// 6行目はプロパティファイルの読み込み。
		ResourceBundle bundle = ResourceBundle.getBundle("test");
		String value = bundle.getString("name");
		System.out.println(value);
	}
}