package StarTrends;

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

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_list;
  
  static {
    DEFAULT_THREAD_LIST = Collections.emptyList();
    DEFAULT_HAS_MORE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)integer).user_list);
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1147645986, "Ltbclient/StarTrends/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1147645986, "Ltbclient/StarTrends/DataRes;");
          return;
        } 
      } 
    } 
  }
}
