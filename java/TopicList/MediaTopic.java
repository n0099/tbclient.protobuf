package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;

public final class MediaTopic extends Message {
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 3)
  public final VideoInfo video_info;
  
  public MediaTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str1 = paramBuilder.topic_name;
      if (str1 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str1;
      } 
      this.video_info = paramBuilder.video_info;
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.video_info = ((Builder)str).video_info;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  public MediaTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MediaTopic> {
    public String pic_url;
    
    public Long topic_id;
    
    public String topic_name;
    
    public VideoInfo video_info;
    
    public Builder() {}
    
    public Builder(MediaTopic param1MediaTopic) {
      super(param1MediaTopic);
      if (param1MediaTopic == null)
        return; 
      this.topic_id = param1MediaTopic.topic_id;
      this.topic_name = param1MediaTopic.topic_name;
      this.video_info = param1MediaTopic.video_info;
      this.pic_url = param1MediaTopic.pic_url;
    }
    
    public MediaTopic build(boolean param1Boolean) {
      return new MediaTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
