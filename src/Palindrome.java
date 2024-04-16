public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s){
        String cleanedS = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();

        return cleanedS.equals(new StringBuilder(cleanedS).reverse().toString());
    }
}
