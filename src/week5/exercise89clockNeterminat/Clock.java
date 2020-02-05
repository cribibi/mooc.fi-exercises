package week5.exercise89clockNeterminat;

public class Clock {
    private BoundedCounterPBonus hours;
    private BoundedCounterPBonus minutes;
    private BoundedCounterPBonus seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and
        // set to have the correct initial values
    }

    public Clock(BoundedCounterPBonus hours, BoundedCounterPBonus minutes, BoundedCounterPBonus seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick(){
        seconds.next();
        // Clock advances by one second
    }

    public String toString() {
        StringBuilder sb=new StringBuilder("");
        sb.append(hours).append(":").append(minutes).append(":").append(seconds);
        // returns the string representation
    return sb.toString();
    }
}


