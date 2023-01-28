package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicModule extends Message {
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final String DEFAULT_TOPIC_AVATAR = "";
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_IMAGE = "";
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 6)
  public final PkModule pk_module;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String topic_avatar;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
  }
  
  public TopicModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
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
      str2 = paramBuilder.topic_desc;
      if (str2 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str2;
      } 
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      String str1 = paramBuilder.topic_image;
      if (str1 == null) {
        this.topic_image = "";
      } else {
        this.topic_image = str1;
      } 
      this.pk_module = paramBuilder.pk_module;
      str = paramBuilder.topic_avatar;
      if (str == null) {
        this.topic_avatar = "";
      } else {
        this.topic_avatar = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.topic_desc = ((Builder)str).topic_desc;
      this.discuss_num = ((Builder)str).discuss_num;
      this.topic_image = ((Builder)str).topic_image;
      this.pk_module = ((Builder)str).pk_module;
      this.topic_avatar = ((Builder)str).topic_avatar;
    } 
  }
  
  public TopicModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicModule> {
    public Long discuss_num;
    
    public PkModule pk_module;
    
    public String topic_avatar;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_image;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(TopicModule param1TopicModule) {
      super(param1TopicModule);
      if (param1TopicModule == null)
        return; 
      this.topic_id = param1TopicModule.topic_id;
      this.topic_name = param1TopicModule.topic_name;
      this.topic_desc = param1TopicModule.topic_desc;
      this.discuss_num = param1TopicModule.discuss_num;
      this.topic_image = param1TopicModule.topic_image;
      this.pk_module = param1TopicModule.pk_module;
      this.topic_avatar = param1TopicModule.topic_avatar;
    }
    
    public TopicModule build(boolean param1Boolean) {
      return new TopicModule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
