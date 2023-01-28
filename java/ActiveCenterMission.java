package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActiveCenterMission extends Message {
  public static final Integer DEFAULT_ACTIVE_ID;
  
  public static final Integer DEFAULT_ACTIVITY_ID;
  
  public static final Integer DEFAULT_CLEARTIME;
  
  public static final Integer DEFAULT_CLEARTYPE;
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_FINAL_REWARD_URL = "";
  
  public static final String DEFAULT_IS_COMPLETED = "";
  
  public static final String DEFAULT_MISSION = "";
  
  public static final Integer DEFAULT_MISSION_ID;
  
  public static final Integer DEFAULT_TASK_TYPE;
  
  public static final Integer DEFAULT_TOTAL_LIMIT;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer active_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer activity_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer cleartime;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer cleartype;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String final_reward_url;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String is_completed;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String mission;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer mission_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer task_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer total_limit;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVE_ID = integer;
    DEFAULT_MISSION_ID = integer;
    DEFAULT_TASK_TYPE = integer;
    DEFAULT_CLEARTYPE = integer;
    DEFAULT_CLEARTIME = integer;
    DEFAULT_TOTAL_LIMIT = integer;
    DEFAULT_ACTIVITY_ID = integer;
  }
  
  public ActiveCenterMission(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.active_id;
      if (integer1 == null) {
        this.active_id = DEFAULT_ACTIVE_ID;
      } else {
        this.active_id = integer1;
      } 
      integer1 = paramBuilder.mission_id;
      if (integer1 == null) {
        this.mission_id = DEFAULT_MISSION_ID;
      } else {
        this.mission_id = integer1;
      } 
      integer1 = paramBuilder.task_type;
      if (integer1 == null) {
        this.task_type = DEFAULT_TASK_TYPE;
      } else {
        this.task_type = integer1;
      } 
      integer1 = paramBuilder.cleartype;
      if (integer1 == null) {
        this.cleartype = DEFAULT_CLEARTYPE;
      } else {
        this.cleartype = integer1;
      } 
      integer1 = paramBuilder.cleartime;
      if (integer1 == null) {
        this.cleartime = DEFAULT_CLEARTIME;
      } else {
        this.cleartime = integer1;
      } 
      integer1 = paramBuilder.total_limit;
      if (integer1 == null) {
        this.total_limit = DEFAULT_TOTAL_LIMIT;
      } else {
        this.total_limit = integer1;
      } 
      String str = paramBuilder.final_reward_url;
      if (str == null) {
        this.final_reward_url = "";
      } else {
        this.final_reward_url = str;
      } 
      str = paramBuilder.mission;
      if (str == null) {
        this.mission = "";
      } else {
        this.mission = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.is_completed;
      if (str == null) {
        this.is_completed = "";
      } else {
        this.is_completed = str;
      } 
      integer = paramBuilder.activity_id;
      if (integer == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = integer;
      } 
    } else {
      this.active_id = ((Builder)integer).active_id;
      this.mission_id = ((Builder)integer).mission_id;
      this.task_type = ((Builder)integer).task_type;
      this.cleartype = ((Builder)integer).cleartype;
      this.cleartime = ((Builder)integer).cleartime;
      this.total_limit = ((Builder)integer).total_limit;
      this.final_reward_url = ((Builder)integer).final_reward_url;
      this.mission = ((Builder)integer).mission;
      this.desc = ((Builder)integer).desc;
      this.is_completed = ((Builder)integer).is_completed;
      this.activity_id = ((Builder)integer).activity_id;
    } 
  }
  
  public ActiveCenterMission(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActiveCenterMission> {
    public Integer active_id;
    
    public Integer activity_id;
    
    public Integer cleartime;
    
    public Integer cleartype;
    
    public String desc;
    
    public String final_reward_url;
    
    public String is_completed;
    
    public String mission;
    
    public Integer mission_id;
    
    public Integer task_type;
    
    public Integer total_limit;
    
    public Builder() {}
    
    public Builder(ActiveCenterMission param1ActiveCenterMission) {
      super(param1ActiveCenterMission);
      if (param1ActiveCenterMission == null)
        return; 
      this.active_id = param1ActiveCenterMission.active_id;
      this.mission_id = param1ActiveCenterMission.mission_id;
      this.task_type = param1ActiveCenterMission.task_type;
      this.cleartype = param1ActiveCenterMission.cleartype;
      this.cleartime = param1ActiveCenterMission.cleartime;
      this.total_limit = param1ActiveCenterMission.total_limit;
      this.final_reward_url = param1ActiveCenterMission.final_reward_url;
      this.mission = param1ActiveCenterMission.mission;
      this.desc = param1ActiveCenterMission.desc;
      this.is_completed = param1ActiveCenterMission.is_completed;
      this.activity_id = param1ActiveCenterMission.activity_id;
    }
    
    public ActiveCenterMission build(boolean param1Boolean) {
      return new ActiveCenterMission(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
