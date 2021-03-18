package main.java.adminuser.school.secondSemester.two;

/* Luis Rodrigo Barba Navarro */

class Employee {
    
    String name = "";
    double salary = 0.0;

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return this.name;
    } 

    double getSalary() {
        return this.salary;
    }
    
    String setTaxes() {
        return this.salary > 3000 ? "Pagar Impuestos: Si": "Pagar Impuestos: No";
    }

}

public class PracticeOne {
    public static void main(String[] args) {
        
        /* Creación de Objeto de Tipo Clase */
        Employee obj = new Employee();
        
        /* Carga de Atributos */
        obj.setName("Rodrigo");
        obj.setSalary(3000);
        
        /* Impresión de Datos */
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        System.out.println(obj.setTaxes());
    }
}

