package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
abstract class shape {

    private int sides;
    
    public shape() { }

    public shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public double obtainArea();
    abstract public double obtainPerimeter();

}

class rectangle extends shape {

    private double width;
    private double height;

    public rectangle(int sides, double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public double obtainArea() {
        return width * height;
    }

    public double obtainPerimeter() {
        return (2 * width) + (2 * height);
    }

}

class trial {
    
    public static void main(String[] args) {
        rectangle obj1 = new rectangle(4, 2.5, 4.5);
        System.out.println("Área del rectángulo: "+obj1.obtainArea());
        System.out.println("Perímetro del rectángulo: "+obj1.obtainPerimeter());
    }

}