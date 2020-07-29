import java.util.Arrays;
public class Plane {

    private Seat seats;
    private int rows;
    private int cols;
    private int[][] Seats = new int[rows][cols];//arreglo necesario
    
    //constructor
    public Plane(int filas, int columnas) {
        //filas menor que 20 y columnas menor que 8
        
        if ((filas <= 20 && filas > 0) && (columnas <= 8 && columnas > 0)) {
            //int[][] arregloAvion = new int[filas][columnas];
            this.rows = filas;
            this.cols = columnas;
            this.Seats = 
        }

    }

    //metodos
    public void setRows(int fila) {
        this.rows = fila;
    }

    public void setCols(int columna) {
        this.cols = columna;
    }

    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.rows;
    }
    //pendiente el mapa
    public String toString(int filas, int columnas){
        String mapa="";
        
       
        char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'};
        for (int i =0; i< filas; i++){
            for(int j = 0; j < columnas; j++){
                mapa = mapa + letras[j];
                
            }
            String linea = i+ " "+ mapa + "\n";
        } 
        
     
        return mapa;
    }

}
