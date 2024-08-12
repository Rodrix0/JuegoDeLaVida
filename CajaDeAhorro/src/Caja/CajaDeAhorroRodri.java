package Caja;
import java.util.Scanner;
public class CajaDeAhorroRodri {
	private int saldo;
	private static Persona titular;
	private static Persona2 titular2;

	public void depositar(int monto) {
		saldo+=monto;
		
	}
	public int saldo() {
		return saldo;
	}
	public int extraer(int monto) {
		if(saldo<monto) {
			throw new RuntimeException("Saldo insuficiente");
		}
	
	saldo-=monto;
	return saldo;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
	    CajaDeAhorroRodri.titular = titular;
	
	}
	public Persona2 getTitular2() {
		return titular2;
	}
	public void setTitular2(Persona2 titular2) {
	    CajaDeAhorroRodri.titular2 = titular2;
	
	}
	public static void main(String[]args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bienvenido Ingrese su nombre y DNI");
			String usuario=scanner.nextLine();
			while(true) {
				if(usuario.equals(titular.getDocumento())&&usuario.equals(titular.getNombre())) {
					System.out.println("Bienvenido " + titular.getNombre());
					System.out.println("Elija la opcion que desea");
					System.out.println("1.ver estado de cuenta");
					System.out.println("2.Depositar dinero");
					System.out.println("3.Extraer dinero");
					System.out.println("4.Salir");
					try (Scanner scanner1 = new Scanner(System.in)) {
						int opcion=scanner1.nextInt();
						if(opcion==1) {
	                        System.out.println("Saldo actual: " + titular.saldo());
	  
						
						}
					}	
					
				}else if(usuario.equals(titular2.getDocumento())&&usuario.equals(titular2.getNombre())) {
					System.out.println("Bienvenido " + titular2.getNombre());
			}else {
				System.out.println("DNI no encontrado. Intente nuevamente.");
			    usuario = scanner.nextLine();
			}
			
}
		}
		
	}
}