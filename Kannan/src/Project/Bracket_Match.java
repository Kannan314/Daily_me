package Project;
import java.util.*;
public class Bracket_Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        String openBrackets = "{([<";
        String closeBrackets = "})]>";
        String temp = "";

        for (char c : a.toCharArray()) {
            if (openBrackets.indexOf(c) != -1) {
                temp += c;
            } else {
                int index = closeBrackets.indexOf(c);
                if (temp.isEmpty() || openBrackets.indexOf(temp.charAt(temp.length() - 1)) != index) {
                    break;
                }
                temp = temp.substring(0, temp.length() - 1);
            }
        }
        if(temp.isEmpty())
        	System.out.println("YES");
        else
        	System.out.println("NO");
    }
}