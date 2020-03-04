package ECutb.OmarAli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class MeetingFileSaver {
  public List<Meeting> serialize(List<Meeting> source){
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath"));
      out.writeObject(source);
      out.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return source;
  }

  public List<Meeting> deserialize(List<Meeting> source){
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Omar Abdi Ali\\IdeaProjects\\Calender_Meeting_Assignment\\src\\main\\java\\ECutb\\OmarAli\\filePath"));
      Meeting meeting = (Meeting) in.readObject();
      System.out.println(
          " StartDate: " + meeting.getStartDate() +
              " EndDate: " + meeting.getEndDate() +
              " Title: " + meeting.getTitle() +
              " Description: " + meeting.getDescription());

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return source;
  }

}
