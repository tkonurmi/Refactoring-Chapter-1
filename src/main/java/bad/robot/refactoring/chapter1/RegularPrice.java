package bad.robot.refactoring.chapter1;

public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    protected double getCharge(int daysRented){
        double amount =2;

        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;

        return amount;
    }
}
