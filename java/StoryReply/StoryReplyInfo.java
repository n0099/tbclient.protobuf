package StoryReply;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

public final class StoryReplyInfo extends Message {
  public static final String DEFAULT_CONTENT_TEXT = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 5)
  public final User author;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long post_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(659170440, "Ltbclient/StoryReply/StoryReplyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(659170440, "Ltbclient/StoryReply/StoryReplyInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_POST_ID = long_;
    DEFAULT_USER_ID = long_;
    DEFAULT_THREAD_ID = long_;
  }
  
  public StoryReplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str = paramBuilder.content_text;
      if (str == null) {
        this.content_text = "";
      } else {
        this.content_text = str;
      } 
      Long long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      this.author = paramBuilder.author;
    } else {
      this.post_id = paramBuilder.post_id;
      this.user_id = paramBuilder.user_id;
      this.content_text = paramBuilder.content_text;
      this.thread_id = paramBuilder.thread_id;
      this.author = paramBuilder.author;
    } 
  }
}
