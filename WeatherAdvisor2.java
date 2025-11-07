import java.util.Scanner;
public class WeatherAdvisor2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita un numero para el Rango a usar para nuestro juego FizzBuzzBoom: ");
        int Rango = scanner.nextInt();

        
        for (int i= 1; i<= Rango; i++) {
        
        if(i % 3 ==0 && i % 5 ==0 && i % 7 ==0) {
            System.out.println("FizzBuzzBoom");
        } else if (i % 3 ==0) {
            System.out.println("Fizz");
        } else if (i % 5 ==0) {
            System.out.println("Buzz");
        } else if (i % 7 ==0) {
            System.out.println("Boom");
        }else {
            System.out.println(i);
        }
        
    }
    }
    

    
}
