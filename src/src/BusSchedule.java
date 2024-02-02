import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusSchedule {

    public static List<String> claculateSchedule(List<String> busSchedule, String currentTime) {
        List<String> upcomingSchedule = new ArrayList<>();

        // Parse the current time string to LocalTime
        LocalTime current = LocalTime.parse(currentTime, DateTimeFormatter.ofPattern("HH:mm"));
        // Calculate and display the differences
        for (String time : busSchedule) {
            LocalTime busTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
            long diff = calculateTimeDifference(current, busTime);
            System.out.println("Time difference between " + currentTime + " and " + time + " is " + diff + " minutes");
            if(diff>0){
                int hours =(int) diff/60;
                int min= (int) diff % 60;
                upcomingSchedule.add(Integer.toString(hours)+":"+Integer.toString(min));
            }
        }

        upcomingSchedule.forEach((temp)-> System.out.println(temp));

        return upcomingSchedule;
    }


    public static long calculateTimeDifference(LocalTime currentTime, LocalTime busTime) {
        return currentTime.until(busTime, java.time.temporal.ChronoUnit.MINUTES);
    }





    public static void main(String[] args) {
        List<String> list= Arrays.asList("08:30", "10:45", "12:15", "15:00", "17:30");
        list.forEach((temp)-> System.out.println(temp));


        String currentTime =  "11:20";

        claculateSchedule(list,currentTime);


    }

}
