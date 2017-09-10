package bad.robot.refactoring.chapter1;

class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    private int getDaysRented() {
        return daysRented;
    }

    double getCharge() {
        return movie.getCharge(getDaysRented());
    }

    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(getDaysRented());
    }
}
