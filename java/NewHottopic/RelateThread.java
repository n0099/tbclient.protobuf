package NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.NewHottopic.TopicThread;

public final class RelateThread extends Message {
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  public static final List<TopicThread> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TopicThread> thread_list;
  
  public RelateThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.has_more = ((Builder)list).has_more;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(863969153, "Ltbclient/NewHottopic/RelateThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(863969153, "Ltbclient/NewHottopic/RelateThread;");
          return;
        } 
      } 
    } 
  }
}
