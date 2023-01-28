package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RealTime extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Long DEFAULT_TASK_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public RealTime(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.task_id;
      if (long_ == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.task_id = ((Builder)str).task_id;
      this.icon = ((Builder)str).icon;
      this.url = ((Builder)str).url;
    } 
  }
  
  public RealTime(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RealTime> {
    public String icon;
    
    public Long task_id;
    
    public String url;
    
    public Builder() {}
    
    public Builder(RealTime param1RealTime) {
      super(param1RealTime);
      if (param1RealTime == null)
        return; 
      this.task_id = param1RealTime.task_id;
      this.icon = param1RealTime.icon;
      this.url = param1RealTime.url;
    }
    
    public RealTime build(boolean param1Boolean) {
      return new RealTime(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
