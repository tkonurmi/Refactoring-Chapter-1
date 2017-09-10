package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        StringBuilder result = new StringBuilder("Rental record for " + getName() + "\n");
        for (Rental rental : rentals) {

            // show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(String.valueOf(rental.getCharge())).append("\n");
        }

        result.append("Amount owed is ").append(String.valueOf(getTotalAmount())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");

        return result.toString();
    }

    private double getTotalAmount(){
        double totalAmount = 0;
        for (Rental rental : this.rentals) {
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }
    private int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        for (Rental rental : this.rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}
