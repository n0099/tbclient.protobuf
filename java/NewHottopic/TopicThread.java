package tbclient.NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class TopicThread extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FEED_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_SOURCE;
  
  public static final Integer DEFAULT_USER_AGREE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long feed_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 2)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_agree;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_AGREE = integer;
    DEFAULT_SOURCE = integer;
  }
  
  public TopicThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.feed_id;
      if (long_ == null) {
        this.feed_id = DEFAULT_FEED_ID;
      } else {
        this.feed_id = long_;
      } 
      this.thread_info = paramBuilder.thread_info;
      Integer integer1 = paramBuilder.user_agree;
      if (integer1 == null) {
        this.user_agree = DEFAULT_USER_AGREE;
      } else {
        this.user_agree = integer1;
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
  
  public TopicThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-584951687, "Ltbclient/NewHottopic/TopicThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-584951687, "Ltbclient/NewHottopic/TopicThread;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TopicThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long feed_id;
    
    public Integer source;
    
    public ThreadInfo thread_info;
    
    public Integer user_agree;
    
    public Builder() {}
    
    public Builder(TopicThread param1TopicThread) {
      super(param1TopicThread);
      if (param1TopicThread == null)
        return; 
      this.feed_id = param1TopicThread.feed_id;
      this.thread_info = param1TopicThread.thread_info;
      this.user_agree = param1TopicThread.user_agree;
      this.source = param1TopicThread.source;
    }
    
    public TopicThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TopicThread)interceptResult.objValue; 
      } 
      return new TopicThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
