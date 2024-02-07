public class Ejercicio1 {
    public static void main(String[] args) {
        int daysInYear = 365;
        byte hoursInDay = 24;
        byte minutesInHour = 60;
        byte secondsInMinute = 60;

        int secondsInYear = calculateSecondsInYear(daysInYear, hoursInDay, minutesInHour, secondsInMinute);
        System.out.println("Seconds in a year: " + secondsInYear);
    }

    public static int calculateSecondsInYear(int days, int hours, int minutes, int seconds) {
        return days * hours * minutes * seconds;
    }
}
