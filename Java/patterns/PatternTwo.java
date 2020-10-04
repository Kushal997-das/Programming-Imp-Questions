package easy.patterns;
import java.util.*;
public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i<5 ;i++){
            for (int j = n ;j >i ;j--){
                System.out.print("* "+"\t");
            }
            System.out.println();
        }
    }
}
