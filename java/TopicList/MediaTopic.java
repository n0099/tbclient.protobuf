package TopicList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VideoInfo;

public final class MediaTopic extends Message {
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 3)
  public final VideoInfo video_info;
  
  public MediaTopic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str1 = paramBuilder.topic_name;
      if (str1 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str1;
      } 
      this.video_info = paramBuilder.video_info;
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.video_info = ((Builder)str).video_info;
      this.pic_url = ((Builder)str).pic_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1712209276, "Ltbclient/TopicList/MediaTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1712209276, "Ltbclient/TopicList/MediaTopic;");
          return;
        } 
      } 
    } 
  }
}
