package adminuser.school.secondSemester.two;

/* Luis Rodrigo Barba Navarro */

class Operations {

    int a, b;

    void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void sum() {
        System.out.println(a + b);
    }

    void subtraction() {
        System.out.println(a - b);
    }

    void multiplication() {
        System.out.println(a * b);
    }

    void division() {
        System.out.println(a / b);
    }

}

public class PracticeTwo {

    public static void main(String[] args) {

        /* Creación de Objeto de Tipo Clase */
        Operations obj = new Operations();

        /* Carga de Datos */
        
        obj.setValues(10, 5);

        /* Ejecución de Método */
        obj.sum();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        
    }

}
