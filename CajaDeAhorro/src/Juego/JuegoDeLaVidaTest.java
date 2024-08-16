package Juego;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JuegoDeLaVidaTest {

	@Test
	public void test_cedula_vivas() {
		JuegoDeLaVida juego=new JuegoDeLaVida(1,0,0,0,1,0,0,0,1);
		assertEquals(1,juego.c1);
		assertEquals(1,juego.c5);//verificar que vive
		assertEquals(1,juego.c9);
		juego.siguienteVecino();
		assertEquals(0,juego.c1);
		assertEquals(1,juego.c5);
		assertEquals(0,juego.c9);



	}
	@Test
	public void next_turno() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0,0,0,0,1,0,0,0,0);
		assertEquals(1,juego.c5);//verificar que vive
		juego.siguienteVecino();
		assertEquals(0,juego.c5);
	
	}
	@Test
	 void test_cedula_viva_con_dos_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(1, 2);
		assertEquals(1,resultado);
		

	}
	@Test
	 void test_cedula_viva_con_tres_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(1, 3);
		assertEquals(1,resultado);
		

	}
	@Test
	 void test_cedula_con_menos_de_dos_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(1, 1);
		assertEquals(0,resultado);
		

	}
	@Test
	 void test_cedula_viva_con_mas_tres_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(1, 4);
		assertEquals(0,resultado);
		

	}
	@Test
	 void test_cedula_muerta_con_tres_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(0, 3);
		assertEquals(1,resultado);
		

	}
	@Test
	 void test_cedula_muerta_con_menos_tres_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(0, 2);
		assertEquals(0,resultado);
		

	}
	@Test
	 void test_cedula_muerta_con_mas_tres_vecinos_vivos() {
		JuegoDeLaVida juego=new JuegoDeLaVida(0, 0, 0, 0, 0, 0, 0, 0, 0);
		int resultado=juego.siguiente(0, 4);
		assertEquals(0,resultado);
		

	}
	

}
