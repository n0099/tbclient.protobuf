package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SportScheduleInfo extends Message {
  public static final String DEFAULT_GUEST_TEAM_ICON = "";
  
  public static final String DEFAULT_GUEST_TEAM_NAME = "";
  
  public static final String DEFAULT_HOME_TEAM_ICON = "";
  
  public static final String DEFAULT_HOME_TEAM_NAME = "";
  
  public static final String DEFAULT_MATCH_BOTTOM_INFO = "";
  
  public static final String DEFAULT_MATCH_MIDDLE_INFO = "";
  
  public static final String DEFAULT_MATCH_TOP_INFO = "";
  
  public static final String DEFAULT_MSG_URL = "";
  
  public static final Integer DEFAULT_SPORT_TYPE = Integer.valueOf(0);
  
  public static final Long DEFAULT_UPDATE_TIME = Long.valueOf(0L);
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String guest_team_icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String guest_team_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String home_team_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String home_team_name;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String match_bottom_info;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String match_middle_info;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String match_top_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String msg_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sport_type;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long update_time;
  
  public SportScheduleInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.sport_type;
      if (integer == null) {
        this.sport_type = DEFAULT_SPORT_TYPE;
      } else {
        this.sport_type = integer;
      } 
      String str = paramBuilder.home_team_name;
      if (str == null) {
        this.home_team_name = "";
      } else {
        this.home_team_name = str;
      } 
      str = paramBuilder.guest_team_name;
      if (str == null) {
        this.guest_team_name = "";
      } else {
        this.guest_team_name = str;
      } 
      str = paramBuilder.home_team_icon;
      if (str == null) {
        this.home_team_icon = "";
      } else {
        this.home_team_icon = str;
      } 
      str = paramBuilder.guest_team_icon;
      if (str == null) {
        this.guest_team_icon = "";
      } else {
        this.guest_team_icon = str;
      } 
      str = paramBuilder.match_top_info;
      if (str == null) {
        this.match_top_info = "";
      } else {
        this.match_top_info = str;
      } 
      str = paramBuilder.match_middle_info;
      if (str == null) {
        this.match_middle_info = "";
      } else {
        this.match_middle_info = str;
      } 
      str = paramBuilder.match_bottom_info;
      if (str == null) {
        this.match_bottom_info = "";
      } else {
        this.match_bottom_info = str;
      } 
      str = paramBuilder.msg_url;
      if (str == null) {
        this.msg_url = "";
      } else {
        this.msg_url = str;
      } 
      long_ = paramBuilder.update_time;
      if (long_ == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_;
      } 
    } else {
      this.sport_type = ((Builder)long_).sport_type;
      this.home_team_name = ((Builder)long_).home_team_name;
      this.guest_team_name = ((Builder)long_).guest_team_name;
      this.home_team_icon = ((Builder)long_).home_team_icon;
      this.guest_team_icon = ((Builder)long_).guest_team_icon;
      this.match_top_info = ((Builder)long_).match_top_info;
      this.match_middle_info = ((Builder)long_).match_middle_info;
      this.match_bottom_info = ((Builder)long_).match_bottom_info;
      this.msg_url = ((Builder)long_).msg_url;
      this.update_time = ((Builder)long_).update_time;
    } 
  }
  
  public SportScheduleInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SportScheduleInfo> {
    public String guest_team_icon;
    
    public String guest_team_name;
    
    public String home_team_icon;
    
    public String home_team_name;
    
    public String match_bottom_info;
    
    public String match_middle_info;
    
    public String match_top_info;
    
    public String msg_url;
    
    public Integer sport_type;
    
    public Long update_time;
    
    public Builder() {}
    
    public Builder(SportScheduleInfo param1SportScheduleInfo) {
      super(param1SportScheduleInfo);
      if (param1SportScheduleInfo == null)
        return; 
      this.sport_type = param1SportScheduleInfo.sport_type;
      this.home_team_name = param1SportScheduleInfo.home_team_name;
      this.guest_team_name = param1SportScheduleInfo.guest_team_name;
      this.home_team_icon = param1SportScheduleInfo.home_team_icon;
      this.guest_team_icon = param1SportScheduleInfo.guest_team_icon;
      this.match_top_info = param1SportScheduleInfo.match_top_info;
      this.match_middle_info = param1SportScheduleInfo.match_middle_info;
      this.match_bottom_info = param1SportScheduleInfo.match_bottom_info;
      this.msg_url = param1SportScheduleInfo.msg_url;
      this.update_time = param1SportScheduleInfo.update_time;
    }
    
    public SportScheduleInfo build(boolean param1Boolean) {
      return new SportScheduleInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
