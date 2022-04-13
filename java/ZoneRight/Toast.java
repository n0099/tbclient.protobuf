package ZoneRight;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Toast extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  public Toast(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.content = ((Builder)str).content;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(18169117, "Ltbclient/ZoneRight/Toast;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(18169117, "Ltbclient/ZoneRight/Toast;");
          return;
        } 
      } 
    } 
  }
}
