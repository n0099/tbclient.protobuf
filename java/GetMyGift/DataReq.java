package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_ACCOUNT_TYPE;
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer account_type;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long uid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_ACCOUNT_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      String str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      integer = paramBuilder.account_type;
      if (integer == null) {
        this.account_type = DEFAULT_ACCOUNT_TYPE;
      } else {
        this.account_type = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.common = ((Builder)integer).common;
      this.pn = ((Builder)integer).pn;
      this.st_type = ((Builder)integer).st_type;
      this.account_type = ((Builder)integer).account_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Integer account_type;
    
    public CommonReq common;
    
    public Integer pn;
    
    public String st_type;
    
    public Long uid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.uid = param1DataReq.uid;
      this.common = param1DataReq.common;
      this.pn = param1DataReq.pn;
      this.st_type = param1DataReq.st_type;
      this.account_type = param1DataReq.account_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
