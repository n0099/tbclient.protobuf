package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DelThreadText extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_TEXT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT_INFO = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer text_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text_info;
  
  public DelThreadText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.text_id;
      if (integer == null) {
        this.text_id = DEFAULT_TEXT_ID;
      } else {
        this.text_id = integer;
      } 
      str = paramBuilder.text_info;
      if (str == null) {
        this.text_info = "";
      } else {
        this.text_info = str;
      } 
    } else {
      this.text_id = ((Builder)str).text_id;
      this.text_info = ((Builder)str).text_info;
    } 
  }
  
  public DelThreadText(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-104100061, "Ltbclient/DelThreadText;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-104100061, "Ltbclient/DelThreadText;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DelThreadText> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer text_id;
    
    public String text_info;
    
    public Builder() {}
    
    public Builder(DelThreadText param1DelThreadText) {
      super(param1DelThreadText);
      if (param1DelThreadText == null)
        return; 
      this.text_id = param1DelThreadText.text_id;
      this.text_info = param1DelThreadText.text_info;
    }
    
    public DelThreadText build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DelThreadText)interceptResult.objValue; 
      } 
      return new DelThreadText(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
