package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_MUTE_TYPE;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer mute_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MUTE_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.mute_type;
      if (integer1 == null) {
        this.mute_type = DEFAULT_MUTE_TYPE;
      } else {
        this.mute_type = integer1;
      } 
      integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.common = ((Builder)integer).common;
      this.mute_type = ((Builder)integer).mute_type;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer mute_type;
    
    public Integer pn;
    
    public Integer rn;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.user_id = param1DataReq.user_id;
      this.common = param1DataReq.common;
      this.mute_type = param1DataReq.mute_type;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
