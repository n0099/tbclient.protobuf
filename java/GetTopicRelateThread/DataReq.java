package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_LAST_ID;
  
  public static final Integer DEFAULT_PAGE_NO;
  
  public static final Integer DEFAULT_PMY_SOURCE;
  
  public static final Long DEFAULT_PMY_TOPIC_ID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long last_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer page_no;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer pmy_source;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT64)
  public final Long pmy_topic_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_PAGE_NO = integer;
    DEFAULT_LAST_ID = long_;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_PMY_TOPIC_ID = long_;
    DEFAULT_PMY_SOURCE = integer;
    DEFAULT_SORT_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_3 = paramBuilder.topic_id;
      if (long_3 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_3;
      } 
      String str = paramBuilder.topic_name;
      if (str == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str;
      } 
      Integer integer4 = paramBuilder.rn;
      if (integer4 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer4;
      } 
      integer4 = paramBuilder.page_no;
      if (integer4 == null) {
        this.page_no = DEFAULT_PAGE_NO;
      } else {
        this.page_no = integer4;
      } 
      Long long_2 = paramBuilder.last_id;
      if (long_2 == null) {
        this.last_id = DEFAULT_LAST_ID;
      } else {
        this.last_id = long_2;
      } 
      Integer integer3 = paramBuilder.scr_w;
      if (integer3 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer3;
      } 
      integer3 = paramBuilder.scr_h;
      if (integer3 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer3;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer2 = paramBuilder.q_type;
      if (integer2 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer2;
      } 
      Long long_1 = paramBuilder.pmy_topic_id;
      if (long_1 == null) {
        this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
      } else {
        this.pmy_topic_id = long_1;
      } 
      Integer integer1 = paramBuilder.pmy_source;
      if (integer1 == null) {
        this.pmy_source = DEFAULT_PMY_SOURCE;
      } else {
        this.pmy_source = integer1;
      } 
      integer = paramBuilder.sort_type;
      if (integer == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.rn = ((Builder)integer).rn;
      this.page_no = ((Builder)integer).page_no;
      this.last_id = ((Builder)integer).last_id;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.pmy_topic_id = ((Builder)integer).pmy_topic_id;
      this.pmy_source = ((Builder)integer).pmy_source;
      this.sort_type = ((Builder)integer).sort_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long last_id;
    
    public Integer page_no;
    
    public Integer pmy_source;
    
    public Long pmy_topic_id;
    
    public Integer q_type;
    
    public Integer rn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer sort_type;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.topic_id = param1DataReq.topic_id;
      this.topic_name = param1DataReq.topic_name;
      this.rn = param1DataReq.rn;
      this.page_no = param1DataReq.page_no;
      this.last_id = param1DataReq.last_id;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.pmy_topic_id = param1DataReq.pmy_topic_id;
      this.pmy_source = param1DataReq.pmy_source;
      this.sort_type = param1DataReq.sort_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
