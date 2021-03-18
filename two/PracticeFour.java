package main.java.adminuser.school.secondSemester.two;

/* Luis Rodrigo Barba Navarro */

class Car {

    private int passengers;
    private int capacity;
    private int milles_per_gallon;

    Car() {/* Constructor por Defecto */}

    Car(int passengers, int capacity, int milles_per_gallon) {
        this.passengers = passengers;
        this.capacity = capacity;
        this.milles_per_gallon = milles_per_gallon;
    }

    void set_passenger(int passengers) {
        this.passengers = passengers;
    }

    void set_capacity(int capacity) {
        this.capacity = capacity;
    }

    void set_milles(int milles_per_gallon) {
        this.milles_per_gallon = milles_per_gallon;
    }
    
    int get_passenger() {
        return passengers;
    }

    int get_capacity() {
        return capacity;
    }

    int get_milles() {
        return milles_per_gallon;
    }

    int calculate_range() {
        return this.capacity * this.milles_per_gallon;
    }

    int range() {
        return calculate_range();
    }
}

class Trial {
    public static void main(String[] args) {

        //Instancia de dos objetos.
        Car minivan = new Car();
        Car toyota = new Car(4,4,5);

        //Asignar valores a los campos del objeto 'minivan'.
        minivan.set_passenger(4);
        minivan.set_capacity(128);
        minivan.set_milles(240);

        //Calcular el rango en millas de ambos objetos.
        int minivan_range = minivan.range();
        int toyota_range = toyota.range();

        //Impresión de los datos.
        System.out.println("Recursos de MiniVan:\n"+
        "Pasajeros: "+minivan.get_passenger()+"\n"+
        "Capacidad: "+minivan.get_capacity()+"\n"+
        "Millas Por Galón: "+minivan.get_milles()+"\n"+
        "Rango: "+minivan_range);

        System.out.println("\nRecursos de Toyota:\n"+
        "Pasajeros: "+toyota.get_passenger()+"\n"+
        "Capacidad: "+toyota.get_capacity()+"\n"+
        "Millas Por Galón: "+toyota.get_milles()+"\n"+
        "Rango: "+toyota_range);

    }
}
