package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
class mammal {

    private int legs;
    private String name;
    
    public mammal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public void set_legs(int legs) {
        this.legs = legs;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int get_legs() {
        return legs;
    }

    public String get_name() {
        return name;
    }

    public void print_legs() {
        System.out.println("no. de patas: "+legs);
    }

}

class dog_mammal extends mammal {

    public dog_mammal(String name) {
        super(4, name);
    }

}

class cat_mammal extends mammal {

    public cat_mammal(String name) {
        super(4, name);
    }

}

class trial_mammal {
    public static void main(String[] args) {

        mammal mapache = new mammal(4, "Mapache");
        dog_mammal perro = new dog_mammal("Spencer");
        cat_mammal gato = new cat_mammal("Frank");

        System.out.println(mapache.get_name());
        mapache.print_legs();

        System.out.println(perro.get_name());
        perro.print_legs();

        System.out.println(gato.get_name());
        gato.print_legs();

    }
}
