public class Fibonacci {

    static void fibonacci(int N){
        int num1 = 0, num2 = 1;
        
        for(int i = 0; i<N; i++){
            //print the number
            System.out.println(num1+ " ");
            //swap the number
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        //given number N
        int N=10;
        fibonacci(10);
    }
    
}
