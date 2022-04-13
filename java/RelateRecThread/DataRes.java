package RelateRecThread;

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

public final class DataRes extends Message {
  public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_REC_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rec_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> recom_thread_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.recom_thread_info;
      if (list == null) {
        this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
      } else {
        this.recom_thread_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.rec_type;
      if (integer == null) {
        this.rec_type = DEFAULT_REC_TYPE;
      } else {
        this.rec_type = integer;
      } 
    } else {
      this.recom_thread_info = Message.immutableCopyOf(((Builder)integer).recom_thread_info);
      this.rec_type = ((Builder)integer).rec_type;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-66958243, "Ltbclient/RelateRecThread/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-66958243, "Ltbclient/RelateRecThread/DataRes;");
          return;
        } 
      } 
    } 
  }
}
