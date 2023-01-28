package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_APPLY_ID = Integer.valueOf(0);
  
  public static final Long DEFAULT_FID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer apply_id;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long fid;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer = paramBuilder.apply_id;
      if (integer == null) {
        this.apply_id = DEFAULT_APPLY_ID;
      } else {
        this.apply_id = integer;
      } 
      long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.apply_id = ((Builder)long_).apply_id;
      this.fid = ((Builder)long_).fid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Integer apply_id;
    
    public CommonReq common;
    
    public Long fid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.apply_id = param1DataReq.apply_id;
      this.fid = param1DataReq.fid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
