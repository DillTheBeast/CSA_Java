import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String end = "";
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ';' && str.charAt(i) != '@' && str.charAt(i) != '!') {
                end += str.charAt(i);
            }
            if(arr[i] == 'j') {
                
            }
        }
        System.out.println(end);
    }
}
