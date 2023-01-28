package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_IS_COMM_REVERSE;
  
  public static final Long DEFAULT_KZ;
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final Integer DEFAULT_ORI_UGC_TYPE;
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final Long DEFAULT_PID;
  
  public static final Integer DEFAULT_PN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Long DEFAULT_SPID;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final String DEFAULT_TOP_UGC_PID = "";
  
  @ProtoField(tag = 9)
  public final CommonReq common;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_comm_reverse;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long kz;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer ori_ugc_type;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long pid;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long spid;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String top_ugc_pid;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_KZ = long_;
    DEFAULT_PID = long_;
    DEFAULT_SPID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_IS_COMM_REVERSE = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_ORI_UGC_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.kz;
      if (long_2 == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_2;
      } 
      long_2 = paramBuilder.pid;
      if (long_2 == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_2;
      } 
      long_2 = paramBuilder.spid;
      if (long_2 == null) {
        this.spid = DEFAULT_SPID;
      } else {
        this.spid = long_2;
      } 
      Integer integer3 = paramBuilder.pn;
      if (integer3 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer3;
      } 
      integer3 = paramBuilder.scr_w;
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
      String str3 = paramBuilder.st_type;
      if (str3 == null) {
        this.st_type = "";
      } else {
        this.st_type = str3;
      } 
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.is_comm_reverse;
      if (integer2 == null) {
        this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
      } else {
        this.is_comm_reverse = integer2;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      String str2 = paramBuilder.ori_ugc_nid;
      if (str2 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str2;
      } 
      str2 = paramBuilder.ori_ugc_tid;
      if (str2 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str2;
      } 
      Integer integer1 = paramBuilder.ori_ugc_type;
      if (integer1 == null) {
        this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
      } else {
        this.ori_ugc_type = integer1;
      } 
      String str1 = paramBuilder.ori_ugc_vid;
      if (str1 == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str1;
      } 
      str = paramBuilder.top_ugc_pid;
      if (str == null) {
        this.top_ugc_pid = "";
      } else {
        this.top_ugc_pid = str;
      } 
    } else {
      this.kz = ((Builder)str).kz;
      this.pid = ((Builder)str).pid;
      this.spid = ((Builder)str).spid;
      this.pn = ((Builder)str).pn;
      this.scr_w = ((Builder)str).scr_w;
      this.scr_h = ((Builder)str).scr_h;
      this.scr_dip = ((Builder)str).scr_dip;
      this.st_type = ((Builder)str).st_type;
      this.common = ((Builder)str).common;
      this.is_comm_reverse = ((Builder)str).is_comm_reverse;
      this.forum_id = ((Builder)str).forum_id;
      this.ori_ugc_nid = ((Builder)str).ori_ugc_nid;
      this.ori_ugc_tid = ((Builder)str).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)str).ori_ugc_type;
      this.ori_ugc_vid = ((Builder)str).ori_ugc_vid;
      this.top_ugc_pid = ((Builder)str).top_ugc_pid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer is_comm_reverse;
    
    public Long kz;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public Integer ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public Long pid;
    
    public Integer pn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Long spid;
    
    public String st_type;
    
    public String top_ugc_pid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.kz = param1DataReq.kz;
      this.pid = param1DataReq.pid;
      this.spid = param1DataReq.spid;
      this.pn = param1DataReq.pn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.st_type = param1DataReq.st_type;
      this.common = param1DataReq.common;
      this.is_comm_reverse = param1DataReq.is_comm_reverse;
      this.forum_id = param1DataReq.forum_id;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
      this.top_ugc_pid = param1DataReq.top_ugc_pid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
