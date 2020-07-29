
public class Passager {

    private String name;
    private String lastName;

    public Passager(String nombre, String apellido) {
        this.name = nombre;
        this.name = apellido;
    }

    //metodos
    public String toString() {

        return this.name + " " + this.lastName;
    }
    
    public boolean equals(Passager pasajero){
       
        //ver si una instancia equals es igual a otra, si tienen los mismos nombres
        
        ///falta esto
        return false;
    
    }
    
    //getters y setters
    public void setName(String nome){
        this.name = nome;
    }
    public void setLastName(String sobreNome){
        this.lastName = sobreNome;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
}
