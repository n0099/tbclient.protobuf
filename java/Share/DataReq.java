package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FID;
  
  public static final Integer DEFAULT_FROM;
  
  public static final Long DEFAULT_TID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer from;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_FROM = Integer.valueOf(0);
    DEFAULT_FID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      Integer integer = paramBuilder.from;
      if (integer == null) {
        this.from = DEFAULT_FROM;
      } else {
        this.from = integer;
      } 
      long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.tid = ((Builder)long_).tid;
      this.from = ((Builder)long_).from;
      this.fid = ((Builder)long_).fid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long fid;
    
    public Integer from;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tid = param1DataReq.tid;
      this.from = param1DataReq.from;
      this.fid = param1DataReq.fid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
