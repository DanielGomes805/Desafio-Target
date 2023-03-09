import java.util.Scanner;

public class Fibonacci 
{
	public Fibonacci()
	{
		Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();
        
        int fib1 = 0, fib2 = 1, soma;
        boolean pertence = false;
        
        while (fib2 <= num) 
        {
            if (num == fib2) 
            {
                pertence = true;
            }
            
            soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
        }
        
        if (pertence) 
        {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } 
        else 
        {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
	}
}
