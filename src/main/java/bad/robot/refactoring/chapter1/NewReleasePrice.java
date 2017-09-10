package bad.robot.refactoring.chapter1;

public class NewReleasePrice extends Price {

    @Override
    protected double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented>1) ? 2 :1;
    }
}
