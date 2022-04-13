package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;

public final class PushThreadInfo extends Message {
  public static final Integer DEFAULT_HAS_PUSHCARD;
  
  public static final Integer DEFAULT_HAS_PUSHPLACE;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_pushcard;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_pushplace;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<User> user_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_PUSHCARD = integer;
    DEFAULT_HAS_PUSHPLACE = integer;
    DEFAULT_USER_LIST = Collections.emptyList();
  }
  
  public PushThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.has_pushcard;
      if (integer == null) {
        this.has_pushcard = DEFAULT_HAS_PUSHCARD;
      } else {
        this.has_pushcard = integer;
      } 
      integer = paramBuilder.has_pushplace;
      if (integer == null) {
        this.has_pushplace = DEFAULT_HAS_PUSHPLACE;
      } else {
        this.has_pushplace = integer;
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
      this.has_pushcard = ((Builder)list).has_pushcard;
      this.has_pushplace = ((Builder)list).has_pushplace;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(41471462, "Ltbclient/FrsPage/PushThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(41471462, "Ltbclient/FrsPage/PushThreadInfo;");
          return;
        } 
      } 
    } 
  }
}
