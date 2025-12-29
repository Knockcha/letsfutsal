package io.github.wizwix.letsfutsal.dto;

import io.github.wizwix.letsfutsal.enums.Gender;
import io.github.wizwix.letsfutsal.enums.Match;

import java.time.LocalDateTime;

public class MatchDTO {
  private Gender gender;
  private LocalDateTime matchDateTime;
  private long matchId;
  private Match matchType;
  private long maxGrade;
  private long minGrade;
  private long renterEntityId;
  private long stadiumId;
  private int status;

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public LocalDateTime getMatchDateTime() {
    return matchDateTime;
  }

  public void setMatchDateTime(LocalDateTime matchDateTime) {
    this.matchDateTime = matchDateTime;
  }

  public long getMatchId() {
    return matchId;
  }

  public void setMatchId(long matchId) {
    this.matchId = matchId;
  }

  public Match getMatchType() {
    return matchType;
  }

  public void setMatchType(Match matchType) {
    this.matchType = matchType;
  }

  public long getMaxGrade() {
    return maxGrade;
  }

  public void setMaxGrade(long maxGrade) {
    this.maxGrade = maxGrade;
  }

  public long getMinGrade() {
    return minGrade;
  }

  public void setMinGrade(long minGrade) {
    this.minGrade = minGrade;
  }

  public long getRenterEntityId() {
    return renterEntityId;
  }

  public void setRenterEntityId(long renterEntityId) {
    this.renterEntityId = renterEntityId;
  }

  public long getStadiumId() {
    return stadiumId;
  }

  public void setStadiumId(long stadiumId) {
    this.stadiumId = stadiumId;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }
}
