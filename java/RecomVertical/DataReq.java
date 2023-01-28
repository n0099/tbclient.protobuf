package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_CLASS_ID = "";
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Integer DEFAULT_NEW_NET_TYPE;
  
  public static final Integer DEFAULT_PAGE_THREAD_COUNT;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SUB_CLASS_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_id;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer load_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer new_net_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer page_thread_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer sub_class_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SUB_CLASS_ID = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_NEW_NET_TYPE = integer;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_PAGE_THREAD_COUNT = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str = paramBuilder.class_id;
      if (str == null) {
        this.class_id = "";
      } else {
        this.class_id = str;
      } 
      Integer integer2 = paramBuilder.sub_class_id;
      if (integer2 == null) {
        this.sub_class_id = DEFAULT_SUB_CLASS_ID;
      } else {
        this.sub_class_id = integer2;
      } 
      integer2 = paramBuilder.scr_w;
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
      Integer integer1 = paramBuilder.new_net_type;
      if (integer1 == null) {
        this.new_net_type = DEFAULT_NEW_NET_TYPE;
      } else {
        this.new_net_type = integer1;
      } 
      integer1 = paramBuilder.load_type;
      if (integer1 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer1;
      } 
      integer = paramBuilder.page_thread_count;
      if (integer == null) {
        this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
      } else {
        this.page_thread_count = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.class_id = ((Builder)integer).class_id;
      this.sub_class_id = ((Builder)integer).sub_class_id;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.new_net_type = ((Builder)integer).new_net_type;
      this.load_type = ((Builder)integer).load_type;
      this.page_thread_count = ((Builder)integer).page_thread_count;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String class_id;
    
    public CommonReq common;
    
    public Integer load_type;
    
    public Integer new_net_type;
    
    public Integer page_thread_count;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer sub_class_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.class_id = param1DataReq.class_id;
      this.sub_class_id = param1DataReq.sub_class_id;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.new_net_type = param1DataReq.new_net_type;
      this.load_type = param1DataReq.load_type;
      this.page_thread_count = param1DataReq.page_thread_count;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
