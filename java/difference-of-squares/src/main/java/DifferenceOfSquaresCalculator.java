class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((input * (input+1))/2, 2);
    }

    int computeSumOfSquaresTo(int input) {
        return (input * (input+1) * (2 * input + 1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        int res =  computeSumOfSquaresTo(input) - computeSquareOfSumTo(input);
        if (res < 0) res*=-1;
        return res;
    }

}
