package ECutb.OmarAli;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Meeting implements Serializable {
  private LocalDate startDate;
  private LocalDate endDate;
  private String title;
  private String description;

  public Meeting(LocalDate startDate, LocalDate endDate, String title, String description) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.title = title;
    this.description = description;
  }
  Meeting(){}

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meeting meeting = (Meeting) o;
    return Objects.equals(startDate, meeting.startDate) &&
        Objects.equals(endDate, meeting.endDate) &&
        Objects.equals(title, meeting.title) &&
        Objects.equals(description, meeting.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, title, description);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Meeting{");
    sb.append("startDate=").append(startDate);
    sb.append(", endDate=").append(endDate);
    sb.append(", title='").append(title).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
