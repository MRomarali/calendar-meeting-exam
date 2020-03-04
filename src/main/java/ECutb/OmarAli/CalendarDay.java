package ECutb.OmarAli;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CalendarDay implements Serializable {
  private LocalDate date;
  private List<Meeting> meetings = new ArrayList<>();

  public CalendarDay(LocalDate date, List<Meeting> meetings) {
    this.date = date;
    this.meetings = meetings;
  }
  CalendarDay(){}
  //Add meeting
  public Meeting add(Meeting meeting){
    if(!meetings.contains(meeting.getStartDate())){
      meetings.add(meeting);
    }
    return meeting;
  }
  //Delete meeting
  public boolean delete(Meeting meeting){
    if (meeting.equals(meeting.getStartDate()))
    meetings.remove(meeting);
    return meetings.remove(meeting);
  }
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public List<Meeting> getMeetings() {
    return meetings;
  }

  public void setMeetings(List<Meeting> meetings) {
    this.meetings = meetings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarDay that = (CalendarDay) o;
    return Objects.equals(date, that.date) &&
        Objects.equals(meetings, that.meetings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, meetings);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CalendarDay{");
    sb.append("date=").append(date);
    sb.append(", meetings=").append(meetings);
    sb.append('}');
    return sb.toString();
  }
}
