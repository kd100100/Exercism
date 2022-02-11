public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int i) {
        return 40-i;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int i) {
        return i*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int i, int j) {
        return preparationTimeInMinutes(i) + j;
    }
}
