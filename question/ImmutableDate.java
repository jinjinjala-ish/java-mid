package question;

public class ImmutableDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableDate setYear(int newYear) {
        return new ImmutableDate(newYear, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

}
