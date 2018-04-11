public class Time {

	private final int year;
	private final int month;
	private final int minutes = 0;
	private final int hours = 0;
	private final int day = 1;

    public Time() {
        Date date = new Date();

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getDay() {
        return day;
    }
}