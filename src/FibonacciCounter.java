public class FibonacciCounter {

    //Attribute
    public static long numberOne=0;
    public static long numberTwo=1;
    public static long numberThree=0;
    public static boolean initialCount = true;

    /**
     * Prints out the Fibonacci Numbers in a recursive manner
     * @param counter determines the length of the call
     */
    public static void printFibonacci(int counter){
        if(counter >= 0){
            if(initialCount){
                System.out.println(0);
                System.out.println(1);
                initialCount = false;
            }
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            System.out.println(numberThree);
            //recursive call
            printFibonacci(counter-1);
        }
    }

}
