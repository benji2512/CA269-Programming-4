class Rental{
    private Movie _movie;
    private int _daysRented;
    
    public Rental(Movie movie, int daysRented){
        _movie = movie;
        _daysRented = daysRented;
    }
    
    public int getDaysRented(){
        return _daysRented;
    }
    
    public Movie getMovie(){
        return _movie;
    }
    
    public String toString(){
        return _movie + " [" + _daysRented + "]";
    }

    public double getCharge(){
        double total = 0;
            switch(getMovie().getPriceCode()){
                case Movie.REGULAR:
                    total += 2;
                    if(getDaysRented() > 2){
                        total += (getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    total += getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    total += 1.5;
                    if(getDaysRented() > 3){
                        total += (getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
        return total;
    }
	
	public int getFrequentRenterPoints(){
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1){
            return 2;
        } else {
            return 1;
        }
    }
}
