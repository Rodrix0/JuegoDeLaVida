package Juego;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JuegoDeLaVidaTest {

	@Test
	public void test_cedula_vivas() {
		JuegoDeLaVida juego=new JuegoDeLaVida(1,0,0,0,1,0,0,0,1);
		assertEquals(1,juego.getCelda(0));//se verifica que esten vivos
		assertEquals(1,juego.getCelda(4));
		assertEquals(1,juego.getCelda(8));
		juego.siguienteVecino();//siguiente paso del juego
		assertEquals(0,juego.getCelda(0));
		assertEquals(1,juego.getCelda(4));//se verifica su nuevo estado
		assertEquals(0,juego.getCelda(8));

	}
	@Test
	public void next_turno() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0,0,0,0,1,0,0,0,0);
		assertEquals(1,juego.getCelda(4));//verificar que vive
		juego.siguienteVecino();
		assertEquals(0,juego.getCelda(4));
	
	}
	
}
