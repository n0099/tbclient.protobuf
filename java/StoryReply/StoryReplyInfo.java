package tbclient.StoryReply;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

public final class StoryReplyInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT_TEXT = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
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
  
  public StoryReplyInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StoryReplyInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User author;
    
    public String content_text;
    
    public Long post_id;
    
    public Long thread_id;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(StoryReplyInfo param1StoryReplyInfo) {
      super(param1StoryReplyInfo);
      if (param1StoryReplyInfo == null)
        return; 
      this.post_id = param1StoryReplyInfo.post_id;
      this.user_id = param1StoryReplyInfo.user_id;
      this.content_text = param1StoryReplyInfo.content_text;
      this.thread_id = param1StoryReplyInfo.thread_id;
      this.author = param1StoryReplyInfo.author;
    }
    
    public StoryReplyInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (StoryReplyInfo)interceptResult.objValue; 
      } 
      return new StoryReplyInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
