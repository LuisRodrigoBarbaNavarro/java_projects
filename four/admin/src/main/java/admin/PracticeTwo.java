package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */

interface measurements {

    float PI = 3.14F;
    float EULER = 2.27F;

    public String getPerimeter();
    public String getArea();

}

abstract class figure implements measurements {
    
    private int sides;
    
    public figure() { }

    public figure(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public abstract void printSides();

}

class square extends figure {
    
    private double side;
    
    public square() {}

    public square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public String getPerimeter() {
        return "Perímetro del cuadrado: "+(4 * this.side);
    }

    @Override
    public String getArea() {
        return "Área del cuadrado: "+(this.side * this.side);
    }

    public void printSides() {
        System.out.println("Número de lados: "+getSides()+"\n");
    }

}

class quadrate extends figure {
    
    private double width, length;
    
    public quadrate() {}

    public quadrate(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getPerimeter() {
        return "Perímetro del rectángulo: "+((2 * width) + (2 * length));
    }

    @Override
    public String getArea() {
        return "Área del rectángulo: "+((width * length));
    }
    
    public void printSides() {
        System.out.println("Número de lados: "+getSides()+"\n");
    }

}

class circle extends figure {
    
    private double radius;
    
    public circle() {}

    public circle(double radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public String getPerimeter() {
        return "Perímetro del círculo: "+(2 * PI * radius);
    }

    @Override
    public String getArea() {
        return "Área del círculo: "+(PI * radius * radius);
    }
    
    public void printSides() {
        System.out.println("Número de lados: "+getSides()+"\n");
    }

}

class test {

    public static void main(String[] args) {
        figure figure_objSquare = new square(5.5);
        System.out.println(figure_objSquare.getPerimeter());
        System.out.println(figure_objSquare.getArea()+"\n");
        
        square square_objSquare = new square(6.5);
        square_objSquare.printSides();

        figure figure_polymorphism = square_objSquare;
        figure_polymorphism.printSides();

        square_objSquare = (square) figure_objSquare;
        figure_polymorphism.printSides();

        figure figure_objQuadrate = new quadrate(1.5, 2.5);
        System.out.println(figure_objQuadrate.getPerimeter());
        System.out.println(figure_objQuadrate.getArea());
        figure_objQuadrate.printSides();

        measurements measurements_objCircle = new circle(2.5);
        System.out.println(measurements_objCircle.getPerimeter());
        System.out.println(measurements_objCircle.getArea()+"\n");

        figure figures [] = {new square(2.5), new quadrate(2.5, 4.5), new circle(4.5)};
        
        for (figure figure : figures) {
            System.out.println(figure.getArea());
        }

    }

}
