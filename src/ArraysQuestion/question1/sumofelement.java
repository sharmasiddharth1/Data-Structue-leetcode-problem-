package ArraysQuestion.question1;

public class sumofelement {
    // this code is approch of solve the problem in the leet code of find the sum of two element in array which is equal to the traget
    public static void main(String[] args) {
        int [] arr = { 1 , 2, 3, 4, 5, 6, 7} ;
        int target = 13;
        int [] result = sumofelement1(arr, target);
        System.out.println(result[0] + " "  + result[1]);
    }
    public static int[] sumofelement1(int [] nums , int target){
        int len = nums.length;
        for(int i = 0 ; i< len -1 ; i++ ){
            for(int j = i+1 ; j < len ; j++ ){
                if(nums[i] + nums [j] == target){
                    int [] temp = {i , j};

                    return temp ;
                }

            }
        }
        return new int []  {} ;
    }
}
