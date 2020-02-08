package week5.exercise92datediff;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }
        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public MyDate advance() {
        if (day < 30) {
            day = day + 1;
        } else {
            day = 1;
            if (month < 12) {
                month = month + 1;
            } else {
                month = 1;
                year = year + 1;
            }
        }
        return new MyDate(day, month, year);//creste data initiala
    }

    public MyDate afterNumberOfDays(int numberOfDays) {
        int newD;
        int newM;
        int newY;
        if ((day + numberOfDays) % 30 == 0) {
            newD = 30;
            newM = (month + ((day + numberOfDays) / 30) - 1) % 12;
            newY = year + ((day + numberOfDays) / 360);

        } else {
            newD = (day + numberOfDays) % 30;
            newM = (month + ((day + numberOfDays) / 30)) % 12;
            newY = year + ((day + numberOfDays) / 360);
        }
        return new MyDate(newD, newM, newY);
        //creeaza o data noua, nu modifica data initiala
    }

    public int differenceInYears(MyDate comparedDate) {
        if (earlier(comparedDate) == false) {
            return (this.year - comparedDate.year);
        } else return 0000000;
    }

    public int differenceInYearsAccurate(MyDate comparedDate) {
        if ((earlier(comparedDate) == false)) {
            if (((this.day >= comparedDate.day)) && ((this.month >= comparedDate.month))) {
                return (this.year - comparedDate.year);
            } else {
                return (this.year - comparedDate.year - 1);
            }
        } else return 00000;
    }

    public int differenceInYearsAccurateIndif(MyDate comparedDate) {
        if ((earlier(comparedDate) == false)) {
            if ((this.day >= comparedDate.day) && (this.month >= comparedDate.month)) {
                return (this.year - comparedDate.year);
            } else {
                return (this.year - comparedDate.year - 1);
            }

        } else if ((this.day <= comparedDate.day) && (this.month <= comparedDate.month)) {
            return (comparedDate.year-this.year);
        } else {
            return (comparedDate.year - this.year-1);
        }
    }
}
