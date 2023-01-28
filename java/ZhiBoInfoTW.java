package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ZhiBoInfoTW extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_COPYTHREAD_REMIND;
  
  public static final String DEFAULT_FIELD_EX = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FREQ_NUM;
  
  public static final Integer DEFAULT_IS_COPYTWZHIBO;
  
  public static final Integer DEFAULT_IS_HEADLINE;
  
  public static final List<LabelInfo> DEFAULT_LABELINFO;
  
  public static final Long DEFAULT_LAST_MODIFIED_TIME;
  
  public static final String DEFAULT_LIVECOVER_SRC = "";
  
  public static final String DEFAULT_LIVECOVER_SRC_BSIZE = "";
  
  public static final String DEFAULT_LIVECOVER_SRC_STATUS = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer copythread_remind;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String field_ex;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer freq_num;
  
  @ProtoField(tag = 13)
  public final HotTWThreadInfo hot_tw_info;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer is_copytwzhibo;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer is_headline;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<LabelInfo> labelInfo;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long last_modified_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String livecover_src;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String livecover_src_bsize;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String livecover_src_status;
  
  @ProtoField(tag = 18)
  public final LiveCoverStatus livecover_status;
  
  @ProtoField(tag = 16)
  public final NoticeInfo notice_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer reply_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 12)
  public final User user;
  
  @ProtoField(tag = 6)
  public final Zan zan;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_POST_NUM = integer;
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_LAST_MODIFIED_TIME = long_;
    DEFAULT_LABELINFO = Collections.emptyList();
    DEFAULT_IS_HEADLINE = integer;
    DEFAULT_FREQ_NUM = integer;
    DEFAULT_COPYTHREAD_REMIND = integer;
    DEFAULT_IS_COPYTWZHIBO = integer;
  }
  
  public ZhiBoInfoTW(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      String str4 = paramBuilder.livecover_src;
      if (str4 == null) {
        this.livecover_src = "";
      } else {
        this.livecover_src = str4;
      } 
      str4 = paramBuilder.livecover_src_bsize;
      if (str4 == null) {
        this.livecover_src_bsize = "";
      } else {
        this.livecover_src_bsize = str4;
      } 
      Integer integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      integer2 = paramBuilder.reply_num;
      if (integer2 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer2;
      } 
      this.zan = paramBuilder.zan;
      String str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      long_1 = paramBuilder.last_modified_time;
      if (long_1 == null) {
        this.last_modified_time = DEFAULT_LAST_MODIFIED_TIME;
      } else {
        this.last_modified_time = long_1;
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
      this.user = paramBuilder.user;
      this.hot_tw_info = paramBuilder.hot_tw_info;
      List<LabelInfo> list = paramBuilder.labelInfo;
      if (list == null) {
        this.labelInfo = DEFAULT_LABELINFO;
      } else {
        this.labelInfo = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.livecover_src_status;
      if (str1 == null) {
        this.livecover_src_status = "";
      } else {
        this.livecover_src_status = str1;
      } 
      this.notice_info = paramBuilder.notice_info;
      Integer integer1 = paramBuilder.is_headline;
      if (integer1 == null) {
        this.is_headline = DEFAULT_IS_HEADLINE;
      } else {
        this.is_headline = integer1;
      } 
      this.livecover_status = paramBuilder.livecover_status;
      integer1 = paramBuilder.freq_num;
      if (integer1 == null) {
        this.freq_num = DEFAULT_FREQ_NUM;
      } else {
        this.freq_num = integer1;
      } 
      integer1 = paramBuilder.copythread_remind;
      if (integer1 == null) {
        this.copythread_remind = DEFAULT_COPYTHREAD_REMIND;
      } else {
        this.copythread_remind = integer1;
      } 
      integer1 = paramBuilder.is_copytwzhibo;
      if (integer1 == null) {
        this.is_copytwzhibo = DEFAULT_IS_COPYTWZHIBO;
      } else {
        this.is_copytwzhibo = integer1;
      } 
      str = paramBuilder.field_ex;
      if (str == null) {
        this.field_ex = "";
      } else {
        this.field_ex = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.livecover_src = ((Builder)str).livecover_src;
      this.livecover_src_bsize = ((Builder)str).livecover_src_bsize;
      this.post_num = ((Builder)str).post_num;
      this.reply_num = ((Builder)str).reply_num;
      this.zan = ((Builder)str).zan;
      this.forum_name = ((Builder)str).forum_name;
      this.forum_id = ((Builder)str).forum_id;
      this.last_modified_time = ((Builder)str).last_modified_time;
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.user = ((Builder)str).user;
      this.hot_tw_info = ((Builder)str).hot_tw_info;
      this.labelInfo = Message.immutableCopyOf(((Builder)str).labelInfo);
      this.livecover_src_status = ((Builder)str).livecover_src_status;
      this.notice_info = ((Builder)str).notice_info;
      this.is_headline = ((Builder)str).is_headline;
      this.livecover_status = ((Builder)str).livecover_status;
      this.freq_num = ((Builder)str).freq_num;
      this.copythread_remind = ((Builder)str).copythread_remind;
      this.is_copytwzhibo = ((Builder)str).is_copytwzhibo;
      this.field_ex = ((Builder)str).field_ex;
    } 
  }
  
  public ZhiBoInfoTW(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ZhiBoInfoTW> {
    public String content;
    
    public Integer copythread_remind;
    
    public String field_ex;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer freq_num;
    
    public HotTWThreadInfo hot_tw_info;
    
    public Integer is_copytwzhibo;
    
    public Integer is_headline;
    
    public List<LabelInfo> labelInfo;
    
    public Long last_modified_time;
    
    public String livecover_src;
    
    public String livecover_src_bsize;
    
    public String livecover_src_status;
    
    public LiveCoverStatus livecover_status;
    
    public NoticeInfo notice_info;
    
    public Integer post_num;
    
    public Integer reply_num;
    
    public Long thread_id;
    
    public String title;
    
    public User user;
    
    public Zan zan;
    
    public Builder() {}
    
    public Builder(ZhiBoInfoTW param1ZhiBoInfoTW) {
      super(param1ZhiBoInfoTW);
      if (param1ZhiBoInfoTW == null)
        return; 
      this.thread_id = param1ZhiBoInfoTW.thread_id;
      this.livecover_src = param1ZhiBoInfoTW.livecover_src;
      this.livecover_src_bsize = param1ZhiBoInfoTW.livecover_src_bsize;
      this.post_num = param1ZhiBoInfoTW.post_num;
      this.reply_num = param1ZhiBoInfoTW.reply_num;
      this.zan = param1ZhiBoInfoTW.zan;
      this.forum_name = param1ZhiBoInfoTW.forum_name;
      this.forum_id = param1ZhiBoInfoTW.forum_id;
      this.last_modified_time = param1ZhiBoInfoTW.last_modified_time;
      this.title = param1ZhiBoInfoTW.title;
      this.content = param1ZhiBoInfoTW.content;
      this.user = param1ZhiBoInfoTW.user;
      this.hot_tw_info = param1ZhiBoInfoTW.hot_tw_info;
      this.labelInfo = Message.copyOf(param1ZhiBoInfoTW.labelInfo);
      this.livecover_src_status = param1ZhiBoInfoTW.livecover_src_status;
      this.notice_info = param1ZhiBoInfoTW.notice_info;
      this.is_headline = param1ZhiBoInfoTW.is_headline;
      this.livecover_status = param1ZhiBoInfoTW.livecover_status;
      this.freq_num = param1ZhiBoInfoTW.freq_num;
      this.copythread_remind = param1ZhiBoInfoTW.copythread_remind;
      this.is_copytwzhibo = param1ZhiBoInfoTW.is_copytwzhibo;
      this.field_ex = param1ZhiBoInfoTW.field_ex;
    }
    
    public ZhiBoInfoTW build(boolean param1Boolean) {
      return new ZhiBoInfoTW(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
