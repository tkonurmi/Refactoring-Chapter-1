package bad.robot.refactoring.chapter1;

abstract class Price {
    abstract protected double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
