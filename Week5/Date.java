public class Date
{
    private int day;
    private int month;
    private int year;
                    
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public Date(){
        day = 1;
        month = 1;
        year = 2000;
    }

    public Date(String input){
        String[] dateArray = input.split(" ");
        day = Integer.parseInt(dateArray[0]);
        month = Integer.parseInt(dateArray[1]);
        year = Integer.parseInt(dateArray[2]);
    }
                        
    public String toString(){
        return day + "/" + month + "/" + year;
    }

    public boolean isOnOrAfter(Date date){
        if(year<date.year){
            return false;
        }
        if(month<date.month){
            return false;
        }
        if(day<date.day){
            return false;
        }
        return true;
    }

    //This is different from above method as
    //it is using the next read date to call
    //i.e year.isAfter(date)-> year is new value.
    public boolean isAfter(Date date){
        if(year>date.year){
            return false;
        }
        if(month>date.month){
            return false;
        }
        if(day>date.day){
            return false;
        }
        return true;
    }
}
