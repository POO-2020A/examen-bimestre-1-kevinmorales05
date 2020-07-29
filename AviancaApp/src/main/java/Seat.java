/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevde
 */
public class Seat {
    private Passager pasager;
    private int row;
    private int col;

    //constructor
    public Seat(int fila, int columna) {
        //filas menor que 20 y columnas menor que 8
        if ((fila <= 20 && fila > 0) && (columna <= 8 && columna > 0)) {
            this.row = fila;
            this.col = columna;
        }

    }

    //metodos getters y setters
    public void setRows(int fila) {
        this.row = fila;
    }

    public void setCols(int columna) {
        this.col = columna;
    }

    public int getCols() {
        return this.col;
    }

    public int getRows() {
        return this.row;
    }
    
    //metodos 
    public boolean isFree(int fila, int columna){
       
        
        
        return false;
    }
    
    public String toString(){
    
        
        
    return " ";
    }
     public void equals(){
    
    //instancia de seat es igual a instancia con columnas y filas iguales
    }
    
    
    
    
    
    
    
}
