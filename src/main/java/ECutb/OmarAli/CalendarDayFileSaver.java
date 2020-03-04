package ECutb.OmarAli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CalendarDayFileSaver {
  public List<CalendarDay> serialize(List<CalendarDay> source, String filePath){
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath");
      ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
      out.writeObject(source);
      out.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return source;
  }

public List<CalendarDay> deserialize(List<CalendarDay> source, String filePath){
    try {
      FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath");
      ObjectInputStream in = new ObjectInputStream(fileInputStream);
      CalendarDay calendarDay = (CalendarDay) in.readObject();
      System.out.println(" Date: " + calendarDay.getDate() +
          " Meetings: " + calendarDay.getMeetings());

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return source;
  }
}






