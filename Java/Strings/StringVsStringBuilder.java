package easy.strings;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        long start = System.currentTimeMillis();
        /**String s ="";
         for (int i = 0 ;i <n ; i++){
            s += i;
         }
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i< n;i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
