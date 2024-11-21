package Project;
import java.util.*;
public class Bracket_Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        System.out.println(isBalanced(input) ? "YES" : "NO");
    }

    public static boolean isBalanced(String str) {
        String openBrackets = "{([<";
        String closeBrackets = "})]>";
        String temp = "";

        for (char c : str.toCharArray()) {
            if (openBrackets.indexOf(c) != -1) {
                temp += c;
            } else {
                int index = closeBrackets.indexOf(c);
                if (temp.isEmpty() || openBrackets.indexOf(temp.charAt(temp.length() - 1)) != index) {
                    return false;
                }
                temp = temp.substring(0, temp.length() - 1);
            }
        }
        return temp.isEmpty();
    }
}