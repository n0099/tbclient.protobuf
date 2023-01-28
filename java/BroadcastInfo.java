package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BroadcastInfo extends Message {
  public static final Integer DEFAULT_AUDIT_STATUS;
  
  public static final Long DEFAULT_BCAST_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_CTR = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final Integer DEFAULT_PUSHUSER_CNT;
  
  public static final Integer DEFAULT_PV;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer audit_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long bcast_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String ctr;
  
  @ProtoField(tag = 5)
  public final RecommendForumInfo forum_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer pushuser_cnt;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer pv;
  
  @ProtoField(tag = 10)
  public final ThreadInfo thread_infos;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PUBLISH_TIME = integer;
    DEFAULT_PUSHUSER_CNT = integer;
    DEFAULT_PV = integer;
    DEFAULT_AUDIT_STATUS = integer;
  }
  
  public BroadcastInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.bcast_id;
      if (long_ == null) {
        this.bcast_id = DEFAULT_BCAST_ID;
      } else {
        this.bcast_id = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.content;
      if (str2 == null) {
        this.content = "";
      } else {
        this.content = str2;
      } 
      this.forum_info = paramBuilder.forum_info;
      Integer integer2 = paramBuilder.publish_time;
      if (integer2 == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer2;
      } 
      integer2 = paramBuilder.pushuser_cnt;
      if (integer2 == null) {
        this.pushuser_cnt = DEFAULT_PUSHUSER_CNT;
      } else {
        this.pushuser_cnt = integer2;
      } 
      integer2 = paramBuilder.pv;
      if (integer2 == null) {
        this.pv = DEFAULT_PV;
      } else {
        this.pv = integer2;
      } 
      String str1 = paramBuilder.ctr;
      if (str1 == null) {
        this.ctr = "";
      } else {
        this.ctr = str1;
      } 
      this.thread_infos = paramBuilder.thread_infos;
      Integer integer1 = paramBuilder.audit_status;
      if (integer1 == null) {
        this.audit_status = DEFAULT_AUDIT_STATUS;
      } else {
        this.audit_status = integer1;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.bcast_id = ((Builder)str).bcast_id;
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.forum_info = ((Builder)str).forum_info;
      this.publish_time = ((Builder)str).publish_time;
      this.pushuser_cnt = ((Builder)str).pushuser_cnt;
      this.pv = ((Builder)str).pv;
      this.ctr = ((Builder)str).ctr;
      this.thread_infos = ((Builder)str).thread_infos;
      this.audit_status = ((Builder)str).audit_status;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  public BroadcastInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BroadcastInfo> {
    public Integer audit_status;
    
    public Long bcast_id;
    
    public String content;
    
    public String ctr;
    
    public RecommendForumInfo forum_info;
    
    public String pic_url;
    
    public Integer publish_time;
    
    public Integer pushuser_cnt;
    
    public Integer pv;
    
    public ThreadInfo thread_infos;
    
    public String title;
    
    public Builder() {}
    
    public Builder(BroadcastInfo param1BroadcastInfo) {
      super(param1BroadcastInfo);
      if (param1BroadcastInfo == null)
        return; 
      this.bcast_id = param1BroadcastInfo.bcast_id;
      this.title = param1BroadcastInfo.title;
      this.content = param1BroadcastInfo.content;
      this.forum_info = param1BroadcastInfo.forum_info;
      this.publish_time = param1BroadcastInfo.publish_time;
      this.pushuser_cnt = param1BroadcastInfo.pushuser_cnt;
      this.pv = param1BroadcastInfo.pv;
      this.ctr = param1BroadcastInfo.ctr;
      this.thread_infos = param1BroadcastInfo.thread_infos;
      this.audit_status = param1BroadcastInfo.audit_status;
      this.pic_url = param1BroadcastInfo.pic_url;
    }
    
    public BroadcastInfo build(boolean param1Boolean) {
      return new BroadcastInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
