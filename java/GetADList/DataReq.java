package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FID;
  
  public static final Long DEFAULT_OFFSET;
  
  public static final Integer DEFAULT_RN = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long offset;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer rn;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      long_ = paramBuilder.offset;
      if (long_ == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = long_;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.fid = ((Builder)integer).fid;
      this.offset = ((Builder)integer).offset;
      this.rn = ((Builder)integer).rn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FID = long_;
    DEFAULT_OFFSET = long_;
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long fid;
    
    public Long offset;
    
    public Integer rn;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.fid = param1DataReq.fid;
      this.offset = param1DataReq.offset;
      this.rn = param1DataReq.rn;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
