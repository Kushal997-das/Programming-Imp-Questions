package easy.strings;
import java.util.*;

public class PalindromicSubstrings {
    //checking for the palindrome
    public static boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length() -1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
 //printing the al the substrings
    public static void solution(String str){
        //write your code here
        for(int i = 0; i<str.length() ; i++)
        {
            for(int j = i+1 ; j<=str.length() ; j++)
            {
                String ss = str.substring(i,j);
                if(isPalindrome(ss) == true)
                {
                    System.out.println(ss);
                }

            }
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
