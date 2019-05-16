public class Movie{

    private String _title;
    private int _priceCode;
    public Price price;

    public Movie(String title, int priceCode){
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode(){
        return price.getPriceCode();
    }

    public void setPriceCode(int arg){
        switch (arg) {
            case 0:
                price = new RegularPrice();
                break;
            case 2:
                price = new ChildrensPrice();
                break;
            case 1:
                price = new NewReleasePrice();
                break;
        }
    }

    public String getTitle(){
        return _title;
    }

    public double getCharge(int numDaysRented){
        return price.getCharge(numDaysRented);
    }

    public int getFrequentRenterPoints(int numDaysRented){
        return price.getFrequentRenterPoints(numDaysRented);
    }
}
