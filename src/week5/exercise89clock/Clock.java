package week5.exercise89clock;

public class Clock {

    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);
    //le pot defini aici, raman aceleasi pentru toate ceasurile
    //sau in constructor
    //fiecare variabila este un obiect de tip BoundedCounter
    //fiecare BoundedCounter este identic, difera upperLimit

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
        // the counters that represent hours, minutes and seconds are created and
        // set to have the correct initial values
    }

    public void tick() {
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
        }
        // Clock advances by one second
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(hours).append(":").append(minutes).append(":").append(seconds);
        return sb.toString();
    }
}


