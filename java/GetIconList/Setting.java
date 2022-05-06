package GetIconList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Setting extends Message {
  public static final Integer DEFAULT_AMOUNT_PAY_LIMIT;
  
  public static final Integer DEFAULT_VIP_EXTRA_PERCENT;
  
  public static final Integer DEFAULT_VIP_EXTRA_SWITCH;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer amount_pay_limit;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_extra_percent;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer vip_extra_switch;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1474270825, "Ltbclient/GetIconList/Setting;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1474270825, "Ltbclient/GetIconList/Setting;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_VIP_EXTRA_SWITCH = integer;
    DEFAULT_VIP_EXTRA_PERCENT = integer;
    DEFAULT_AMOUNT_PAY_LIMIT = integer;
  }
  
  public Setting(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.vip_extra_switch;
      if (integer1 == null) {
        this.vip_extra_switch = DEFAULT_VIP_EXTRA_SWITCH;
      } else {
        this.vip_extra_switch = integer1;
      } 
      integer1 = paramBuilder.vip_extra_percent;
      if (integer1 == null) {
        this.vip_extra_percent = DEFAULT_VIP_EXTRA_PERCENT;
      } else {
        this.vip_extra_percent = integer1;
      } 
      integer = paramBuilder.amount_pay_limit;
      if (integer == null) {
        this.amount_pay_limit = DEFAULT_AMOUNT_PAY_LIMIT;
      } else {
        this.amount_pay_limit = integer;
      } 
    } else {
      this.vip_extra_switch = ((Builder)integer).vip_extra_switch;
      this.vip_extra_percent = ((Builder)integer).vip_extra_percent;
      this.amount_pay_limit = ((Builder)integer).amount_pay_limit;
    } 
  }
}
