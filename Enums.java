package fc1;

enum Carrito {
    PERA(39), MANZANA(20), FRESA(47), NARANJA(26), DURAZNO(50);
    double precio; // Atributo

    Carrito(double p) { // Constructor
        this.precio = p;
    }

    double getPrice() { // metodo
        return precio;
    }
}

class Enums{
    public static void main(String args[]) {                
        for (Carrito i: Carrito.values()) {
            System.out.println(i + " precio: " + i.getPrice());
        }
    }
}
