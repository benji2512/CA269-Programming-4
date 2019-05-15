import java.util.*;

class Customer{
    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();
    
    public Customer(String name, List<Rental> rentals){
        this._name = name;
        this._rentals = rentals;
    }
    
    public String getName(){
        return _name;
    }
    
    public List<Rental> getRentals(){
        return _rentals;
    }
    
    public String toString(){
        return _name + ": " + _rentals;
    }
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String output="";
        int count = 0;
        for(Rental eachMovie:_rentals){
            output += "  " + eachMovie.getMovie().getTitle()+ "  " + String.valueOf(eachMovie.getCharge()) + "\n";
        }
        output += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        output += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points" + "\n";
        return output;
    }

    public double getTotalCharge(){
        double charge = 0;
        List<Rental> chargeRentals = getRentals();
        for(Rental film:chargeRentals){
            charge += film.getCharge();
        }
        return charge;
    }

    public int getTotalFrequentRenterPoints(){
        int total = 0;
        List<Rental> frequentRenter = getRentals();
        for(Rental film:frequentRenter){
            total += film.getFrequentRenterPoints();
        }
        return total;
    }
    
    public String htmlStatement(){
        List<Rental> rentals = getRentals();
        String output = "<h1>Statement for " + getName() + "</h1>\n<ol>\n";
        for(Rental films:rentals){
            output += "  <li>" + films.getMovie().getTitle() + "  " + String.valueOf(films.getCharge()) + "</li>\n";
        }
        output += "</ol>\n<p>Amount owed is " + String.valueOf(getTotalCharge()) + "</p>\n";
        output += "<p>You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points.</p>\n";
        return output;
    }
}
