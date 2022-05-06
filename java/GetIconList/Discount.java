package GetIconList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Discount extends Message {
  public static final Integer DEFAULT_REBATE;
  
  public static final Integer DEFAULT_RECHARGE;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rebate;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer recharge;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-102876434, "Ltbclient/GetIconList/Discount;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-102876434, "Ltbclient/GetIconList/Discount;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RECHARGE = integer;
    DEFAULT_REBATE = integer;
  }
  
  public Discount(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.recharge;
      if (integer1 == null) {
        this.recharge = DEFAULT_RECHARGE;
      } else {
        this.recharge = integer1;
      } 
      integer = paramBuilder.rebate;
      if (integer == null) {
        this.rebate = DEFAULT_REBATE;
      } else {
        this.rebate = integer;
      } 
    } else {
      this.recharge = ((Builder)integer).recharge;
      this.rebate = ((Builder)integer).rebate;
    } 
  }
}
