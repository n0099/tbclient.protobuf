package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final Long DEFAULT_FID;
  
  public static final String DEFAULT_FIRST_DIR = "";
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SECOND_DIR = "";
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final Long DEFAULT_TOPIC_TID;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String first_dir;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String second_dir;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT64)
  public final Long topic_tid;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_FID = long_;
    DEFAULT_CALL_FROM = integer;
    DEFAULT_TOPIC_TID = long_;
    DEFAULT_IS_VIDEO_TOPIC = integer;
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
      String str2 = paramBuilder.topic_name;
      if (str2 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str2;
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
      integer2 = paramBuilder.sort_type;
      if (integer2 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer2;
      } 
      Long long_2 = paramBuilder.fid;
      if (long_2 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_2;
      } 
      String str1 = paramBuilder.first_dir;
      if (str1 == null) {
        this.first_dir = "";
      } else {
        this.first_dir = str1;
      } 
      str1 = paramBuilder.second_dir;
      if (str1 == null) {
        this.second_dir = "";
      } else {
        this.second_dir = str1;
      } 
      Integer integer1 = paramBuilder.call_from;
      if (integer1 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer1;
      } 
      Long long_1 = paramBuilder.topic_tid;
      if (long_1 == null) {
        this.topic_tid = DEFAULT_TOPIC_TID;
      } else {
        this.topic_tid = long_1;
      } 
      integer = paramBuilder.is_video_topic;
      if (integer == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.sort_type = ((Builder)integer).sort_type;
      this.fid = ((Builder)integer).fid;
      this.first_dir = ((Builder)integer).first_dir;
      this.second_dir = ((Builder)integer).second_dir;
      this.call_from = ((Builder)integer).call_from;
      this.topic_tid = ((Builder)integer).topic_tid;
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public Integer call_from;
    
    public CommonReq common;
    
    public Long fid;
    
    public String first_dir;
    
    public Integer is_video_topic;
    
    public Integer q_type;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String second_dir;
    
    public Integer sort_type;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Long topic_tid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.topic_id = param1DataReq.topic_id;
      this.topic_name = param1DataReq.topic_name;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.sort_type = param1DataReq.sort_type;
      this.fid = param1DataReq.fid;
      this.first_dir = param1DataReq.first_dir;
      this.second_dir = param1DataReq.second_dir;
      this.call_from = param1DataReq.call_from;
      this.topic_tid = param1DataReq.topic_tid;
      this.is_video_topic = param1DataReq.is_video_topic;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
