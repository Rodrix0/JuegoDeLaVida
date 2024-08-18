package Juego;

public class ArrayCedula {
	private int[] celdas;
	public ArrayCedula(int c1,int c2,int c3,int c4,int c5,int c6,int c7,int c8,int c9) {
		celdas=new int[] {c1,c2,c3,c4,c5,c6,c7,c8,c9};//inicicalizo y paso los valores como parametros
	}
	public int getCelda(int posicion) {
		return celdas[posicion];//metodo para obtener el valor de una celda espec
	}
	public void setCelda(int posicion,int valor) {
		celdas[posicion]=valor;
	}
	public int contarVecinosVivos(int index) {
	    int vivos = 0;

	    // Defino la posicion de los vecinos
	    int[][] vecinosPos = {
	        {1, 3, 4},        // Vecinos de la celda 1
	        {0, 2, 3, 4, 5},  // Vecinos de la celda 2
	        {1, 4, 5},        // Vecinos de la celda 3
	        {0, 1, 4, 6, 7},  // Vecinos de la celda 4
	        {0, 1, 2, 3, 5, 6, 7, 8}, // Vecinos de la celda 5
	        {1, 2, 4, 7, 8},  // Vecinos de la celda 6
	        {3, 4, 7},        // Vecinos de la celda 7
	        {3, 4, 5, 6, 8},  // Vecinos de la celda 8
	        {4, 5, 7}         // Vecinos de la celda 9
	    };

	    // Contar los vecinos vivos
	    for (int pos : vecinosPos[index]) {
	        vivos += celdas[pos];
	    }

	    return vivos;
	}
}
