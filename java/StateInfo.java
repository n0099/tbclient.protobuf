package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StateInfo extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_ICON_PID;
  
  public static final Long DEFAULT_ICON_PID_NEW;
  
  public static final Integer DEFAULT_ICON_TYPE;
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer icon_pid;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long icon_pid_new;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ICON_TYPE = integer;
    DEFAULT_ICON_PID = integer;
    DEFAULT_ICON_PID_NEW = Long.valueOf(0L);
  }
  
  public StateInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      Integer integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
      integer = paramBuilder.icon_pid;
      if (integer == null) {
        this.icon_pid = DEFAULT_ICON_PID;
      } else {
        this.icon_pid = integer;
      } 
      long_ = paramBuilder.icon_pid_new;
      if (long_ == null) {
        this.icon_pid_new = DEFAULT_ICON_PID_NEW;
      } else {
        this.icon_pid_new = long_;
      } 
    } else {
      this.icon = ((Builder)long_).icon;
      this.text = ((Builder)long_).text;
      this.icon_type = ((Builder)long_).icon_type;
      this.icon_pid = ((Builder)long_).icon_pid;
      this.icon_pid_new = ((Builder)long_).icon_pid_new;
    } 
  }
  
  public StateInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StateInfo> {
    public String icon;
    
    public Integer icon_pid;
    
    public Long icon_pid_new;
    
    public Integer icon_type;
    
    public String text;
    
    public Builder() {}
    
    public Builder(StateInfo param1StateInfo) {
      super(param1StateInfo);
      if (param1StateInfo == null)
        return; 
      this.icon = param1StateInfo.icon;
      this.text = param1StateInfo.text;
      this.icon_type = param1StateInfo.icon_type;
      this.icon_pid = param1StateInfo.icon_pid;
      this.icon_pid_new = param1StateInfo.icon_pid_new;
    }
    
    public StateInfo build(boolean param1Boolean) {
      return new StateInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
