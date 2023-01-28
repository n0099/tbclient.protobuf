package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class YuleActivity extends Message {
  public static final String DEFAULT_ACTIVITY_ALL_ICON = "";
  
  public static final String DEFAULT_ACTIVITY_HALF_ICON = "";
  
  public static final Long DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_ACTIVITY_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String activity_all_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String activity_half_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long activity_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String activity_url;
  
  public YuleActivity(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      Integer integer = paramBuilder.activity_type;
      if (integer == null) {
        this.activity_type = DEFAULT_ACTIVITY_TYPE;
      } else {
        this.activity_type = integer;
      } 
      String str1 = paramBuilder.activity_url;
      if (str1 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str1;
      } 
      str1 = paramBuilder.activity_all_icon;
      if (str1 == null) {
        this.activity_all_icon = "";
      } else {
        this.activity_all_icon = str1;
      } 
      str = paramBuilder.activity_half_icon;
      if (str == null) {
        this.activity_half_icon = "";
      } else {
        this.activity_half_icon = str;
      } 
    } else {
      this.activity_id = ((Builder)str).activity_id;
      this.activity_type = ((Builder)str).activity_type;
      this.activity_url = ((Builder)str).activity_url;
      this.activity_all_icon = ((Builder)str).activity_all_icon;
      this.activity_half_icon = ((Builder)str).activity_half_icon;
    } 
  }
  
  public YuleActivity(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<YuleActivity> {
    public String activity_all_icon;
    
    public String activity_half_icon;
    
    public Long activity_id;
    
    public Integer activity_type;
    
    public String activity_url;
    
    public Builder() {}
    
    public Builder(YuleActivity param1YuleActivity) {
      super(param1YuleActivity);
      if (param1YuleActivity == null)
        return; 
      this.activity_id = param1YuleActivity.activity_id;
      this.activity_type = param1YuleActivity.activity_type;
      this.activity_url = param1YuleActivity.activity_url;
      this.activity_all_icon = param1YuleActivity.activity_all_icon;
      this.activity_half_icon = param1YuleActivity.activity_half_icon;
    }
    
    public YuleActivity build(boolean param1Boolean) {
      return new YuleActivity(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
