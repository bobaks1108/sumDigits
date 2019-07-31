public class Main {

    public static int sumDigitsUsingWhileLoop(int number) {
        if (number < 10 ) {
            return number;
        }
        int sum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10; 
            sum += digit; 
            number /= 10; 
        }
        return sum;
    }

     public static int sumDigitsUsingRecursion(int number) {
         if (number < 10 ) {
             return number;
         }
         int digit;
         digit = number % 10; 
         return digit + sumDigitsUsingRecursion(number /= 10);
     }
    
     public static void main(String[] args) {
        System.out.println(sumDigitsUsingWhileLoop(1233)); 
        System.out.println(sumDigitsUsingWhileLoop(212128979)); 
        System.out.println(sumDigitsUsingRecursion(1233)); 
        System.out.println(sumDigitsUsingRecursion(212128979))
    }
}
