package io.github.wizwix.letsfutsal.dto;

import io.github.wizwix.letsfutsal.enums.Gender;

import java.time.LocalDateTime;

public class UserDTO {
  private LocalDateTime createdAt;
  private String email;
  private Gender gender;
  private long grade;
  private String introduction;
  private String nickname;
  private String password;
  private long point;
  private String preferredPosition;
  private long userId;

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public long getGrade() {
    return grade;
  }

  public void setGrade(long grade) {
    this.grade = grade;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getPoint() {
    return point;
  }

  public void setPoint(long point) {
    this.point = point;
  }

  public String getPreferredPosition() {
    return preferredPosition;
  }

  public void setPreferredPosition(String preferredPosition) {
    this.preferredPosition = preferredPosition;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
