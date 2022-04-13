package ZoneRight;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ZoneRight.Toast;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_RIGHT = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer has_right;
  
  @ProtoField(tag = 2)
  public final Toast toast;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_right;
      if (integer == null) {
        this.has_right = DEFAULT_HAS_RIGHT;
      } else {
        this.has_right = integer;
      } 
      this.toast = paramBuilder.toast;
    } else {
      this.has_right = paramBuilder.has_right;
      this.toast = paramBuilder.toast;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-848297394, "Ltbclient/ZoneRight/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-848297394, "Ltbclient/ZoneRight/DataRes;");
          return;
        } 
      } 
    } 
  }
}
