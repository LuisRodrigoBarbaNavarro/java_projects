package admin; /* Luis Rodrigo Barba Navarro*/
import java.util.Scanner;

class WeightLimitExceeded extends Exception {
    WeightLimitExceeded (int x) {
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}

class Main {
    static void validWeight(int weight) throws WeightLimitExceeded{
        if(weight>15)
            throw new WeightLimitExceeded(weight);
        else
            System.out.println("You are ready to fly!");
    }
    
      public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        for (int i=0;i<2;i++) {
            try {
                validWeight(console.nextInt());
            } catch (WeightLimitExceeded e) {
                System.out.println(e);
            }
        }
        console.close();
	}
}