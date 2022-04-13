package GetSugTopic;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetSugTopic.TopicListModule;

public final class DataRes extends Message {
  @ProtoField(tag = 2)
  public final TopicListModule bang_topic;
  
  @ProtoField(tag = 3)
  public final TopicListModule sug_topic;
  
  @ProtoField(tag = 1)
  public final TopicListModule user_his_topic;
  
  @ProtoField(tag = 5)
  public final TopicListModule video_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
    } else {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
    } 
  }
}
