package paquete;

public class Clase1 {
    
    private int atributo1;
    private int atributo2;

    public Clase1(int atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int getAtributo1() {
        return this.atributo1;
    }

    public int getAtributo2() {
        return this.atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }
    
    public int sumaAtributos() {
        return this.atributo1 + this.atributo2;
    }
    
    public void mostrarAtributos() {
        System.out.println("Atributo 1: " + this.atributo1);
        System.out.println("Atributo 2: " + this.atributo2);
    }
    
    public void mostrarSuma() {
        System.out.println("Suma: " + this.sumaAtributos());
    }
}
