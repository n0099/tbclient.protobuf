package RecomVideo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomVideo.ThreadPersonalized;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadPersonalized> thread_personalized;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.thread_personalized;
      if (list == null) {
        this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
      } else {
        this.thread_personalized = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
      this.thread_personalized = Message.immutableCopyOf(((Builder)list).thread_personalized);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(836048509, "Ltbclient/RecomVideo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(836048509, "Ltbclient/RecomVideo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
