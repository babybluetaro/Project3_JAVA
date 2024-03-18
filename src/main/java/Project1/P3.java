package Project1;

public class P3 {
    public static void main(String[] args) {

        int[][] nums ={
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        for (int i=0;i<2;i++){
            for (int j=0;j<5;j++){
                if (nums[i][j]%2==0){
                    System.out.println(nums[i][j]);
                }
            }
        }
    }
}
