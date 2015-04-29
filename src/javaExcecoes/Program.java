package javaExcecoes;

public class Program {
	
	public static void main(String[] args) {
		
		int x = 1,
			y = 0;
		double resultado = 0;
		
		try 
		{
			resultado = x/y;
			
			System.out.println("Resultado try: " + resultado);
			
		} catch (java.lang.ArithmeticException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getSuppressed());
		}
		
		System.out.println("Resultado após try-catch: " + resultado);
	
	}

}
