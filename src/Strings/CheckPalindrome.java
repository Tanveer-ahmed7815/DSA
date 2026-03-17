package Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "c1 0$d@eeD o1c";

        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                sb = sb.append(c);
            }
        }

        String checkPalindrome = sb.toString();
        StringBuilder reverse = sb.reverse();

        System.out.println(checkPalindrome);
        System.out.println(reverse);
        System.out.println(checkPalindrome.equalsIgnoreCase(reverse.toString()));
    }
}
