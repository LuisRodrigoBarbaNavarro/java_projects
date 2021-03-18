package admin; /* LUIS RODRIGO BARBA NAVARRO - 20490687 */
class product {

    private int id;
    private String expiration_date;
    
    public product(int id, String expiration_date) {
        this.id = id;
        this.expiration_date = expiration_date;
    }

    public int get_id() {
        return id;
    }

    public String get_expiration_date() {
        return expiration_date;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public void set_expiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

}

class fresh_product extends product {

    private String packing_date;
    private String country_origin;

    public fresh_product(int id, String expiration_date, String packing_date, String country_origin) {
        super(id, expiration_date);
        
        this.packing_date = packing_date;
        this.country_origin = country_origin;
    }

    public String get_packing_date() {
        return packing_date;
    }

    public String get_country_origin() {
        return country_origin;
    }

    public void set_packing_date(String packing_date) {
        this.packing_date = packing_date;
    }

    public void set_country_origin(String country_origin) {
        this.country_origin = country_origin;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Fecha de envasado: "+packing_date+"\n"+
        "País de origen: "+country_origin+"\n");
    }

}

class refrigerated_product extends product {

    private int agency_code;
    private String packing_date;
    private double maintenance_temperature;
    private String country_origin;

    public refrigerated_product(int id, String expiration_date, int agency_code, String packing_date, double maintenance_temperature, String country_origin) {
        super(id, expiration_date);
        
        this.agency_code = agency_code;
        this.packing_date = packing_date;
        this.maintenance_temperature = maintenance_temperature;
        this.country_origin = country_origin;
    }

    public int get_agency_code() {
        return agency_code;
    }

    public String get_packing_date() {
        return packing_date;
    }

    public double get_maintenance_temperature() {
        return maintenance_temperature;
    }

    public String get_country_origin() {
        return country_origin;
    }

    public void agency_code(int agency_code) {
        this.agency_code = agency_code;
    }

    public void set_packing_date(String packing_date) {
        this.packing_date = packing_date;
    }

    public void set_maintenance_temperature(double maintenance_temperature) {
        this.maintenance_temperature = maintenance_temperature;
    }

    public void set_country_origin(String country_origin) {
        this.country_origin = country_origin;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Código del organismo de supervisión alimentaria: #"+agency_code+"\n"+
        "Fecha de envasado: "+packing_date+"\n"+
        "Temperatura de mantenimiento recomendada: "+maintenance_temperature+" °C"+"\n"+
        "País de origen: "+country_origin+"\n");
    }
    
}

class frozen_product extends product {

    private String packing_date;
    private String country_origin;
    private double maintenance_temperature; 

    public frozen_product(int id, String expiration_date, String packing_date, String country_origin, double maintenance_temperature) {
        super(id, expiration_date);
        
        this.packing_date = packing_date;
        this.country_origin = country_origin;
        this.maintenance_temperature = maintenance_temperature;
    }

    public String get_packing_date() {
        return packing_date;
    }

    public String get_country_origin() {
        return country_origin;
    }

    public double get_maintenance_temperature() {
        return maintenance_temperature;
    }

    public void set_packing_date(String packing_date) {
        this.packing_date = packing_date;
    }

    public void set_country_origin(String country_origin) {
        this.country_origin = country_origin;
    }

    public void set_maintenance_temperature(double maintenance_temperature) {
        this.maintenance_temperature = maintenance_temperature;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Fecha de envasado: "+packing_date+"\n"+
        "País de origen: "+country_origin+"\n"+
        "Temperatura de mantenimiento recomendada: "+maintenance_temperature+" °C"+"\n");
    }
    
}

class air_frozen_product extends frozen_product {

    private int nitrogen;
    private int oxygen;
    private int carbon_dioxide;
    private int water_steam;

    public air_frozen_product(int id, String expiration_date, String packing_date, String country_origin, double maintenance_temperature, int nitrogen, int oxygen, int carbon_dioxide, int water_steam) {
        super(id, expiration_date, packing_date, country_origin, maintenance_temperature);
        
        this.nitrogen = nitrogen;
        this.oxygen = oxygen;
        this.carbon_dioxide = carbon_dioxide;
        this.water_steam = water_steam;
    }

    public int get_nitrogen() {
        return nitrogen;
    }

    public int get_oxygen() {
        return oxygen;
    }

    public int get_carbon_dioxide() {
        return carbon_dioxide;
    }

    public int get_water_steam() {
        return water_steam;
    }

    public void set_nitrogen(int nitrogen) {
        this.nitrogen = nitrogen;
    }
    
    public void set_oxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public void set_carbon_dioxide(int carbon_dioxide) {
        this.carbon_dioxide = carbon_dioxide;
    }

