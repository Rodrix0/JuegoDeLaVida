package Juego;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JuegoDeLaVidaTest {

	@Test
	public void una_cedula_viva() {
		JuegoDeLaVida juego=new JuegoDeLaVida();
		juego.setC1(1);
		juego.setC2(0);
		juego.setC3(0);
		juego.setC4(1);
		juego.setC5(1);
		juego.setC6(0);
		juego.setC7(0);
		juego.setC8(0);
		juego.setC9(1);
		
		assertEquals(3,juego.setC1(0));
		
		
	}
	@Test
	public void una_cedula_viva_next_Turn() {
		JuegoDeLaVida juego=new JuegoDeLaVida();
		juego.setC1(1);
		juego.setC2(0);
		juego.setC3(0);
		juego.setC4(1);
		juego.setC5(1);
		juego.setC6(0);
		juego.setC7(0);
		juego.setC8(0);
		juego.setC9(1);
		
		assertEquals(6,juego.setC1(0));
		
		
	}
	@Test
	public void automatico_vida() {
		JuegoDeLaVida juego=new JuegoDeLaVida();
		juego.
		
		
	}
	
	

}
