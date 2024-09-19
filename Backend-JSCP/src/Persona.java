public class Persona {
    private String nombre;
    private int edad;
//METODO CONSTRUCTOR
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
//METODO GET
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }

//METODO SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
