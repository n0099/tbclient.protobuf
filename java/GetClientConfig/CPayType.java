package tbclient.GetClientConfig;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CPayType extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PAY_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pay_type;
  
  public CPayType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.pay_type;
      if (integer == null) {
        this.pay_type = DEFAULT_PAY_TYPE;
      } else {
        this.pay_type = integer;
      } 
    } else {
      this.pay_type = ((Builder)integer).pay_type;
    } 
  }
  
  public CPayType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-985363834, "Ltbclient/GetClientConfig/CPayType;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-985363834, "Ltbclient/GetClientConfig/CPayType;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CPayType> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer pay_type;
    
    public Builder() {}
    
    public Builder(CPayType param1CPayType) {
      super(param1CPayType);
      if (param1CPayType == null)
        return; 
      this.pay_type = param1CPayType.pay_type;
    }
    
    public CPayType build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CPayType)interceptResult.objValue; 
      } 
      return new CPayType(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
