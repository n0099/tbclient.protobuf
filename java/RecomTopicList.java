package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecomTopicList extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<Media> media;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer tag;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long update_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DISCUSS_NUM = long_;
    DEFAULT_TAG = integer;
    DEFAULT_UPDATE_TIME = long_;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_IS_VIDEO_TOPIC = integer;
  }
  
  public RecomTopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.topic_id;
      if (long_3 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_3;
      } 
      String str3 = paramBuilder.topic_name;
      if (str3 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str3;
      } 
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      Long long_2 = paramBuilder.discuss_num;
      if (long_2 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_2;
      } 
      Integer integer1 = paramBuilder.tag;
      if (integer1 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer1;
      } 
      String str2 = paramBuilder.topic_desc;
      if (str2 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str2;
      } 
      str2 = paramBuilder.topic_pic;
      if (str2 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str2;
      } 
      Long long_1 = paramBuilder.update_time;
      if (long_1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_1;
      } 
      String str1 = paramBuilder.author;
      if (str1 == null) {
        this.author = "";
      } else {
        this.author = str1;
      } 
      List<Media> list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.is_video_topic;
      if (integer == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer;
      } 
    } else {
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.type = ((Builder)integer).type;
      this.discuss_num = ((Builder)integer).discuss_num;
      this.tag = ((Builder)integer).tag;
      this.topic_desc = ((Builder)integer).topic_desc;
      this.topic_pic = ((Builder)integer).topic_pic;
      this.update_time = ((Builder)integer).update_time;
      this.author = ((Builder)integer).author;
      this.media = Message.immutableCopyOf(((Builder)integer).media);
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public RecomTopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomTopicList> {
    public String author;
    
    public Long discuss_num;
    
    public Integer is_video_topic;
    
    public List<Media> media;
    
    public Integer tag;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_name;
    
    public String topic_pic;
    
    public Integer type;
    
    public Long update_time;
    
    public Builder() {}
    
    public Builder(RecomTopicList param1RecomTopicList) {
      super(param1RecomTopicList);
      if (param1RecomTopicList == null)
        return; 
      this.topic_id = param1RecomTopicList.topic_id;
      this.topic_name = param1RecomTopicList.topic_name;
      this.type = param1RecomTopicList.type;
      this.discuss_num = param1RecomTopicList.discuss_num;
      this.tag = param1RecomTopicList.tag;
      this.topic_desc = param1RecomTopicList.topic_desc;
      this.topic_pic = param1RecomTopicList.topic_pic;
      this.update_time = param1RecomTopicList.update_time;
      this.author = param1RecomTopicList.author;
      this.media = Message.copyOf(param1RecomTopicList.media);
      this.is_video_topic = param1RecomTopicList.is_video_topic;
    }
    
    public RecomTopicList build(boolean param1Boolean) {
      return new RecomTopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
