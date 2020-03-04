package ECutb.OmarAli;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class YearCalendar implements Serializable {
  private int id;
  private LocalDate year;
  private Calendar calenderDays;

  public YearCalendar(int id, LocalDate year, Calendar calenderDays) {
    this.id = id;
    this.year = year;
    this.calenderDays = calenderDays;
  }
  YearCalendar(){}
  public int add(int year){
    LocalDate startDay = LocalDate.of(2018,1,1);
    LocalDate lastDay = LocalDate.of(2019,1,1);
    List<LocalDate> calender = new ArrayList<>();
    for (LocalDate daysOn = startDay; daysOn.isBefore(lastDay); daysOn = daysOn.plusDays(1)){
      calender.add(daysOn);
    }
    if (calender.contains(calender)){
      return 0;
    }
    return year;
  }
  List<YearCalendar> search = new ArrayList<>();
  public List<YearCalendar> findByLocalDate(LocalDate date) {
    return search.stream()
        .filter(yearCalendar -> yearCalendar.getYear().equals(date))
        .collect(Collectors.toList());
  }
  public int getId() {
    return id;
  }

  public LocalDate getYear() {
    return year;
  }

  public void setYear(LocalDate year) {
    this.year = year;
  }

  public Calendar getCalenderDays() {
    return calenderDays;
  }

  public void setCalenderDays(Calendar calenderDays) {
    this.calenderDays = calenderDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearCalendar that = (YearCalendar) o;
    return id == that.id &&
        Objects.equals(year, that.year) &&
        Objects.equals(calenderDays, that.calenderDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, year, calenderDays);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("YearCalendar{");
    sb.append("id=").append(id);
    sb.append(", year=").append(year);
    sb.append(", calenderDays=").append(calenderDays);
    sb.append('}');
    return sb.toString();
  }
}
