package tbclient.RedNotify;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RedNotify extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_NOTIFY_STATUS = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer notify_status;
  
  public RedNotify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.notify_status;
      if (integer == null) {
        this.notify_status = DEFAULT_NOTIFY_STATUS;
      } else {
        this.notify_status = integer;
      } 
    } else {
      this.notify_status = ((Builder)integer).notify_status;
    } 
  }
  
  public RedNotify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-366569920, "Ltbclient/RedNotify/RedNotify;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-366569920, "Ltbclient/RedNotify/RedNotify;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RedNotify> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer notify_status;
    
    public Builder() {}
    
    public Builder(RedNotify param1RedNotify) {
      super(param1RedNotify);
      if (param1RedNotify == null)
        return; 
      this.notify_status = param1RedNotify.notify_status;
    }
    
    public RedNotify build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RedNotify)interceptResult.objValue; 
      } 
      return new RedNotify(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
