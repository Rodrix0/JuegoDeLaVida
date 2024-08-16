package Juego;

public class JuegoDeLaVida {
	public int c1;
	public int c2;
	public int c3;
	public int c4;
	public int c5;
	public int c6;
	public int c7;
	public int c8;
	public int c9;
	public JuegoDeLaVida(int c1, int c2, int c3, int c4, int c5, int c6, int c7, int c8, int c9) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.c7 = c7;
		this.c8 = c8;
		this.c9 = c9;
	}

public int siguiente(int celda,int vecinoVivo) {
	if(celda==1) {//cedula viva
		if(vecinoVivo==2||vecinoVivo==3) {
			return 1;//sigue viva
		}
		else {
			return 0;//muere
		}
	}else {
		if(vecinoVivo==3) {
			return 1;//revive
		}else {
			return 0;//sigue muerta
		}
}
	
}
public void siguienteVecino() {
	int nuevaC1=siguiente(c1,c2+c4+c5);
	int nuevaC2=siguiente(c2,c1+c4+c5+c3+c6);
	int nuevaC3=siguiente(c3,c2+c6+c5);
	int nuevaC4=siguiente(c4,c2+c1+c5+c7+c8);
	int nuevaC5=siguiente(c5,c2+c4+c1+c3+c6+c7+c8+c9);
	int nuevaC6=siguiente(c6,c2+c3+c5+c8+c9);
	int nuevaC7=siguiente(c7,c8+c4+c5);
	int nuevaC8=siguiente(c8,c6+c4+c5+c7+c9);
	int nuevaC9=siguiente(c9,c8+c6+c5);

	
	c1=nuevaC1;
	c2=nuevaC2;
	c3=nuevaC3;
	c4=nuevaC4;
	c5=nuevaC5;
	c6=nuevaC6;
	c7=nuevaC7;
	c8=nuevaC8;
	c9=nuevaC9;
	






}
}
