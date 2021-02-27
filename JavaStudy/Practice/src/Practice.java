import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.*;

public class Practice {
	public static void main(String[] args){
	    Pattern charo = Pattern.compile("[aiueo]{2}");
        String string ="beautifulcharowaan";
        Matcher matcher = charo.matcher(string);
        int doublevowels = 0;
        while (matcher.find()){
            doublevowels++;
        }
        System.out.println(doublevowels);
    }
}
