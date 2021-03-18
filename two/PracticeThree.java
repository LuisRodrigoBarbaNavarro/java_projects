package main.java.adminuser.school.secondSemester.two;

/* Luis Rodrigo Barba Navarro */

class Person {
    
    private String name = "";
    private int age = 0;
    private String city = "";
    private String telephone = "";

    void setData(String name, int age, String city, String telephone) {

        this.name = name;
        this.age = age;
        this.city = city;
        this.telephone = telephone;

    }

    String getData() {
       return "Nombre: "+this.name+"\n"+"Edad: "+this.age+"\n"+"Ciudad: "+this.city+"\n"+"Celular: "+this.telephone;
    }

    String evaluate() {
        return this.age > 17 ? "Mayor de Edad": "Menor de Edad";
    }

}

public class PracticeThree {
    public static void main(String[] args) {

        /* Creación de Objeto de Tipo Clase */
        Person obj = new Person();

        /* Ejecución de método de carga e impresión de datos*/
        obj.setData("Rodrigo", 18, "Mexicali", "6861234567");
        System.out.println(obj.getData());
        
        /* Evaluar la Mayoria de Edad */
        System.out.println(obj.evaluate());

    }
}
