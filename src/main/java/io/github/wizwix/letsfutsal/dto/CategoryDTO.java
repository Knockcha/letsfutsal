package io.github.wizwix.letsfutsal.dto;

public class CategoryDTO {
  private long cateId;
  private String cateName;

  public long getCateId() {
    return cateId;
  }

  public void setCateId(long cateId) {
    this.cateId = cateId;
  }

  public String getCateName() {
    return cateName;
  }

  public void setCateName(String cateName) {
    this.cateName = cateName;
  }
}
