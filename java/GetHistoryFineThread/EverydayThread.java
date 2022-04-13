package GetHistoryFineThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetHistoryFineThread.FineThreadInfo;

public final class EverydayThread extends Message {
  public static final List<FineThreadInfo> DEFAULT_FINE_THREAD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SHOW_TIME = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FineThreadInfo> fine_thread_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer show_time;
  
  public EverydayThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.fine_thread_list;
      if (list == null) {
        this.fine_thread_list = DEFAULT_FINE_THREAD_LIST;
      } else {
        this.fine_thread_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.show_time;
      if (integer == null) {
        this.show_time = DEFAULT_SHOW_TIME;
      } else {
        this.show_time = integer;
      } 
    } else {
      this.fine_thread_list = Message.immutableCopyOf(((Builder)integer).fine_thread_list);
      this.show_time = ((Builder)integer).show_time;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1732311891, "Ltbclient/GetHistoryFineThread/EverydayThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1732311891, "Ltbclient/GetHistoryFineThread/EverydayThread;");
          return;
        } 
      } 
    } 
  }
}
