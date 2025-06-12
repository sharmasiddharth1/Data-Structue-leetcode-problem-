package Pelindrome;

public class question9 {
    public static void main(String args[]) {
        int x = 1112 ;
        System.out.println(" Is this number is " + x +  " is palindrome ? "  + isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        if( x < 0 ){
            return false ;
        }
        int sum = 0 ;
        int y  = x ;
        while( y>0){
            sum = sum * 10 + ( y %10 );
            y = y /10 ;
        }
        return sum == x ;
    }
}
