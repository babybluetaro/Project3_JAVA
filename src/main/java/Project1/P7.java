package Project1;

public class P7 {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34 fibonacci series
        int[] fibo =new int[10];

        for (int i=0; i<10;i++){
            if (i<=1) {
                fibo[i]=i;
                System.out.println(fibo[i]);
            }else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
                System.out.println(fibo[i]);
            }
        }
    }
}
