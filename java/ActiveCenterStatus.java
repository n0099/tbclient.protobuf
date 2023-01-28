package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActiveCenterStatus extends Message {
  public static final Integer DEFAULT_DAY;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_IS_COMPLETED;
  
  public static final Integer DEFAULT_IS_TODAY_MISSION;
  
  public static final String DEFAULT_MISSION = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer day;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_completed;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_today_mission;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String mission;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_DAY = integer;
    DEFAULT_IS_COMPLETED = integer;
    DEFAULT_IS_TODAY_MISSION = integer;
  }
  
  public ActiveCenterStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.day;
      if (integer2 == null) {
        this.day = DEFAULT_DAY;
      } else {
        this.day = integer2;
      } 
      integer2 = paramBuilder.is_completed;
      if (integer2 == null) {
        this.is_completed = DEFAULT_IS_COMPLETED;
      } else {
        this.is_completed = integer2;
      } 
      String str1 = paramBuilder.mission;
      if (str1 == null) {
        this.mission = "";
      } else {
        this.mission = str1;
      } 
      Integer integer1 = paramBuilder.is_today_mission;
      if (integer1 == null) {
        this.is_today_mission = DEFAULT_IS_TODAY_MISSION;
      } else {
        this.is_today_mission = integer1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.day = ((Builder)str).day;
      this.is_completed = ((Builder)str).is_completed;
      this.mission = ((Builder)str).mission;
      this.is_today_mission = ((Builder)str).is_today_mission;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public ActiveCenterStatus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActiveCenterStatus> {
    public Integer day;
    
    public String desc;
    
    public Integer is_completed;
    
    public Integer is_today_mission;
    
    public String mission;
    
    public Builder() {}
    
    public Builder(ActiveCenterStatus param1ActiveCenterStatus) {
      super(param1ActiveCenterStatus);
      if (param1ActiveCenterStatus == null)
        return; 
      this.day = param1ActiveCenterStatus.day;
      this.is_completed = param1ActiveCenterStatus.is_completed;
      this.mission = param1ActiveCenterStatus.mission;
      this.is_today_mission = param1ActiveCenterStatus.is_today_mission;
      this.desc = param1ActiveCenterStatus.desc;
    }
    
    public ActiveCenterStatus build(boolean param1Boolean) {
      return new ActiveCenterStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
