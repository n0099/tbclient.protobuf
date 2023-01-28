package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_LIMIT;
  
  public static final Integer DEFAULT_PN;
  
  public static final Long DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer limit;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long q_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = Long.valueOf(0L);
    DEFAULT_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_LIMIT = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.scr_w;
      if (integer2 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer2;
      } 
      integer2 = paramBuilder.scr_h;
      if (integer2 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Long long_ = paramBuilder.q_type;
      if (long_ == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = long_;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      integer = paramBuilder.limit;
      if (integer == null) {
        this.limit = DEFAULT_LIMIT;
      } else {
        this.limit = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.type = ((Builder)integer).type;
      this.pn = ((Builder)integer).pn;
      this.limit = ((Builder)integer).limit;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer limit;
    
    public Integer pn;
    
    public Long q_type;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.type = param1DataReq.type;
      this.pn = param1DataReq.pn;
      this.limit = param1DataReq.limit;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
