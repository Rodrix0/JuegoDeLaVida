package Juego;

public class JuegoDeLaVida {
private ArrayCedula celdas;

public JuegoDeLaVida(int c1,int c2,int c3,int c4,int c5,int c6,int c7,int c8,int c9) {
	celdas=new ArrayCedula(c1,c2,c3,c4,c5,c6,c7,c8,c9);
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
	int[] nuevasCeldas=new int[9];
	for(int i=0;i<9;i++) {
		int vecinoVivo=celdas.contarVecinosVivos(i);
		nuevasCeldas[i]=siguiente(celdas.getCelda(i),vecinoVivo);//se calcula el nuevo valor y se guarda
	}
	for(int i=0;i<9;i++) {//actualizo el estado de las celdas con los nuevos valores
		celdas.setCelda(i, nuevasCeldas[i]);
	}

}
public int getCelda(int posicion) {//tengo el estado de una celda
	return celdas.getCelda(posicion);
}
public int setCelda(int posicion,int valor) {//establece en una posicion
	celdas.setCelda(posicion, valor);
	return valor;//decuelve el nuevo valor
}
}
