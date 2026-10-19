/* takes a custom data type 
 * for the date 
 * month/day/year
 * method to compute days between 2 date
 * method to return the day of the week 
 *
 *
 *
 */

public class CustomDate{


        private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int month;   // month (between 1 and 12)
    private final int day;     // day   (between 1 and DAYS[month]
    private final int year;    // year

    // do bounds-checking to ensure object represents a valid date
    public CustomDate(int m, int d, int y) {
        if (!isValid(m, d, y)) throw new RuntimeException("Invalid date");
        month = m;
        day   = d;
        year  = y;
    }

    // is the given date valid?
    private static boolean isValid(int m, int d, int y) {
        if (m < 1 || m > 12)      return false;
        if (d < 1 || d > DAYS[m]) return false;
        if (m == 2 && d == 29 && !isLeapYear(y)) return false;
        return true;
    }

    // is y a leap year?
    private static boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return (y % 4 == 0);
    }

    // return the next Date
    public CustomDate next() {
        if (isValid(month, day + 1, year))    return new CustomDate(month, day + 1, year);

        else if (isValid(month + 1, 1, year)) return new CustomDate(month + 1, 1, year);

        else return new CustomDate(1, 1, year + 1);
    }


    // is this Date after b?
    public boolean isAfter(CustomDate b) {
        return compareTo(b) > 0;
    }

    // is this Date a before b?
    public boolean isBefore(CustomDate b) {
        return compareTo(b) < 0;
    }

    // comparison function between two dates
    public int compareTo(CustomDate b) {
        if  (year  != b.year)  return year  - b.year;
        if  (month != b.month) return month - b.month;
        return day - b.day;
    }

    // return a string representation of this date
    public String toString() {
        return month + "/" + day + "/" + year;
    }



    // incerted code to count days between dates 
    public int daysUntil(CustomDate other_date){
        int day_counter = 0;
        CustomDate current_date = this;

        if(this.isAfter(other_date))
            return -other_date.daysUntil(this);

        while (current_date.isBefore(other_date)){

            current_date = current_date.next();
            day_counter++;
        }



        return day_counter;




    }



    // inserted code to calculate the day of the week
    public String dayOfWeek(){
        CustomDate ref = new CustomDate(1, 1, 1900); 
        int days_gone = ref.daysUntil(this);
        

        // dictionary of days of the wekk 
        String [] days_of_week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


        int days_idx = (days_gone%7+7)%7;
        
        return days_of_week[days_idx];




    }



    public static void main(String[] args) {
        CustomDate today = new CustomDate(10, 14, 2026);
        StdOut.println("Today is " + today);
        CustomDate future_date = new CustomDate(2, 14, 2027);


        StdOut.println("Days until Valentine's day " + today.daysUntil(future_date));
        StdOut.println("Day of the week would be " + future_date.dayOfWeek());


    }




}
