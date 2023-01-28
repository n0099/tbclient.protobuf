package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_ITEM_ID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer item_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_dip;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ITEM_ID = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = integer;
    DEFAULT_Q_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.item_id;
      if (integer1 == null) {
        this.item_id = DEFAULT_ITEM_ID;
      } else {
        this.item_id = integer1;
      } 
      integer1 = paramBuilder.scr_w;
      if (integer1 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer1;
      } 
      integer1 = paramBuilder.scr_h;
      if (integer1 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer1;
      } 
      integer1 = paramBuilder.scr_dip;
      if (integer1 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = integer1;
      } 
      integer = paramBuilder.q_type;
      if (integer == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.item_id = ((Builder)integer).item_id;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer item_id;
    
    public Integer q_type;
    
    public Integer scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.item_id = param1DataReq.item_id;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
