package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpringVirtualUser extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_VIRTUAL = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_virtual;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public SpringVirtualUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_virtual;
      if (integer == null) {
        this.is_virtual = DEFAULT_IS_VIRTUAL;
      } else {
        this.is_virtual = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.is_virtual = ((Builder)str).is_virtual;
      this.url = ((Builder)str).url;
    } 
  }
  
  public SpringVirtualUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1994279580, "Ltbclient/SpringVirtualUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1994279580, "Ltbclient/SpringVirtualUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SpringVirtualUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_virtual;
    
    public String url;
    
    public Builder() {}
    
    public Builder(SpringVirtualUser param1SpringVirtualUser) {
      super(param1SpringVirtualUser);
      if (param1SpringVirtualUser == null)
        return; 
      this.is_virtual = param1SpringVirtualUser.is_virtual;
      this.url = param1SpringVirtualUser.url;
    }
    
    public SpringVirtualUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SpringVirtualUser)interceptResult.objValue; 
      } 
      return new SpringVirtualUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
