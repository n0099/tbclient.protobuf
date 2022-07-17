package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DailyTopic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TOPIC_ABSTRACT = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  public static final String DEFAULT_TOPIC_RANK_URL = "";
  
  public static final String DEFAULT_TOPIC_TITLE = "";
  
  public static final String DEFAULT_TOPIC_URL = "";
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
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
  
  public DailyTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DailyTopic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String topic_abstract;
    
    public String topic_pic;
    
    public String topic_rank_url;
    
    public String topic_title;
    
    public String topic_url;
    
    public Builder() {}
    
    public Builder(DailyTopic param1DailyTopic) {
      super(param1DailyTopic);
      if (param1DailyTopic == null)
        return; 
      this.topic_title = param1DailyTopic.topic_title;
      this.topic_abstract = param1DailyTopic.topic_abstract;
      this.topic_pic = param1DailyTopic.topic_pic;
      this.topic_url = param1DailyTopic.topic_url;
      this.topic_rank_url = param1DailyTopic.topic_rank_url;
    }
    
    public DailyTopic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DailyTopic)interceptResult.objValue; 
      } 
      return new DailyTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
