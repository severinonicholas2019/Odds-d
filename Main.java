import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int pos = 0;
        int neg = 0;
        int side = 6;
        int totside = 3;
        double ex =totside/side ;

        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(6) + 1;
            if (num % 2 == 0) {
                pos++;
            }
            else {
                neg++;
            }
        }
        double con = neg *100 / 100000.0;
        System.out.println("Scenario 1: Using a single 6-sided die, what is the probability of rolling an odd number?\nExpected Outcome: "+ex+"\nCount of True: "+neg+"\nCount of False: "+pos+"\nCondition Reached: "+con+"\n");






        pos = 0;
        neg = 0;
        ex = 0.7;
        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(10) + 1;
            if ((num > 5) || (num % 2 == 0)) {
                pos++;
            }
            else {
                neg++;
            }
        }
        con = pos *100/ 100000.0;
        System.out.println("\nScenario 2: Using a single 10-sided die, what is the probability of rolling an even number, or a number over 5?\nExpected Outcome:"+ex+"\nCount of True: "+pos+"\nCount of False: "+neg+"\nCondition Reached: "+con+"\n");






        pos = 0;
        neg = 0;
        ex = 0.25;
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                pos++;
            }
            else {
                neg++;
            }
        }
        con = pos *100/ 100000.0;
        System.out.println("\nScenario 3: Using a single 6-sided die, what is the probability of rolling an even number on the first roll, and an odd number on\n" + "the second roll?\nExpected Outcome: "+ex+"\nCount of True: "+pos+"\nCount of False: "+con+"\nCondition Reached: "+con+"\n");




        pos = 0;
        neg = 0;
        ex = (1 /27.0);
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            if ((roll1 > 3) && (roll2 > 2 && roll2 < 5) && (roll3 > 4)) {
                pos++;
            }
            else {
                neg++;
            }
        }
        con = pos *100/ 100000.0;
        System.out.println("\nScenario 4: Using a single 6-sided die, what is the probability of rolling a 1 or 2 on the first roll, a 3 or 4 on the second roll, and a 5 or 6 on the last roll?\nExpected Outcome: "+ex+"\nCount of True: "+pos+"\nCount of False: "+neg+"\nCondition Reached: "+con+"\n");







        pos = 0;
        neg = 0;
        ex = (10/36.0);
        for (int i = 0; i < 100000; i++) {

            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;

            if ((roll1 != roll2 && roll1 != roll3 && roll1 != roll4) && (roll2 != roll3 && roll2 != roll4) && (roll3 != roll4)) {
                pos++;
            }
            else {
                neg++;
            }
        }
        con = pos *100/ 100000.0;
        System.out.println("\nScenario 5: Using a 6-sided die, what is the probability of rolling the die four times and getting a unique number each time,\nExpected Outcome: "+ex+"\nCount of True: "+pos+"\nCount of False: "+con+"\nCondition Reached: "+con+"\n");
    }
}
