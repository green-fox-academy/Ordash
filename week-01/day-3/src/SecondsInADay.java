
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int oneDayInSeconds = (24*60*60);
        int currentHoursInSeconds = (currentHours*60*60);
        int currentMinutesInSeconds = (currentMinutes*60);

        int remainingSeconds = (oneDayInSeconds - (currentHoursInSeconds + currentMinutesInSeconds + currentSeconds));
        System.out.println(remainingSeconds);


    }
}