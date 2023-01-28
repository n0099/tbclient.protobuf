package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastContent extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_HAS_COLOR = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public ToastContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      integer = paramBuilder.has_color;
      if (integer == null) {
        this.has_color = DEFAULT_HAS_COLOR;
      } else {
        this.has_color = integer;
      } 
    } else {
      this.text = ((Builder)integer).text;
      this.has_color = ((Builder)integer).has_color;
    } 
  }
  
  public ToastContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2051444353, "Ltbclient/ToastContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2051444353, "Ltbclient/ToastContent;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ToastContent> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer has_color;
    
    public String text;
    
    public Builder() {}
    
    public Builder(ToastContent param1ToastContent) {
      super(param1ToastContent);
      if (param1ToastContent == null)
        return; 
      this.text = param1ToastContent.text;
      this.has_color = param1ToastContent.has_color;
    }
    
    public ToastContent build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ToastContent)interceptResult.objValue; 
      } 
      return new ToastContent(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
