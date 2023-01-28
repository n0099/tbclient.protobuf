package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_BFROM = "";
  
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String bfrom;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_FORUM_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_CALL_FROM = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
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
      Integer integer1 = paramBuilder.q_type;
      if (integer1 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer1;
      } 
      String str = paramBuilder.bfrom;
      if (str == null) {
        this.bfrom = "";
      } else {
        this.bfrom = str;
      } 
      integer = paramBuilder.call_from;
      if (integer == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.thread_id = ((Builder)integer).thread_id;
      this.post_id = ((Builder)integer).post_id;
      this.forum_id = ((Builder)integer).forum_id;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.bfrom = ((Builder)integer).bfrom;
      this.call_from = ((Builder)integer).call_from;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String bfrom;
    
    public Integer call_from;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public Long post_id;
    
    public Integer q_type;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Long thread_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.thread_id = param1DataReq.thread_id;
      this.post_id = param1DataReq.post_id;
      this.forum_id = param1DataReq.forum_id;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.bfrom = param1DataReq.bfrom;
      this.call_from = param1DataReq.call_from;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
