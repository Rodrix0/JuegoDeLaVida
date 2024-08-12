package Caja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaDeAhorroRodriTest {

	@Test
	void testDepositar() {
		CajaDeAhorroRodri caja=new CajaDeAhorroRodri();
		assert caja.saldo()==0;
	}

	@Test
	void testSaldo() {
		CajaDeAhorroRodri caja=new CajaDeAhorroRodri();
		caja.depositar(100);
		assert caja.saldo()==100;
	}

	@Test
	void testExtraer() {
		CajaDeAhorroRodri caja=new CajaDeAhorroRodri();
		caja.depositar(100);
		caja.extraer(10);
		assert caja.saldo()==90;
	}

	@Test
	public void testTitular() {
		  CajaDeAhorroRodri caja = new CajaDeAhorroRodri();	  
	      Persona persona = new Persona("Rodrigo","46543210");
		caja.setTitular(persona);
	      Persona titular=caja.getTitular();
	      assertEquals(persona,titular,"El titular debería ser Rodrigo con el documento 46543210 ");
	    }
	@Test
	public void testTitular2() {
		  CajaDeAhorroRodri caja = new CajaDeAhorroRodri();	  
	      Persona2 persona2 = new Persona2("Mavi","45543210");
		caja.setTitular2(persona2);
	      Persona2 titular2=caja.getTitular2();
	      assertEquals(persona2,titular2,"El titular debería ser Mavi con el documento 45543210 ");
	    }
	

}
