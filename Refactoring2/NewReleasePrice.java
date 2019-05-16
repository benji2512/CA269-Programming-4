class NewReleasePrice extends Price{
    int getFrequentRenterPoints(int daysRented){
        if (daysRented > 1){
            return 2;
        } else {
            return 1;
        }
    }
}
