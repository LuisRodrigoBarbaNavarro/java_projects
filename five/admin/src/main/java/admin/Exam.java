package admin; /* Luis Rodrigo Barba Navarro - 20490687 */

class exceptionMedia extends Exception {

    public exceptionMedia () {
        super("Error: Declaración de Array.");
    }

    public exceptionMedia (String error) {
        super(error);
    }

}

class prueba {

    public static double calculaMedia () throws exceptionMedia {
        double p [] = {1.9, 1.2, 1.2, 9.2, 9.7};
        double m;
        try {
            /* Ya que el tamaño del array se excede, nos saltará un error de tipo exceptionMedia */
            m = average(p, 6);
            return m;
        } catch (exceptionMedia e) {
            //TODO: handle exception
            System.out.println(e);
            return average(p, p.length);
        } finally {
            System.out.println("Proceso terminado...");
        }
    }

    static double average (double array [], int size) throws exceptionMedia {
        double count = 0.0;
        try {
            if (size > array.length) throw new exceptionMedia("Error: Tamaño de Array Excedido.");
            for (int i = 0; i < size; i++) {
                count += array[i];
            }
            count /= size;
        } catch (exceptionMedia e) {
            System.out.println(e);
        }
        return count;
    }
    public static void main(String[] args) throws exceptionMedia {
        System.out.println(calculaMedia());
    }

}