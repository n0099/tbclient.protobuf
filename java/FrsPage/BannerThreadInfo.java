package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class BannerThreadInfo extends Message {
  public static final Integer DEFAULT_FROM = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer from;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  public BannerThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      integer = paramBuilder.from;
      if (integer == null) {
        this.from = DEFAULT_FROM;
      } else {
        this.from = integer;
      } 
    } else {
      this.thread_info = ((Builder)integer).thread_info;
      this.from = ((Builder)integer).from;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2042860372, "Ltbclient/FrsPage/BannerThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2042860372, "Ltbclient/FrsPage/BannerThreadInfo;");
          return;
        } 
      } 
    } 
  }
}
