package io.github.wizwix.letsfutsal.dto;

import java.time.LocalTime;

public class StadiumDTO {
  private LocalTime endHour;
  private String introduction;
  private String location;
  private String region;
  private long stadiumId;
  private LocalTime startHour;

  public LocalTime getEndHour() {
    return endHour;
  }

  public void setEndHour(LocalTime endHour) {
    this.endHour = endHour;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public long getStadiumId() {
    return stadiumId;
  }

  public void setStadiumId(long stadiumId) {
    this.stadiumId = stadiumId;
  }

  public LocalTime getStartHour() {
    return startHour;
  }

  public void setStartHour(LocalTime startHour) {
    this.startHour = startHour;
  }
}
