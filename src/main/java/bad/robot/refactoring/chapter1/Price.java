package bad.robot.refactoring.chapter1;

abstract class Price {
    abstract int getPriceCode();

    abstract protected double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
