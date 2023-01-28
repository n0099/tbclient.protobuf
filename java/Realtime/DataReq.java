package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ABTEST_TAG = "";
  
  public static final Integer DEFAULT_LOCATION;
  
  public static final String DEFAULT_ORI_UGC_NID = "";
  
  public static final String DEFAULT_ORI_UGC_TID = "";
  
  public static final String DEFAULT_ORI_UGC_TYPE = "";
  
  public static final String DEFAULT_ORI_UGC_VID = "";
  
  public static final String DEFAULT_PAGE = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_WEIGHT = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String abtest_tag;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer location;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ori_ugc_nid;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String ori_ugc_tid;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ori_ugc_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String ori_ugc_vid;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String page;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String source;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String weight;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOCATION = integer;
    DEFAULT_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str3 = paramBuilder.weight;
      if (str3 == null) {
        this.weight = "";
      } else {
        this.weight = str3;
      } 
      str3 = paramBuilder.source;
      if (str3 == null) {
        this.source = "";
      } else {
        this.source = str3;
      } 
      Integer integer2 = paramBuilder.location;
      if (integer2 == null) {
        this.location = DEFAULT_LOCATION;
      } else {
        this.location = integer2;
      } 
      String str2 = paramBuilder.abtest_tag;
      if (str2 == null) {
        this.abtest_tag = "";
      } else {
        this.abtest_tag = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      String str1 = paramBuilder.page;
      if (str1 == null) {
        this.page = "";
      } else {
        this.page = str1;
      } 
      str1 = paramBuilder.ori_ugc_nid;
      if (str1 == null) {
        this.ori_ugc_nid = "";
      } else {
        this.ori_ugc_nid = str1;
      } 
      str1 = paramBuilder.ori_ugc_tid;
      if (str1 == null) {
        this.ori_ugc_tid = "";
      } else {
        this.ori_ugc_tid = str1;
      } 
      str1 = paramBuilder.ori_ugc_type;
      if (str1 == null) {
        this.ori_ugc_type = "";
      } else {
        this.ori_ugc_type = str1;
      } 
      str = paramBuilder.ori_ugc_vid;
      if (str == null) {
        this.ori_ugc_vid = "";
      } else {
        this.ori_ugc_vid = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.tid = ((Builder)str).tid;
      this.weight = ((Builder)str).weight;
      this.source = ((Builder)str).source;
      this.location = ((Builder)str).location;
      this.abtest_tag = ((Builder)str).abtest_tag;
      this.type = ((Builder)str).type;
      this.page = ((Builder)str).page;
      this.ori_ugc_nid = ((Builder)str).ori_ugc_nid;
      this.ori_ugc_tid = ((Builder)str).ori_ugc_tid;
      this.ori_ugc_type = ((Builder)str).ori_ugc_type;
      this.ori_ugc_vid = ((Builder)str).ori_ugc_vid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String abtest_tag;
    
    public CommonReq common;
    
    public Integer location;
    
    public String ori_ugc_nid;
    
    public String ori_ugc_tid;
    
    public String ori_ugc_type;
    
    public String ori_ugc_vid;
    
    public String page;
    
    public String source;
    
    public Long tid;
    
    public Integer type;
    
    public String weight;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tid = param1DataReq.tid;
      this.weight = param1DataReq.weight;
      this.source = param1DataReq.source;
      this.location = param1DataReq.location;
      this.abtest_tag = param1DataReq.abtest_tag;
      this.type = param1DataReq.type;
      this.page = param1DataReq.page;
      this.ori_ugc_nid = param1DataReq.ori_ugc_nid;
      this.ori_ugc_tid = param1DataReq.ori_ugc_tid;
      this.ori_ugc_type = param1DataReq.ori_ugc_type;
      this.ori_ugc_vid = param1DataReq.ori_ugc_vid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
