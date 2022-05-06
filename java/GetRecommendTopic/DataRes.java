package GetRecommendTopic;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetRecommendTopic.TopicListModule;

public final class DataRes extends Message {
  @ProtoField(tag = 3)
  public final TopicListModule recommend_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.recommend_topic = paramBuilder.recommend_topic;
    } else {
      this.recommend_topic = paramBuilder.recommend_topic;
    } 
  }
}
