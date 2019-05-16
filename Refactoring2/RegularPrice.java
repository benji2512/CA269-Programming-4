public class RegularPrice extends Price {
    public int getPriceCode() {
        return Price.REGULAR;
    }

    public int getFrequentRenterPoints(int daysRented){
        return 1;
    }

    public double getCharge(int daysRented){
        double result = 4;
        if (daysRented > 2){
            result += (daysRented - 2) * 3;
        }
        return result;
    }
}
