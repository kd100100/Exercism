/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private static int a, b, c;
    private static int max, sum;
    private static List<PythagoreanTriplet> list = new ArrayList<>();
    private static PythagoreanTriplet obj = new PythagoreanTriplet();

    public PythagoreanTriplet (int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public PythagoreanTriplet() {

    }

    public static PythagoreanTriplet makeTripletsList() {
        return obj;
    }

    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int maxip) {
        max = maxip;
        return obj;
    }

    public static PythagoreanTriplet thatSumTo(int sumip) {
        sum = sumip;
        return obj;
    }

    public static List<PythagoreanTriplet> build() {
        list = new ArrayList<>();
        for (int i = 1; i < sum; i++) {
            for (int j = i; j < sum; j++) {
                int k = sum - i - j;
                if (i*i + j*j == k*k) {
                    a = i;
                    b = j;
                    c = k;
                    list.add(new PythagoreanTriplet(j, i, k));
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        return list;
    }

    @Override
    public boolean equals(Object obj1) {
        PythagoreanTriplet expected = (PythagoreanTriplet) obj1;

        if (expected.a == this.a && expected.b == this.b && expected.c == this.c) {
            return true;
        }
        return false;
    }

}