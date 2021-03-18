package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
class animal {

    private String name, type_feeding;
    private int age;

    public animal(String name, String type_feeding, int age) {
        this.name = name;
        this.type_feeding = type_feeding;
        this.age = age;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_type_feeding() {
        return type_feeding;
    }

    public void set_type_feeding(String type_feeding) {
        this.type_feeding = type_feeding;
    }

    public int get_age() {
        return age;
    }

    public void set_age(int age) {
        this.age = age;
    }
}

class dog extends animal {

    String race;

    public dog(String name, String type_feeding, int age, String race) {
        super(name, type_feeding, age);
        this.race = race;
    }

    public String get_race() {
        return race;
    }

    public void set_race(String race) {
        this.race = race;
    }

    public void show() {
        System.out.println(get_name()+"\n"+
        get_type_feeding()+"\n"+
        get_age()+"\n"+
        get_race()+"\n");
    }

}

class cat extends animal {

    String race;

    public cat(String name, String type_feeding, int age, String race) {
        super(name, type_feeding, age);
        this.race = race;
    }

    public String get_race() {
        return race;
    }

    public void set_race(String race) {
        this.race = race;
    }

    public void show() {
        System.out.println(get_name()+"\n"+
        get_type_feeding()+"\n"+
        get_age()+"\n"+
        get_race()+"\n");
    }
    
}

class horse extends animal {

    String race;

    public horse(String name, String type_feeding, int age, String race) {
        super(name, type_feeding, age);
        this.race = race;
    }

    public String get_race() {
        return race;
    }

    public void set_race(String race) {
        this.race = race;
    }

    public void show() {
        System.out.println(get_name()+"\n"+
        get_type_feeding()+"\n"+
        get_age()+"\n"+
        get_race()+"\n");
    }
    
}

public class PracticeTwo {
    public static void main(String[] args) {

        dog dog = new dog("Tommy","Ganador",9,"Chihuahua");
        cat cat = new cat("Anabele","Whiskas",7,"Siames");
        horse horse = new horse("Polaco","Paja",12,"Fino");

        dog.show();
        cat.show();
        horse.show();
        
    }
}