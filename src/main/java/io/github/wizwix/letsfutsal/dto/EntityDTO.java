package io.github.wizwix.letsfutsal.dto;

import io.github.wizwix.letsfutsal.enums.EntityType;

public class EntityDTO {
  private long entityId;
  private EntityType entityType;
  private long teamId;
  private long userId;

  public long getEntityId() {
    return entityId;
  }

  public void setEntityId(long entityId) {
    this.entityId = entityId;
  }

  public EntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
