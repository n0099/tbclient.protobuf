package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Media;
import tbclient.VideoInfo;

public final class TopicList extends Message {
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final String DEFAULT_TOPIC_H5_URL = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final Integer DEFAULT_TOPIC_THREAD_TYPES;
  
  public static final Long DEFAULT_TOPIC_TID;
  
  public static final String DEFAULT_TOPIC_USER_NAME = "";
  
  public static final Long DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<Media> media;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer tag;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String topic_h5_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer topic_thread_types;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long topic_tid;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String topic_user_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long update_time;
  
  @ProtoField(tag = 12)
  public final VideoInfo video_info;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG = integer;
    DEFAULT_UPDATE_TIME = long_;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_TOPIC_TID = long_;
    DEFAULT_TOPIC_THREAD_TYPES = integer;
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_4 = paramBuilder.topic_id;
      if (long_4 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_4;
      } 
      String str4 = paramBuilder.topic_name;
      if (str4 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str4;
      } 
      Long long_3 = paramBuilder.discuss_num;
      if (long_3 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_3;
      } 
      Integer integer1 = paramBuilder.tag;
      if (integer1 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer1;
      } 
      String str3 = paramBuilder.topic_desc;
      if (str3 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str3;
      } 
      str3 = paramBuilder.topic_pic;
      if (str3 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str3;
      } 
      Long long_2 = paramBuilder.update_time;
      if (long_2 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = long_2;
      } 
      String str2 = paramBuilder.topic_user_name;
      if (str2 == null) {
        this.topic_user_name = "";
      } else {
        this.topic_user_name = str2;
      } 
      List<Media> list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.topic_tid;
      if (long_1 == null) {
        this.topic_tid = DEFAULT_TOPIC_TID;
      } else {
        this.topic_tid = long_1;
      } 
      String str1 = paramBuilder.topic_h5_url;
      if (str1 == null) {
        this.topic_h5_url = "";
      } else {
        this.topic_h5_url = str1;
      } 
      this.video_info = paramBuilder.video_info;
      integer = paramBuilder.topic_thread_types;
      if (integer == null) {
        this.topic_thread_types = DEFAULT_TOPIC_THREAD_TYPES;
      } else {
        this.topic_thread_types = integer;
      } 
    } else {
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.discuss_num = ((Builder)integer).discuss_num;
      this.tag = ((Builder)integer).tag;
      this.topic_desc = ((Builder)integer).topic_desc;
      this.topic_pic = ((Builder)integer).topic_pic;
      this.update_time = ((Builder)integer).update_time;
      this.topic_user_name = ((Builder)integer).topic_user_name;
      this.media = Message.immutableCopyOf(((Builder)integer).media);
      this.topic_tid = ((Builder)integer).topic_tid;
      this.topic_h5_url = ((Builder)integer).topic_h5_url;
      this.video_info = ((Builder)integer).video_info;
      this.topic_thread_types = ((Builder)integer).topic_thread_types;
    } 
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicList> {
    public Long discuss_num;
    
    public List<Media> media;
    
    public Integer tag;
    
    public String topic_desc;
    
    public String topic_h5_url;
    
    public Long topic_id;
    
    public String topic_name;
    
    public String topic_pic;
    
    public Integer topic_thread_types;
    
    public Long topic_tid;
    
    public String topic_user_name;
    
    public Long update_time;
    
    public VideoInfo video_info;
    
    public Builder() {}
    
    public Builder(TopicList param1TopicList) {
      super(param1TopicList);
      if (param1TopicList == null)
        return; 
      this.topic_id = param1TopicList.topic_id;
      this.topic_name = param1TopicList.topic_name;
      this.discuss_num = param1TopicList.discuss_num;
      this.tag = param1TopicList.tag;
      this.topic_desc = param1TopicList.topic_desc;
      this.topic_pic = param1TopicList.topic_pic;
      this.update_time = param1TopicList.update_time;
      this.topic_user_name = param1TopicList.topic_user_name;
      this.media = Message.copyOf(param1TopicList.media);
      this.topic_tid = param1TopicList.topic_tid;
      this.topic_h5_url = param1TopicList.topic_h5_url;
      this.video_info = param1TopicList.video_info;
      this.topic_thread_types = param1TopicList.topic_thread_types;
    }
    
    public TopicList build(boolean param1Boolean) {
      return new TopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
