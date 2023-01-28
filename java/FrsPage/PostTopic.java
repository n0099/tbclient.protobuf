package tbclient.FrsPage;

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
    super(paramBuilder);
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
  
  public PostTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostTopic> {
    public String content_topic;
    
    public String title_topic;
    
    public Builder() {}
    
    public Builder(PostTopic param1PostTopic) {
      super(param1PostTopic);
      if (param1PostTopic == null)
        return; 
      this.title_topic = param1PostTopic.title_topic;
      this.content_topic = param1PostTopic.content_topic;
    }
    
    public PostTopic build(boolean param1Boolean) {
      return new PostTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
