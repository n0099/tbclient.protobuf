import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DailyTopic;

public final class DailyTopic extends Message {
  public static final String DEFAULT_TOPIC_ABSTRACT = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final String DEFAULT_TOPIC_RANK_URL = "";
  
  public static final String DEFAULT_TOPIC_TITLE = "";
  
  public static final String DEFAULT_TOPIC_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_abstract;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_rank_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String topic_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String topic_url;
  
  public DailyTopic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.topic_title;
      if (str1 == null) {
        this.topic_title = "";
      } else {
        this.topic_title = str1;
      } 
      str1 = paramBuilder.topic_abstract;
      if (str1 == null) {
        this.topic_abstract = "";
      } else {
        this.topic_abstract = str1;
      } 
      str1 = paramBuilder.topic_pic;
      if (str1 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str1;
      } 
      str1 = paramBuilder.topic_url;
      if (str1 == null) {
        this.topic_url = "";
      } else {
        this.topic_url = str1;
      } 
      str = paramBuilder.topic_rank_url;
      if (str == null) {
        this.topic_rank_url = "";
      } else {
        this.topic_rank_url = str;
      } 
    } else {
      this.topic_title = ((Builder)str).topic_title;
      this.topic_abstract = ((Builder)str).topic_abstract;
      this.topic_pic = ((Builder)str).topic_pic;
      this.topic_url = ((Builder)str).topic_url;
      this.topic_rank_url = ((Builder)str).topic_rank_url;
    } 
  }
}
