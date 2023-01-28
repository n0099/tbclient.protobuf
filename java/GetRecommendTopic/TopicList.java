package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicList extends Message {
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer tag;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG = integer;
    DEFAULT_IS_VIDEO_TOPIC = integer;
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      String str2 = paramBuilder.topic_name;
      if (str2 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str2;
      } 
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      Integer integer1 = paramBuilder.tag;
      if (integer1 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer1;
      } 
      String str1 = paramBuilder.topic_desc;
      if (str1 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str1;
      } 
      str1 = paramBuilder.topic_pic;
      if (str1 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str1;
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
      this.discuss_num = ((Builder)integer).discuss_num;
      this.tag = ((Builder)integer).tag;
      this.topic_desc = ((Builder)integer).topic_desc;
      this.topic_pic = ((Builder)integer).topic_pic;
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicList> {
    public Long discuss_num;
    
    public Integer is_video_topic;
    
    public Integer tag;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_name;
    
    public String topic_pic;
    
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
      this.is_video_topic = param1TopicList.is_video_topic;
    }
    
    public TopicList build(boolean param1Boolean) {
      return new TopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
