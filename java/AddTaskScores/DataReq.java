package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_TASK_ID;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  static {
    DEFAULT_TASK_ID = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      integer = paramBuilder.task_id;
      if (integer == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.user_id = ((Builder)integer).user_id;
      this.task_id = ((Builder)integer).task_id;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer task_id;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.user_id = param1DataReq.user_id;
      this.task_id = param1DataReq.task_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
