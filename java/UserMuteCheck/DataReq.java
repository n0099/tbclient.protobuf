package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_MUTE_TYPE;
  
  public static final Long DEFAULT_USER_ID_F;
  
  public static final Long DEFAULT_USER_ID_T;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer mute_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id_f;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id_t;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID_F = long_;
    DEFAULT_USER_ID_T = long_;
    DEFAULT_MUTE_TYPE = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.user_id_f;
      if (long_ == null) {
        this.user_id_f = DEFAULT_USER_ID_F;
      } else {
        this.user_id_f = long_;
      } 
      long_ = paramBuilder.user_id_t;
      if (long_ == null) {
        this.user_id_t = DEFAULT_USER_ID_T;
      } else {
        this.user_id_t = long_;
      } 
      integer = paramBuilder.mute_type;
      if (integer == null) {
        this.mute_type = DEFAULT_MUTE_TYPE;
      } else {
        this.mute_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.user_id_f = ((Builder)integer).user_id_f;
      this.user_id_t = ((Builder)integer).user_id_t;
      this.mute_type = ((Builder)integer).mute_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer mute_type;
    
    public Long user_id_f;
    
    public Long user_id_t;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.user_id_f = param1DataReq.user_id_f;
      this.user_id_t = param1DataReq.user_id_t;
      this.mute_type = param1DataReq.mute_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
