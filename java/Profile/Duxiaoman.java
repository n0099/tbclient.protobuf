package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Duxiaoman extends Message {
  public static final Integer DEFAULT_IS_END;
  
  public static final Integer DEFAULT_TOTAL_CASH;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_end;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total_cash;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1953189951, "Ltbclient/Profile/Duxiaoman;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1953189951, "Ltbclient/Profile/Duxiaoman;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_CASH = integer;
    DEFAULT_IS_END = integer;
  }
  
  public Duxiaoman(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.total_cash;
      if (integer1 == null) {
        this.total_cash = DEFAULT_TOTAL_CASH;
      } else {
        this.total_cash = integer1;
      } 
      integer = paramBuilder.is_end;
      if (integer == null) {
        this.is_end = DEFAULT_IS_END;
      } else {
        this.is_end = integer;
      } 
    } else {
      this.total_cash = ((Builder)integer).total_cash;
      this.is_end = ((Builder)integer).is_end;
    } 
  }
}
