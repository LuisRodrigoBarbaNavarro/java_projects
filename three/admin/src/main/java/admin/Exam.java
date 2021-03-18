package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
class vehiculo {

    private String color;
    private int numero_ruedas;
    private String cilindros;
    private String potencia;

    public vehiculo() { }

    public vehiculo(String color, int numero_ruedas, String cilindros, String potencia) {
        this.color = color;
        this.numero_ruedas = numero_ruedas;
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public String get_color() {
        return this.color;
    }

    public int get_numero_ruedas() {
        return this.numero_ruedas;
    }

    public String get_cilindros() {
        return this.cilindros;
    }

    public String get_potencia() {
        return this.potencia;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public void set_numero_ruedas(int numero_ruedas) {
        this.numero_ruedas = numero_ruedas;
    }

    public void set_cilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public void set_potencia(String potencia) {
        this.potencia = potencia;
    }

}

class camion extends vehiculo {
    
    private int numero_ejes;

    public camion() { }

    public camion(String color, int numero_ruedas, String cilindros, String potencia, int numero_ejes) {
        super(color, numero_ruedas, cilindros, potencia);
        this.numero_ejes = numero_ejes;
    }

    public int get_numero_ejes() {
        return this.numero_ejes;
    }

    public void set_numero_ejes(int numero_ejes) {
        this.numero_ejes = numero_ejes;
    }

    public void mostrar_propiedades() {
        System.out.println("Tipo: Camión"+"\n"
        +"Color: "+get_color()+"\n"
        +"Número de ruedas: "+get_numero_ruedas()+"\n"
        +"Número de cilindros: "+get_cilindros()+"\n"
        +"Potencia: "+get_potencia()+"\n"
        +"Número de ejes: "+this.numero_ejes+"\n");
    }

}

class motocicleta extends vehiculo {
    
    private int numero_ocupantes;

    public motocicleta() { }

    public motocicleta(String color, int numero_ruedas, String cilindros, String potencia, int numero_ocupantes) {
        super(color, numero_ruedas, cilindros, potencia);
        this.numero_ocupantes = numero_ocupantes;
    }

    public int get_numero_ocupantes() {
        return this.numero_ocupantes;
    }

    public void set_numero_ocupantes(int numero_ocupantes) {
        this.numero_ocupantes = numero_ocupantes;
    }

    public void mostrar_propiedades() {
        System.out.println("Tipo: Motocicleta"+"\n"
        +"Color: "+get_color()+"\n"
        +"Número de ruedas: "+get_numero_ruedas()+"\n"
        +"Número de cilindros: "+get_cilindros()+"\n"
        +"Potencia: "+get_potencia()+"\n"
        +"Número de ocupantes: "+this.numero_ocupantes+"\n");
    }

}

class prueba_vehiculo {

    public static void main(String[] args) {
        camion camion_1 = new camion();
        camion camion_2 = new camion("Azul", 4, "4V", "100 CV", 2);

        camion_1.set_color("Rojo");
        camion_1.set_numero_ruedas(4);
        camion_1.set_cilindros("8V");
        camion_1.set_potencia("120 CV");
        camion_1.set_numero_ejes(2);

        motocicleta motocicleta_1 = new motocicleta();
        motocicleta motocicleta_2 = new motocicleta("Verde", 2, "4V", "100 CV", 1);

        motocicleta_1.set_color("Amarillo");
        motocicleta_1.set_numero_ruedas(2);
        motocicleta_1.set_cilindros("4V");
        motocicleta_1.set_potencia("100 CV");
        motocicleta_1.set_numero_ocupantes(2);

        camion_1.mostrar_propiedades();
        camion_2.mostrar_propiedades();

        motocicleta_1.mostrar_propiedades();
        motocicleta_2.mostrar_propiedades();
    }

}
