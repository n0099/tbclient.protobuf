package GetSugTopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicList extends Message {
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC;
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final Integer DEFAULT_TAG;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final String DEFAULT_TOPIC_PIC = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer tag;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String topic_pic;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-32601337, "Ltbclient/GetSugTopic/TopicList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-32601337, "Ltbclient/GetSugTopic/TopicList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG = integer;
    DEFAULT_IS_VIDEO_TOPIC = integer;
  }
  
  public TopicList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
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
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      Integer integer2 = paramBuilder.tag;
      if (integer2 == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer2;
      } 
      String str1 = paramBuilder.topic_desc;
      if (str1 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str1;
      } 
      str1 = paramBuilder.topic_pic;
      if (str1 == null) {
        this.topic_pic = "";
      } else {
        this.topic_pic = str1;
      } 
      Integer integer1 = paramBuilder.is_video_topic;
      if (integer1 == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer1;
      } 
      str = paramBuilder.slogan;
      if (str == null) {
        this.slogan = "";
      } else {
        this.slogan = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.discuss_num = ((Builder)str).discuss_num;
      this.tag = ((Builder)str).tag;
      this.topic_desc = ((Builder)str).topic_desc;
      this.topic_pic = ((Builder)str).topic_pic;
      this.is_video_topic = ((Builder)str).is_video_topic;
      this.slogan = ((Builder)str).slogan;
    } 
  }
}
