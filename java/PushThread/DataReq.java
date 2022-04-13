package PushThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_PUSH_TYPE;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer push_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1912359176, "Ltbclient/PushThread/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1912359176, "Ltbclient/PushThread/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_PUSH_TYPE = Integer.valueOf(0);
    DEFAULT_USER_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      long_1 = paramBuilder.thread_id;
      if (long_1 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_1;
      } 
      Integer integer = paramBuilder.push_type;
      if (integer == null) {
        this.push_type = DEFAULT_PUSH_TYPE;
      } else {
        this.push_type = integer;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.forum_id = ((Builder)long_).forum_id;
      this.thread_id = ((Builder)long_).thread_id;
      this.push_type = ((Builder)long_).push_type;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
}
