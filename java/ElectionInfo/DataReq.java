package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long fid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_PN = integer;
  }
  
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
      Integer integer1 = paramBuilder.rn;
      if (integer1 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer1;
      } 
      integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.fid = ((Builder)integer).fid;
      this.rn = ((Builder)integer).rn;
      this.pn = ((Builder)integer).pn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long fid;
    
    public Integer pn;
    
    public Integer rn;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.fid = param1DataReq.fid;
      this.rn = param1DataReq.rn;
      this.pn = param1DataReq.pn;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
