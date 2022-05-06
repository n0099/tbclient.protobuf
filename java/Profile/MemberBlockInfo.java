package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MemberBlockInfo extends Message {
  public static final Integer DEFAULT_IS_AUTO_PAY;
  
  public static final Integer DEFAULT_IS_PERMANENT_BAN;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_auto_pay;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_permanent_ban;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2119296598, "Ltbclient/Profile/MemberBlockInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2119296598, "Ltbclient/Profile/MemberBlockInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_PERMANENT_BAN = integer;
    DEFAULT_IS_AUTO_PAY = integer;
  }
  
  public MemberBlockInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_permanent_ban;
      if (integer1 == null) {
        this.is_permanent_ban = DEFAULT_IS_PERMANENT_BAN;
      } else {
        this.is_permanent_ban = integer1;
      } 
      integer = paramBuilder.is_auto_pay;
      if (integer == null) {
        this.is_auto_pay = DEFAULT_IS_AUTO_PAY;
      } else {
        this.is_auto_pay = integer;
      } 
    } else {
      this.is_permanent_ban = ((Builder)integer).is_permanent_ban;
      this.is_auto_pay = ((Builder)integer).is_auto_pay;
    } 
  }
}
