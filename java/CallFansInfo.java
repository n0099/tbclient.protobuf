package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CallFansInfo extends Message {
  public static final Integer DEFAULT_CAN_CALL = Integer.valueOf(0);
  
  public static final Long DEFAULT_THREAD_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer can_call;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  public CallFansInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.can_call;
      if (integer == null) {
        this.can_call = DEFAULT_CAN_CALL;
      } else {
        this.can_call = integer;
      } 
      long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
    } else {
      this.can_call = ((Builder)long_).can_call;
      this.thread_id = ((Builder)long_).thread_id;
    } 
  }
  
  public CallFansInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CallFansInfo> {
    public Integer can_call;
    
    public Long thread_id;
    
    public Builder() {}
    
    public Builder(CallFansInfo param1CallFansInfo) {
      super(param1CallFansInfo);
      if (param1CallFansInfo == null)
        return; 
      this.can_call = param1CallFansInfo.can_call;
      this.thread_id = param1CallFansInfo.thread_id;
    }
    
    public CallFansInfo build(boolean param1Boolean) {
      return new CallFansInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
