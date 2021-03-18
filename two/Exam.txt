import java.util.Scanner;

class Persona {

    private String Nombre = "";
    private int Edad = 0;
    private String Sexo = "H";
    private double Peso = 0.0;
    private double Altura = 0.0;

    public Persona () { }

    public Persona (String Nombre, int Edad, String Sexo) { 

        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;

    }

    public Persona (String Nombre, int Edad, String Sexo, double Peso, double Altura) { 

        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;

    }

    public int Calcular_IMC () {

        double Resultado = this.Peso / (this.Altura * this.Altura);
        if (!(this.Altura == 0.0 && this.Peso == 0.0)) {
            if (Resultado < 20) {
                return -1;
            } else if (Resultado >= 20 && Resultado <= 25) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 2;
        }

    }

    public String EnviarMensaje () {

        int Mensaje = Calcular_IMC();
        
        if (Mensaje == -1) {
            return "Peso ideal";
        } else if (Mensaje == 0) {
            return "Debajo de su peso ideal";
        } else if (Mensaje == 1) {
            return "Tiene sobrepeso";
        } else {
            return "No se introdujo los datos";
        }

    }

    public boolean esMayorDeEdad() {
        return this.Edad > 17 ? true : false;
    }

    public void ComprobarSexo(String Sexo) {

        if (Sexo == "H" || Sexo == "M") {
            this.Sexo = Sexo;
        } else {
            this.Sexo = "H";
        }

    }
    
    public String toString() {
        return "Nombre: "+this.Nombre+"\n"+
               "Edad: "+this.Edad+"\n"+
               "Sexo: "+this.Sexo+"\n"+
               "Peso: "+this.Peso+"\n"+
               "Altura: "+this.Altura+"\n";
    }

    public void set_Nombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void set_Edad(int Edad) {
        this.Edad = Edad;
    }

    public void set_Sexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void set_Peso(double Peso) {
        this.Peso = Peso;
    }

    public void set_Altura(double Altura) {
        this.Altura = Altura;
    }

}

public class Exam {

    public static void main(String[] args) {

        Scanner Consola = new Scanner(System.in);
        
        String Nombre = Consola.nextLine();
        int Edad = Consola.nextInt();
        String Sexo = Consola.next();
        double Peso = Consola.nextDouble();
        double Altura = Consola.nextDouble();
        
        Persona Objeto_1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        Persona Objeto_2 = new Persona(Nombre, Edad, Sexo);
        Persona Objeto_3 = new Persona();
        
        Objeto_3.set_Nombre("Rodrigo");
        Objeto_3.set_Edad(18);
        Objeto_3.set_Sexo("H");
        Objeto_3.set_Peso(52.5);
        Objeto_3.set_Altura(1.87);

        System.out.println("Objeto_1, su IMC marca: "+Objeto_1.EnviarMensaje());
        System.out.println("Objeto_2, su IMC marca: "+Objeto_2.EnviarMensaje());
        System.out.println("Objeto_3, su IMC marca: "+Objeto_3.EnviarMensaje());

        System.out.println("Objeto_1 es Mayor de Edad: "+String.valueOf(Objeto_1.esMayorDeEdad()));
        System.out.println("Objeto_2 es Mayor de Edad: "+String.valueOf(Objeto_2.esMayorDeEdad()));
        System.out.println("Objeto_3 es Mayor de Edad: "+String.valueOf(Objeto_3.esMayorDeEdad()));

        System.out.println(Objeto_1.toString() + "\n");
        System.out.println(Objeto_2.toString() + "\n");
        System.out.println(Objeto_3.toString() + "\n");

        Consola.close();
    }

}

