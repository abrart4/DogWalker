public class Main {
    public static void main(String[] args) {
        /* appears at the beginning, scroll up in terminal */
        System.out.println("----- AP test case -----");
        DogWalkCompany testCompany = new DogWalkCompany();
        testCompany.setNumAvaliableDogs(7, 3);
        testCompany.setNumAvaliableDogs(8, 2);
        testCompany.setNumAvaliableDogs(9, 2);
        testCompany.setNumAvaliableDogs(10, 3);
        DogWalker testWalker = new DogWalker(3, testCompany);
        int testAmountForHour7 = testWalker.dogWalkShift(7, 7);
        int testAmountForHour8 = testWalker.dogWalkShift(8, 8);
        int testAmountForHour9 = testWalker.dogWalkShift(9, 9);
        int testAmountForHour10 = testWalker.dogWalkShift(10, 10);
        int testAmountTotal = testAmountForHour7 + testAmountForHour8 + testAmountForHour9 + testAmountForHour10;
        System.out.println("- Max dogs of walker: 3");
        System.out.println("- Dogs available:");
        System.out.println("  - Hour 7: 3");
        System.out.println("  - Hour 8: 2");
        System.out.println("  - Hour 9: 2");
        System.out.println("  - Hour 10: 3");
        System.out.println("* Amount earned:");
        System.out.println("  * Hour 7: $" + testAmountForHour7);
        System.out.println("  * Hour 8: $" + testAmountForHour8);
        System.out.println("  * Hour 9: $" + testAmountForHour9);
        System.out.println("  * Hour 10: $" + testAmountForHour10);
        System.out.println("  ** Total: $" + testAmountTotal);
        System.out.println("------------------");

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
    }
}
