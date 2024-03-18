package Project1;

public class P8 {
    public static void main(String[] args) {
        int [][] nums ={
                {1,2,3,4,5},
                {6,9,8,9,-10}
        };
        int max = nums[1][1];
        int min = nums[1][1];
        for (int i=0;i<2;i++){
            for (int j=0;j<5;j++){

                if(nums[i][j]>=max){
                    max = nums[i][j];
                }else if (nums[i][j]<=min){
                    min = nums[i][j];
                }
                }
            }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }
}
