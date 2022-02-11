class Darts {

    int sc = 0;

    boolean check(double x, double y, int limit) {
        double distance = Math.pow(x*x + y*y, 0.5);
        if (distance <= limit) return true;
        else return false;
    }

    Darts(double x, double y) {
        if (check(x, y, 1)) sc = 10;
        else if (check(x, y, 5)) sc = 5;
        else if (check(x, y, 10)) sc = 1;
    }

    int score() {
        return sc;
    }

}
