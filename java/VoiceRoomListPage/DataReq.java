package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_CALL_FROM;
  
  public static final Long DEFAULT_FID;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long fid;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_CALL_FROM = long_;
    DEFAULT_FID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.call_from;
      if (long_1 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = long_1;
      } 
      long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.call_from = ((Builder)long_).call_from;
      this.fid = ((Builder)long_).fid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Long call_from;
    
    public CommonReq common;
    
    public Long fid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.call_from = param1DataReq.call_from;
      this.fid = param1DataReq.fid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
