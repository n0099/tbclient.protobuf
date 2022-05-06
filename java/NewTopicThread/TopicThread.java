package NewTopicThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class TopicThread extends Message {
  public static final Long DEFAULT_FEED_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_SOURCE = Integer.valueOf(0);
  
  public static final String DEFAULT_USER_AGREE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long feed_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 3)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_agree;
  
  public TopicThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.feed_id;
      if (long_ == null) {
        this.feed_id = DEFAULT_FEED_ID;
      } else {
        this.feed_id = long_;
      } 
      this.thread_info = paramBuilder.thread_info;
      String str = paramBuilder.user_agree;
      if (str == null) {
        this.user_agree = "";
      } else {
        this.user_agree = str;
      } 
      integer = paramBuilder.source;
      if (integer == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer;
      } 
    } else {
      this.feed_id = ((Builder)integer).feed_id;
      this.thread_info = ((Builder)integer).thread_info;
      this.user_agree = ((Builder)integer).user_agree;
      this.source = ((Builder)integer).source;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1615330350, "Ltbclient/NewTopicThread/TopicThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1615330350, "Ltbclient/NewTopicThread/TopicThread;");
          return;
        } 
      } 
    } 
  }
}
