package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Good extends Message {
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer num;
  
  public Good(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.num = ((Builder)integer).num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1085341861, "Ltbclient/FrsPage/Good;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1085341861, "Ltbclient/FrsPage/Good;");
          return;
        } 
      } 
    } 
  }
}
