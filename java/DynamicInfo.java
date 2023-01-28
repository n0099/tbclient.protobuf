package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DynamicInfo extends Message {
  public static final Long DEFAULT_DYNAMIC_TIMESTAMP = Long.valueOf(0L);
  
  public static final String DEFAULT_IS_HIDE = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long dynamic_timestamp;
  
  @ProtoField(tag = 3)
  public final ForumDynamic forum_dynamic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String is_hide;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_dynamic;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 4)
  public final UserDynamic user_dynamic;
  
  public DynamicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.thread_dynamic = paramBuilder.thread_dynamic;
      Long long_ = paramBuilder.dynamic_timestamp;
      if (long_ == null) {
        this.dynamic_timestamp = DEFAULT_DYNAMIC_TIMESTAMP;
      } else {
        this.dynamic_timestamp = long_;
      } 
      this.forum_dynamic = paramBuilder.forum_dynamic;
      this.user_dynamic = paramBuilder.user_dynamic;
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.is_hide;
      if (str == null) {
        this.is_hide = "";
      } else {
        this.is_hide = str;
      } 
    } else {
      this.thread_dynamic = ((Builder)str).thread_dynamic;
      this.dynamic_timestamp = ((Builder)str).dynamic_timestamp;
      this.forum_dynamic = ((Builder)str).forum_dynamic;
      this.user_dynamic = ((Builder)str).user_dynamic;
      this.type = ((Builder)str).type;
      this.is_hide = ((Builder)str).is_hide;
    } 
  }
  
  public DynamicInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DynamicInfo> {
    public Long dynamic_timestamp;
    
    public ForumDynamic forum_dynamic;
    
    public String is_hide;
    
    public ThreadInfo thread_dynamic;
    
    public Integer type;
    
    public UserDynamic user_dynamic;
    
    public Builder() {}
    
    public Builder(DynamicInfo param1DynamicInfo) {
      super(param1DynamicInfo);
      if (param1DynamicInfo == null)
        return; 
      this.thread_dynamic = param1DynamicInfo.thread_dynamic;
      this.dynamic_timestamp = param1DynamicInfo.dynamic_timestamp;
      this.forum_dynamic = param1DynamicInfo.forum_dynamic;
      this.user_dynamic = param1DynamicInfo.user_dynamic;
      this.type = param1DynamicInfo.type;
      this.is_hide = param1DynamicInfo.is_hide;
    }
    
    public DynamicInfo build(boolean param1Boolean) {
      return new DynamicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
