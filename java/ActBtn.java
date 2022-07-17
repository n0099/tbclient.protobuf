package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActBtn extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ActBtn(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.url = ((Builder)str).url;
      this.text = ((Builder)str).text;
    } 
  }
  
  public ActBtn(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1015575321, "Ltbclient/ActBtn;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1015575321, "Ltbclient/ActBtn;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ActBtn> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String text;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ActBtn param1ActBtn) {
      super(param1ActBtn);
      if (param1ActBtn == null)
        return; 
      this.type = param1ActBtn.type;
      this.url = param1ActBtn.url;
      this.text = param1ActBtn.text;
    }
    
    public ActBtn build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ActBtn)interceptResult.objValue; 
      } 
      return new ActBtn(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
