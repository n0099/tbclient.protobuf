package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Size extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_WIDTH;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1074427753, "Ltbclient/FrsPage/Size;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1074427753, "Ltbclient/FrsPage/Size;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public Size(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
    } else {
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
    } 
  }
  
  public Size(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Size> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer height;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(Size param1Size) {
      super(param1Size);
      if (param1Size == null)
        return; 
      this.width = param1Size.width;
      this.height = param1Size.height;
    }
    
    public Size build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Size)interceptResult.objValue; 
      } 
      return new Size(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
