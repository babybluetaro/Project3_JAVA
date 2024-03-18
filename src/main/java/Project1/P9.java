package Project1;
public class P9 {
    public static void main(String[] args) {
        int[][] nums={
                {1,200,3,40,5},
                {6,7,80,90,10}
        };
        int largest = nums[0][0];
        int large2 =nums[0][0];
        for (int i=0;i<2;i++){
            for (int j=0;j<5;j++){
                if (nums[i][j]>largest){
                    large2=largest;
                    largest=nums[i][j];
                }else if(nums[i][j]>large2){
                    large2=nums[i][j];
                }
            }
        }
        System.out.println("The second largest number in array is "+large2);
    }
}
