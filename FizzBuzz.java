/*
* Title: Fizzbuzz 
* Author: Jason Landers
* Description:
*     A program that prints numbers from 1 to 100. Multiples of
*     three print "Fizz" (instead of the number) and multiples of five
*     print "Buzz". Numbers which are multiples of both three and five 
*     will print "FizzBuzz".
*/

public class FizzBuzz{

    public static void main(String args[]){
        for (int i = 1; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
