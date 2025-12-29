package io.github.wizwix.letsfutsal.dto;

public class ArticleDTO {
  private long articleId;
  private long authorId;
  private long cateId;
  private String content;
  private String title;
  private long views;

  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }

  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }

  public long getCateId() {
    return cateId;
  }

  public void setCateId(long cateId) {
    this.cateId = cateId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public long getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }
}
