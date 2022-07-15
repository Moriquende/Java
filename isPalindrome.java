public class Solution {
  public static Boolean isPalindrome(String text) {
      if(text.length() <= 1) {
        return true;
      }
      return (text.charAt(0) == text.charAt(text.length()-1)) && 
          isPalindrome(text.substring(1, text.length()-1));
    }
  }
