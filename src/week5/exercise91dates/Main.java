package week5.exercise91dates;

public class Main {
    public static void main(String[] args) {

        MyDate dayTest=new MyDate(30, 12, 2011);
        System.out.println("TESTING");
        System.out.println(dayTest);
        dayTest.advance();
        System.out.println(dayTest);
        System.out.println("==========");

        MyDate day = new MyDate(25, 2, 2011);
        System.out.println(day);
        System.out.println("==========");

        MyDate newDate = day.afterNumberOfDays(7);
        System.out.println(newDate);
        System.out.println("==========");

        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }

        System.out.println("==========");
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));

    }
}
