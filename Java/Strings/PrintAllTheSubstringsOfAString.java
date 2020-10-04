package easy.strings;

import java.util.Scanner;

public class PrintAllTheSubstringsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int i = 0;
        for(i = 0 ; i<len;i++){
            for (int j = i+1 ; j <=len ; j++){
                String s = str.substring(i,j);
                System.out.print(s +"\t");
            }
            System.out.println();
        }
    }
}
