package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadIdListInfo extends Message {
  public static final Integer DEFAULT_IS_PARTIAL_VISIBLE;
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_partial_visible;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  static {
    DEFAULT_IS_PARTIAL_VISIBLE = Integer.valueOf(0);
  }
  
  public ThreadIdListInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      integer = paramBuilder.is_partial_visible;
      if (integer == null) {
        this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
      } else {
        this.is_partial_visible = integer;
      } 
    } else {
      this.tid = ((Builder)integer).tid;
      this.is_partial_visible = ((Builder)integer).is_partial_visible;
    } 
  }
  
  public ThreadIdListInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadIdListInfo> {
    public Integer is_partial_visible;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(ThreadIdListInfo param1ThreadIdListInfo) {
      super(param1ThreadIdListInfo);
      if (param1ThreadIdListInfo == null)
        return; 
      this.tid = param1ThreadIdListInfo.tid;
      this.is_partial_visible = param1ThreadIdListInfo.is_partial_visible;
    }
    
    public ThreadIdListInfo build(boolean param1Boolean) {
      return new ThreadIdListInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
