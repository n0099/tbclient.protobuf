package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Ecom extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_SELLER = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_seller;
  
  public Ecom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_seller;
      if (integer == null) {
        this.is_seller = DEFAULT_IS_SELLER;
      } else {
        this.is_seller = integer;
      } 
    } else {
      this.is_seller = ((Builder)integer).is_seller;
    } 
  }
  
  public Ecom(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1101275627, "Ltbclient/Ecom;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1101275627, "Ltbclient/Ecom;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Ecom> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_seller;
    
    public Builder() {}
    
    public Builder(Ecom param1Ecom) {
      super(param1Ecom);
      if (param1Ecom == null)
        return; 
      this.is_seller = param1Ecom.is_seller;
    }
    
    public Ecom build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Ecom)interceptResult.objValue; 
      } 
      return new Ecom(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
