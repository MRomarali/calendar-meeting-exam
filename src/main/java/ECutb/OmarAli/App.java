package ECutb.OmarAli;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Meeting meeting = new Meeting(LocalDate.parse("2001-01-01"), LocalDate.parse("2001-01-02"),
            "Java", "Advanced java course");
        System.out.println("Title: " + meeting.getTitle());
        System.out.println("Description: " + meeting.getDescription());
        System.out.println("Start: " + meeting.getStartDate());
        System.out.println("End " + meeting.getEndDate());
        CalendarDay calendarDay = new CalendarDay();
        calendarDay.setDate(LocalDate.now());
    }
}