package ECutb.OmarAli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CalendarUserFileSaver {
  public List<CalendarUser> serialize(List<CalendarUser> source, String filePath){
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath"));
      out.writeObject(source);
      out.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return source;
  }

  public List<CalendarDay> deserialize(List<CalendarDay> source, String filePath){
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath"));
      CalendarUser calendarUser = (CalendarUser) in.readObject();
      System.out.println(
          " Id: " + calendarUser.getId() +
          " Name: " + calendarUser.getName() +
          " Email: " + calendarUser.getEmail() +
          " calendarYear: " + calendarUser.getYearCalendars());

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return source;
  }
}