    public void set_water_steam(int water_steam) {
        this.water_steam = water_steam;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Fecha de envasado: "+get_packing_date()+"\n"+
        "País de origen: "+get_country_origin()+"\n"+
        "Temperatura de mantenimiento recomendada: "+get_maintenance_temperature()+" °C"+"\n"+
        "% de nitrógeno: "+nitrogen+"%"+"\n"+
        "% de oxígeno: "+oxygen+"%"+"\n"+
        "% de dióxido de carbono: "+carbon_dioxide+"%"+"\n"+
        "% de vapor de agua: "+water_steam+"%"+"\n");
    }
}

class water_frozen_product extends frozen_product {

    private double salinity;

    public water_frozen_product(int id, String expiration_date, String packing_date, String country_origin, double maintenance_temperature, double salinity) {
        super(id, expiration_date, packing_date, country_origin, maintenance_temperature);

        this.salinity = salinity;
    }

    public double get_salinity() {
        return salinity;
    }

    public void set_salinity(double salinity) {
        this.salinity = salinity;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Fecha de envasado: "+get_packing_date()+"\n"+
        "País de origen: "+get_country_origin()+"\n"+
        "Temperatura de mantenimiento recomendada: "+get_maintenance_temperature()+" °C"+"\n"+
        "Salinidad del agua: "+salinity+"gr/lt"+"\n");
    }
    
}

class nitrogen_frozen_product extends frozen_product {

    private String method;
    private int exhibithion_time;

    public nitrogen_frozen_product(int id, String expiration_date, String packing_date, String country_origin, double maintenance_temperature, String method, int exhibithion_time) {
        super(id, expiration_date, packing_date, country_origin, maintenance_temperature);

        this.method = method;
        this.exhibithion_time = exhibithion_time;
    }

    public String get_method() {
        return method;
    }

    public int get_exhibithion_time() {
        return exhibithion_time;
    }

    public void set_method(String method) {
        this.method = method;
    }

    public void set_exhibithion_time(int exhibithion_time) {
        this.exhibithion_time = exhibithion_time;
    }

    public void print() {
        System.out.println("Número de lote: #"+get_id()+"\n"+
        "Fecha de caducidad: "+get_expiration_date()+"\n"+
        "Fecha de envasado: "+get_packing_date()+"\n"+
        "País de origen: "+get_country_origin()+"\n"+
        "Temperatura de mantenimiento recomendada: "+get_maintenance_temperature()+" °C"+"\n"+
        "Método de congelación empleado :"+method+"\n"+
        "Tiempo de exposición al nitrógeno :"+exhibithion_time+" segundos"+"\n");
    }
    
}

class inheritance_test {

    public static void main(String[] args) {
       
        fresh_product fresh_product_obj1 = new fresh_product(1, "16/05/21", "16/02/21", "Argentina");
        fresh_product fresh_product_obj2 = new fresh_product(2, "21/08/21", "13/06/21", "Bolivia");

        refrigerated_product refrigerated_product_obj1 = new refrigerated_product(3, "15/02/21", 152162, "15/01/21", 22.5, "México");
        refrigerated_product refrigerated_product_obj2 = new refrigerated_product(4, "05/02/21", 152158, "15/01/21", 27.5, "México");
        refrigerated_product refrigerated_product_obj3 = new refrigerated_product(5, "15/02/21", 152148, "16/01/21", 13.5, "México");

        air_frozen_product air_frozen_product_obj1 = new air_frozen_product(6, "19/09/21", "19/05/21", "Colombia", 1.5, 95, 45, 12, 16);
        air_frozen_product air_frozen_product_obj2 = new air_frozen_product(7, "19/07/21", "29/05/21", "Colombia", 1.5, 75, 22, 18, 16);

        water_frozen_product water_frozen_product_obj1 = new water_frozen_product(8, "15/06/21", "16/03/21", "Venezuela", 2.9, 25.6);
        water_frozen_product water_frozen_product_obj2 = new water_frozen_product(9, "21/02/21", "16/01/21", "Venezuela", 2.7, 15.6);

        nitrogen_frozen_product nitrogen_frozen_product_obj1 = new nitrogen_frozen_product(10, "31/07/21", "11/02/21", "Brasil", 0.2, "RHA-1", 26);

        fresh_product_obj1.print();
        fresh_product_obj2.print();

        refrigerated_product_obj1.print();
        refrigerated_product_obj2.print();
        refrigerated_product_obj3.print();

        air_frozen_product_obj1.print();
        air_frozen_product_obj2.print();

        water_frozen_product_obj1.print();
        water_frozen_product_obj2.print();

        nitrogen_frozen_product_obj1.print();

    }

}
