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

    public int restaAtributos() {
        return this.atributo1 - this.atributo2;
    }

    public int multiplicacionAtributos() {
        return this.atributo1 * this.atributo2;
    }

    public int sumaAtributos() {
        return this.atributo1 + this.atributo2;
    }
    
    public void resetearAtributo1() {
        this.atributo1 = 0;
    }
    
    public void resetearAtributo2() {
        this.atributo2 = 0;
    }

    public void mostrarAtributos() {
        System.out.println("El atributo 1 es: " + this.atributo1);
        System.out.println("El atributo 2 es: " + this.atributo2);
    }

    public void mostrarSuma() {
        System.out.println("La suma es: " + this.sumaAtributos());
    }

    public void mostrarResta() {
        System.out.println("Resta: " + this.restaAtributos());
    }

    public void mostrarMultiplicación() {
        System.out.println("Multiplicación: " + this.restaAtributos());
    }
}
