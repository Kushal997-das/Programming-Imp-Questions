package easy.patterns;

public class PatternFive {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for( int i = 0; i<n ; i++){
            int count = 1;
            for(int j = 0; j<=i ;j++){
                System.out.print(count+"	");
                int val = count * (i - j)/ (j + 1);
                count =val;
            }
            System.out.println();
           
        }

    }
}
