package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Error extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ERRMSG = "";
  
  public static final Integer DEFAULT_ERRORNO = Integer.valueOf(0);
  
  public static final String DEFAULT_USERMSG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String errmsg;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer errorno;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String usermsg;
  
  public Error(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.errorno;
      if (integer == null) {
        this.errorno = DEFAULT_ERRORNO;
      } else {
        this.errorno = integer;
      } 
      String str1 = paramBuilder.errmsg;
      if (str1 == null) {
        this.errmsg = "";
      } else {
        this.errmsg = str1;
      } 
      str = paramBuilder.usermsg;
      if (str == null) {
        this.usermsg = "";
      } else {
        this.usermsg = str;
      } 
    } else {
      this.errorno = ((Builder)str).errorno;
      this.errmsg = ((Builder)str).errmsg;
      this.usermsg = ((Builder)str).usermsg;
    } 
  }
  
  public Error(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(234139805, "Ltbclient/Error;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(234139805, "Ltbclient/Error;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Error> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String errmsg;
    
    public Integer errorno;
    
    public String usermsg;
    
    public Builder() {}
    
    public Builder(Error param1Error) {
      super(param1Error);
      if (param1Error == null)
        return; 
      this.errorno = param1Error.errorno;
      this.errmsg = param1Error.errmsg;
      this.usermsg = param1Error.usermsg;
    }
    
    public Error build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Error)interceptResult.objValue; 
      } 
      return new Error(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
