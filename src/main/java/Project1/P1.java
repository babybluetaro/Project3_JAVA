package Project1;

public class P1 {
    //
    public static void main(String[] args) {
        int[] temp={50,45,65,60,72,79,57};
        int high = temp[0];
        int low = temp[0];
        for(int t:temp){
            if(t>high){
                high = t;
            }else if(t<low){
                low =t;
            }
        }
        System.out.println("The highest temperature for a week is "+high);
        System.out.println("The lowest temperature for a week is "+low);
    }
}
