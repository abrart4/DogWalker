import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DogWalkCompany c = new DogWalkCompany();
        System.out.println(c);
        int hour = c.addDogs();
        System.out.println(c);
        DogWalker w = new DogWalker(4, c);
        System.out.println(w.walkDogs(hour) + " dogs walked.");
        System.out.println(c.numAvailableDogs(hour) + " dogs remaining.");
        hour = c.addDogs();
        System.out.println(c);
        w = new DogWalker(3, c);
        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned");

        int money = read();
        System.out.println("$" + money + " made across a lot of companies and a whole lot of walkers!");
    }

    public static int read() throws FileNotFoundException {
        int money = 0;
        DogWalkCompany[] companies = new DogWalkCompany[1000];
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);
        int index = 0;
        while (s.hasNextLine()) {
            int[] dogs = new int[24];
            for (int i = 0; i < dogs.length; i ++) {
                dogs[i] = s.nextInt();
            }
            companies[index] = new DogWalkCompany(dogs);
            index ++;
        }
        DogWalker[] walkers = new DogWalker[(int) Math.pow(10, 4)];
        f = new File("Walkers.txt");
        s = new Scanner(f);
        index = 0;
        while (s.hasNextLine()) {
            int dogs = s.nextInt();
            DogWalkCompany company = companies[s.nextInt()];
            walkers[index] = new DogWalker(dogs, company);
            money += walkers[index].dogWalkShift(s.nextInt(), s.nextInt());
            index ++;
        }
        return money;
    }
}
