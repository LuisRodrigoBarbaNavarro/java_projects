package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
class employee {
    
    private String name;

    public employee() {}

    public employee(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String to_string() {
        return "Empleado: "+name;
    }

}

class operator extends employee {
    
    public operator(String name) {
        super(name);
    }

    public String to_string() {
        return "Empleado: "+get_name()+" -> Operario";
    }
    
}

class director extends employee {
    
    public director(String name) {
        super(name);
    }

    public String to_string() {
        return "Empleado: "+get_name()+" -> Directivo";
    }
    
}

class official extends operator {
    
    public official(String name) {
        super(name);
    }

    public String to_string() {
        return "Empleado: "+get_name()+" -> Operario -> Oficial";
    }
    
}

class technical extends operator {
    
    public technical(String name) {
        super(name);
    }

    public String to_string() {
        return "Empleado: "+get_name()+" -> Operario -> Tecnico";
    }
    
}

public class PracticeThree {

    public static void main(String[] args) {

        employee E1 = new employee("Rafa");
        director D1 = new director("Mario");
        operator OP1 = new operator("Alfonso");
        official OF1 = new official("Luis");
        technical T1 = new technical("Pablo");

        System.out.println(E1.to_string());
        System.out.println(D1.to_string());
        System.out.println(OP1.to_string());
        System.out.println(OF1.to_string());
        System.out.println(T1.to_string());

    }
}
