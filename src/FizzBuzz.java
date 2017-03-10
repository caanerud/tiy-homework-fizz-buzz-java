/**
 * Created by chrisaanerud on 3/9/17.
 */
/* The doIt() method should print all of the numbers from start to end. However:
        For multiples of three print "Fizz" instead of the number.
        For multiples of five print "Buzz".
        For numbers which are multiples of both three and five print "FizzBuzz".
        Create a Main class with a main() method.
        In the main() method create an instance of the FizzBuzz class.
        Invoke the doIt() method. Pass 1 for the start argument and 100 for the end argument.*/

public class FizzBuzz {
    public void doIt(int start, int end){
        String fizz = "Fizz";
        String buzz = "Buzz";
        for(int i = start; i <= end; i ++){
            if ((i % 3) == 0 && (i % 5 == 0)){
                System.out.println(fizz + buzz);
            }
            else if(i % 3 == 0){
                System.out.println(fizz);
                continue;
            }

            else if(i % 5 == 0){
                System.out.println(buzz);
            }

            else{
                System.out.println(i);
            }
        }
    }
}
