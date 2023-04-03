
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (day > 30) {
            this.month += 1;
            this.day = 1;
        } else if (this.day >= 30 && this.month >= 12) {
            this.month = 1;
            this.day = 0;
            this.year += 1;
        }
        this.day += 1;
    }

    public void advance(int howManyDays) {
        if (day > 30) {
            this.day = 0;
            this.day += howManyDays;
        } else if (this.day >= 30 && this.month >= 12) {
            this.month = 1;
            this.day = 0 + howManyDays;
            this.year += 1;
        }

    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.day += days;

        if (newDate.day >= 28 && newDate.month >= 12) {
            newDate.day = newDate.day - 30;
            newDate.month = 1;
            newDate.year = newDate.year + 1;
        } else if (newDate.day > 28) {
            newDate.day = newDate.day - 30;
            newDate.month += 1;
            }


        return newDate;
    }

}
