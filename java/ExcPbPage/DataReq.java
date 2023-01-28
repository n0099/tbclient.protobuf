package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_EXCID;
  
  public static final Long DEFAULT_Q_TYPE;
  
  public static final Long DEFAULT_SCR_DIP;
  
  public static final Long DEFAULT_SCR_H;
  
  public static final Long DEFAULT_SCR_W;
  
  public static final Long DEFAULT_TAG_CODE;
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long excid;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long q_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long scr_dip;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long scr_h;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long scr_w;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_SCR_W = long_;
    DEFAULT_SCR_H = long_;
    DEFAULT_SCR_DIP = long_;
    DEFAULT_Q_TYPE = long_;
    DEFAULT_EXCID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_TAG_CODE = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.scr_w;
      if (long_1 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = long_1;
      } 
      long_1 = paramBuilder.scr_h;
      if (long_1 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = long_1;
      } 
      long_1 = paramBuilder.scr_dip;
      if (long_1 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = long_1;
      } 
      long_1 = paramBuilder.q_type;
      if (long_1 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = long_1;
      } 
      long_1 = paramBuilder.excid;
      if (long_1 == null) {
        this.excid = DEFAULT_EXCID;
      } else {
        this.excid = long_1;
      } 
      long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      long_ = paramBuilder.tag_code;
      if (long_ == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.q_type = ((Builder)long_).q_type;
      this.excid = ((Builder)long_).excid;
      this.thread_id = ((Builder)long_).thread_id;
      this.tag_code = ((Builder)long_).tag_code;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long excid;
    
    public Long q_type;
    
    public Long scr_dip;
    
    public Long scr_h;
    
    public Long scr_w;
    
    public Long tag_code;
    
    public Long thread_id;
    
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
      this.excid = param1DataReq.excid;
      this.thread_id = param1DataReq.thread_id;
      this.tag_code = param1DataReq.tag_code;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
