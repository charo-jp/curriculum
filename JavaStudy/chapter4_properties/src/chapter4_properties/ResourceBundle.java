import java.util.ResourceBundle;

public class ResourceBundle {
	 public static void main(String args[]) {
		 ResourceBundle bundle = ResourceBundle.getBundle("任意のファイル名（拡張子なし）");
		 String value = bundle.getString("任意のキー");
		 System.out.println(value);
		 }
}
