package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Identify extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_IDENTIFY = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_identify;
  
  public Identify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_identify;
      if (integer == null) {
        this.is_identify = DEFAULT_IS_IDENTIFY;
      } else {
        this.is_identify = integer;
      } 
      str = paramBuilder.id;
      if (str == null) {
        this.id = "";
      } else {
        this.id = str;
      } 
    } else {
      this.is_identify = ((Builder)str).is_identify;
      this.id = ((Builder)str).id;
    } 
  }
  
  public Identify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(737965164, "Ltbclient/FrsPage/Identify;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(737965164, "Ltbclient/FrsPage/Identify;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Identify> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String id;
    
    public Integer is_identify;
    
    public Builder() {}
    
    public Builder(Identify param1Identify) {
      super(param1Identify);
      if (param1Identify == null)
        return; 
      this.is_identify = param1Identify.is_identify;
      this.id = param1Identify.id;
    }
    
    public Identify build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Identify)interceptResult.objValue; 
      } 
      return new Identify(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
