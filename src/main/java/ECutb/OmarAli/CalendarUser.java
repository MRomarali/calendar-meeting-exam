package ECutb.OmarAli;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class CalendarUser implements Serializable {
  private int id;
  private String name;
  private String email;
  private List<YearCalendar> yearCalendars = new ArrayList<>();

  public CalendarUser(int id, String name, String email,
      List<YearCalendar> yearCalendars) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.yearCalendars = yearCalendars;
  }

  CalendarUser(){}



  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<YearCalendar> getYearCalendars() {
    return yearCalendars;
  }

  public void setYearCalendars(List<YearCalendar> yearCalendars) {
    this.yearCalendars = yearCalendars;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarUser that = (CalendarUser) o;
    return id == that.id &&
        Objects.equals(name, that.name) &&
        Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CalendarUser{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
