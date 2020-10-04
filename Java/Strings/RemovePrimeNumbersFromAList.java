package easy.strings;
import java.util.*;
public class RemovePrimeNumbersFromAList {
    public static boolean isPrime(int vl){

        for(int div = 2 ; div * div <= vl ; div ++ ){

            if(vl % div == 0)
            {
                return false;
            }

        }
        return true;
    }
    public static void solution(ArrayList<Integer> al){
        // write your code here

        for(int i = al.size() - 1 ; i>=0 ;i--){
            int val = al.get(i);
            if(isPrime(val) == true){
                al.remove(i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
}
