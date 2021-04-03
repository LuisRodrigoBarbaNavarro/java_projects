package admin;
import java.util.Scanner;
class ExerciseOne {
    static String EvenNumber(int w) { 
        return (w % 2 == 0) ? "SI" : "NO";
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int w = console.nextInt();
        System.out.println(EvenNumber(w));
        console.close();
    }
}
