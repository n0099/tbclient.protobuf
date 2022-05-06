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
import tbclient.FrsPage.NebulaHotThread;

public final class NebulaHotThreads extends Message {
  public static final List<NebulaHotThread> DEFAULT_THREADS = Collections.emptyList();
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<NebulaHotThread> threads;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public NebulaHotThreads(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      list = paramBuilder.threads;
      if (list == null) {
        this.threads = DEFAULT_THREADS;
      } else {
        this.threads = Message.immutableCopyOf(list);
      } 
    } else {
      this.url = ((Builder)list).url;
      this.threads = Message.immutableCopyOf(((Builder)list).threads);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1126490397, "Ltbclient/FrsPage/NebulaHotThreads;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1126490397, "Ltbclient/FrsPage/NebulaHotThreads;");
          return;
        } 
      } 
    } 
  }
}
