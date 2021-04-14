package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */

interface interfaceImpresion  {
    public void imprimir();
}

interface interfaceImpresion2 {
    public void imprimirBonito();
}

class itfNeutro implements interfaceImpresion, interfaceImpresion2 {
    public void imprimir() {
        System.out.println("Las olas del mar");
    }
    public void imprimirBonito() {
        imprimir();
    }
}

class itfPositivoImpresion implements interfaceImpresion {
    public void imprimir() {
        System.out.println("Que buen tiempo hace");
    }
}

class itfNegativoImpresion  implements interfaceImpresion {
    public void imprimir() {
        System.out.println("Odio los lunes");
    }
}

class ItfPrueba {
    public static void main(String[] args) {
        interfaceImpresion interfaceImpresion_obj1itfPositivoImpresion = new itfPositivoImpresion();
        interfaceImpresion interfaceImpresion_obj2itfNegativoImpresion = new itfNegativoImpresion();
        interfaceImpresion interfaceImpresion_obj3itfNeutro = new itfNeutro();

        interfaceImpresion_obj1itfPositivoImpresion.imprimir();
        interfaceImpresion_obj2itfNegativoImpresion.imprimir();
        interfaceImpresion_obj3itfNeutro.imprimir();

        interfaceImpresion2 interfaceImpresion2_obj1itfNeutro = new itfNeutro();
        interfaceImpresion2_obj1itfNeutro.imprimirBonito();

        itfPositivoImpresion itfPositivoImpresion_obj1 = new itfPositivoImpresion();
        itfNegativoImpresion itfNegativoImpresion_obj2 = new itfNegativoImpresion();
        itfNeutro itfNeutro_obj3 = new itfNeutro();

        itfPositivoImpresion_obj1.imprimir();
        itfNegativoImpresion_obj2.imprimir();
        itfNeutro_obj3.imprimir();
        itfNeutro_obj3.imprimirBonito();
    }
}