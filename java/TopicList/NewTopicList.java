package tbclient.TopicList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewTopicList extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_IMAGE = "";
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final Integer DEFAULT_TOPIC_TAG;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer topic_tag;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-113853246, "Ltbclient/TopicList/NewTopicList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-113853246, "Ltbclient/TopicList/NewTopicList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOPIC_TAG = integer;
    DEFAULT_IS_VIDEO_TOPIC = integer;
  }
  
  public NewTopicList(Builder paramBuilder, boolean paramBoolean) {
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
      Integer integer1 = paramBuilder.topic_tag;
      if (integer1 == null) {
        this.topic_tag = DEFAULT_TOPIC_TAG;
      } else {
        this.topic_tag = integer1;
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
      this.topic_desc = ((Builder)integer).topic_desc;
      this.discuss_num = ((Builder)integer).discuss_num;
      this.topic_image = ((Builder)integer).topic_image;
      this.topic_tag = ((Builder)integer).topic_tag;
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public NewTopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long discuss_num;
    
    public Integer is_video_topic;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_image;
    
    public String topic_name;
    
    public Integer topic_tag;
    
    public Builder() {}
    
    public Builder(NewTopicList param1NewTopicList) {
      super(param1NewTopicList);
      if (param1NewTopicList == null)
        return; 
      this.topic_id = param1NewTopicList.topic_id;
      this.topic_name = param1NewTopicList.topic_name;
      this.topic_desc = param1NewTopicList.topic_desc;
      this.discuss_num = param1NewTopicList.discuss_num;
      this.topic_image = param1NewTopicList.topic_image;
      this.topic_tag = param1NewTopicList.topic_tag;
      this.is_video_topic = param1NewTopicList.is_video_topic;
    }
    
    public NewTopicList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewTopicList)interceptResult.objValue; 
      } 
      return new NewTopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
