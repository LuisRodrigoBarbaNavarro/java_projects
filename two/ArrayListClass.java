package main.java.adminuser.school.secondSemester.two;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int count = 0, index = 1;
        Scanner console = new Scanner(System.in);
        String[] space = console.nextLine().split(" ");
        while (index <= Integer.parseInt(space[1])) {
            count += index;
            index += Integer.parseInt(space[0]);
        }
        System.out.println(count);
        console.close();
    }
}
