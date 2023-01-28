package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Topic extends Message {
  public static final Integer DEFAULT_IS_LPOST;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_TOPIC_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_lpost;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer topic_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LPOST = integer;
    DEFAULT_TOPIC_TYPE = integer;
  }
  
  public Topic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_lpost;
      if (integer == null) {
        this.is_lpost = DEFAULT_IS_LPOST;
      } else {
        this.is_lpost = integer;
      } 
      integer = paramBuilder.topic_type;
      if (integer == null) {
        this.topic_type = DEFAULT_TOPIC_TYPE;
      } else {
        this.topic_type = integer;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.is_lpost = ((Builder)str).is_lpost;
      this.topic_type = ((Builder)str).topic_type;
      this.link = ((Builder)str).link;
    } 
  }
  
  public Topic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Topic> {
    public Integer is_lpost;
    
    public String link;
    
    public Integer topic_type;
    
    public Builder() {}
    
    public Builder(Topic param1Topic) {
      super(param1Topic);
      if (param1Topic == null)
        return; 
      this.is_lpost = param1Topic.is_lpost;
      this.topic_type = param1Topic.topic_type;
      this.link = param1Topic.link;
    }
    
    public Topic build(boolean param1Boolean) {
      return new Topic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
