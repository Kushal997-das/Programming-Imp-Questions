package easy.patterns;
import java.util.*;
public class PatternOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i<n;i++){
            for(int j =0;j<=i; j++){
                System.out.print('*'+"\t");
            }
            System.out.println();
        }

    }
}
