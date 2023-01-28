package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ZhiBoInfoTW;

public final class ExcellentThreadInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_ABTEST = "";
  
  public static final Long DEFAULT_EXCID;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FRS_TYPE;
  
  public static final Integer DEFAULT_PB_TYPE;
  
  public static final Long DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final Long DEFAULT_RANK;
  
  public static final Integer DEFAULT_SOURCE;
  
  public static final Long DEFAULT_TAG_CODE;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final List<String> DEFAULT_THUMBNAIL;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Long DEFAULT_ZANSUM;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String abtest;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long excid;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer frs_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer pb_type;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT64)
  public final Long post_num;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT64)
  public final Long rank;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer source;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> thumbnail;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 13)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long zansum;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_EXCID = long_;
    DEFAULT_THREAD_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_FRS_TYPE = integer;
    DEFAULT_PB_TYPE = integer;
    DEFAULT_THUMBNAIL = Collections.emptyList();
    DEFAULT_TAG_CODE = long_;
    DEFAULT_ZANSUM = long_;
    DEFAULT_POST_NUM = long_;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_SOURCE = integer;
    DEFAULT_RANK = long_;
    DEFAULT_PUBLISH_TIME = integer;
  }
  
  public ExcellentThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_5 = paramBuilder.excid;
      if (long_5 == null) {
        this.excid = DEFAULT_EXCID;
      } else {
        this.excid = long_5;
      } 
      long_5 = paramBuilder.thread_id;
      if (long_5 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_5;
      } 
      Integer integer3 = paramBuilder.frs_type;
      if (integer3 == null) {
        this.frs_type = DEFAULT_FRS_TYPE;
      } else {
        this.frs_type = integer3;
      } 
      integer3 = paramBuilder.pb_type;
      if (integer3 == null) {
        this.pb_type = DEFAULT_PB_TYPE;
      } else {
        this.pb_type = integer3;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder._abstract;
      if (str3 == null) {
        this._abstract = "";
      } else {
        this._abstract = str3;
      } 
      List<String> list = paramBuilder.thumbnail;
      if (list == null) {
        this.thumbnail = DEFAULT_THUMBNAIL;
      } else {
        this.thumbnail = Message.immutableCopyOf(list);
      } 
      Long long_4 = paramBuilder.tag_code;
      if (long_4 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_4;
      } 
      String str2 = paramBuilder.tag_name;
      if (str2 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str2;
      } 
      Long long_3 = paramBuilder.zansum;
      if (long_3 == null) {
        this.zansum = DEFAULT_ZANSUM;
      } else {
        this.zansum = long_3;
      } 
      long_3 = paramBuilder.post_num;
      if (long_3 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_3;
      } 
      Integer integer2 = paramBuilder.thread_type;
      if (integer2 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer2;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.abtest;
      if (str1 == null) {
        this.abtest = "";
      } else {
        this.abtest = str1;
      } 
      Integer integer1 = paramBuilder.source;
      if (integer1 == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer1;
      } 
      Long long_1 = paramBuilder.rank;
      if (long_1 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = long_1;
      } 
      integer = paramBuilder.publish_time;
      if (integer == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer;
      } 
    } else {
      this.excid = ((Builder)integer).excid;
      this.thread_id = ((Builder)integer).thread_id;
      this.frs_type = ((Builder)integer).frs_type;
      this.pb_type = ((Builder)integer).pb_type;
      this.title = ((Builder)integer).title;
      this._abstract = ((Builder)integer)._abstract;
      this.thumbnail = Message.immutableCopyOf(((Builder)integer).thumbnail);
      this.tag_code = ((Builder)integer).tag_code;
      this.tag_name = ((Builder)integer).tag_name;
      this.zansum = ((Builder)integer).zansum;
      this.post_num = ((Builder)integer).post_num;
      this.thread_type = ((Builder)integer).thread_type;
      this.twzhibo_info = ((Builder)integer).twzhibo_info;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.abtest = ((Builder)integer).abtest;
      this.source = ((Builder)integer).source;
      this.rank = ((Builder)integer).rank;
      this.publish_time = ((Builder)integer).publish_time;
    } 
  }
  
  public ExcellentThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcellentThreadInfo> {
    public String _abstract;
    
    public String abtest;
    
    public Long excid;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer frs_type;
    
    public Integer pb_type;
    
    public Long post_num;
    
    public Integer publish_time;
    
    public Long rank;
    
    public Integer source;
    
    public Long tag_code;
    
    public String tag_name;
    
    public Long thread_id;
    
    public Integer thread_type;
    
    public List<String> thumbnail;
    
    public String title;
    
    public ZhiBoInfoTW twzhibo_info;
    
    public Long zansum;
    
    public Builder() {}
    
    public Builder(ExcellentThreadInfo param1ExcellentThreadInfo) {
      super(param1ExcellentThreadInfo);
      if (param1ExcellentThreadInfo == null)
        return; 
      this.excid = param1ExcellentThreadInfo.excid;
      this.thread_id = param1ExcellentThreadInfo.thread_id;
      this.frs_type = param1ExcellentThreadInfo.frs_type;
      this.pb_type = param1ExcellentThreadInfo.pb_type;
      this.title = param1ExcellentThreadInfo.title;
      this._abstract = param1ExcellentThreadInfo._abstract;
      this.thumbnail = Message.copyOf(param1ExcellentThreadInfo.thumbnail);
      this.tag_code = param1ExcellentThreadInfo.tag_code;
      this.tag_name = param1ExcellentThreadInfo.tag_name;
      this.zansum = param1ExcellentThreadInfo.zansum;
      this.post_num = param1ExcellentThreadInfo.post_num;
      this.thread_type = param1ExcellentThreadInfo.thread_type;
      this.twzhibo_info = param1ExcellentThreadInfo.twzhibo_info;
      this.forum_id = param1ExcellentThreadInfo.forum_id;
      this.forum_name = param1ExcellentThreadInfo.forum_name;
      this.abtest = param1ExcellentThreadInfo.abtest;
      this.source = param1ExcellentThreadInfo.source;
      this.rank = param1ExcellentThreadInfo.rank;
      this.publish_time = param1ExcellentThreadInfo.publish_time;
    }
    
    public ExcellentThreadInfo build(boolean param1Boolean) {
      return new ExcellentThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
