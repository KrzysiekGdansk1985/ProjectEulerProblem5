/*
Smallest multiple

Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class EulerProblem5 {
    public static void main(String[] args){
        int x = 20;
        int [] tab = new int[x+1];

        for (int i = 0; i <= x; i++) {
            tab[i] = i;
        }

        for (int i = 2; i < x; i++) {
            for (int j = (i + 1); j <= x; j++) {
                if ((tab[j] % tab[i]) == 0) tab[j]/=tab[i];
            }
        }

        int nww = 1;

        for (int i = 1; i <= x ; i++) {
            nww *= tab[i];
        }

        System.out.println("The smallest positive number that is evenly divisible ");
        System.out.println("by all of the numbers from 1 to " + x + " is " + nww);
    }
}
