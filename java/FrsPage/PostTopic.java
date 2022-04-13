package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostTopic extends Message {
  public static final String DEFAULT_CONTENT_TOPIC = "";
  
  public static final String DEFAULT_TITLE_TOPIC = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content_topic;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title_topic;
  
  public PostTopic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title_topic;
      if (str1 == null) {
        this.title_topic = "";
      } else {
        this.title_topic = str1;
      } 
      str = paramBuilder.content_topic;
      if (str == null) {
        this.content_topic = "";
      } else {
        this.content_topic = str;
      } 
    } else {
      this.title_topic = ((Builder)str).title_topic;
      this.content_topic = ((Builder)str).content_topic;
    } 
  }
}
