public class Date {
    private int month;
    private int day;
    private int year;

    // Days in each month, index 0 unused so month numbers (1-12) line up directly
    private final int[] daysPerMonth = 
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        this.month = checkMonth(month);
        this.year = year;
        this.day = checkDay(day);
    }

    // Falls back to 1 if the month is out of range, so the object never ends up invalid
    private int checkMonth(int testMonth) {
        return (testMonth > 0 && testMonth <= 12) ? testMonth : 1;
    }

    // Accounts for leap years when checking February
    private int checkDay(int testDay) {
        if (testDay > 0 && testDay <= daysPerMonth[month]) {
            return testDay;
        }

        if (month == 2 && testDay == 29 && isLeapYear()) {
            return testDay;
        }

        return 1;
    }

    private boolean isLeapYear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Moves the date forward by one day, rolling into the next month/year if needed
    public void nextDay() {
        int testDay = day + 1;

        if (checkDay(testDay) == testDay) {
            day = testDay;
        } else {
            day = 1;
            nextMonth();
        }
    }

    // Moves to the next month, rolling into the next year if December just finished
    public void nextMonth() {
        if (month == 12) {
            year++;
        }
        month = (month % 12) + 1;
    }

    
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}