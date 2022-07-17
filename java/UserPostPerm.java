package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPostPerm extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_NOT_SHOW_HIDE_THREAD = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer not_show_hide_thread;
  
  public UserPostPerm(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.not_show_hide_thread;
      if (integer == null) {
        this.not_show_hide_thread = DEFAULT_NOT_SHOW_HIDE_THREAD;
      } else {
        this.not_show_hide_thread = integer;
      } 
    } else {
      this.not_show_hide_thread = ((Builder)integer).not_show_hide_thread;
    } 
  }
  
  public UserPostPerm(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-818199978, "Ltbclient/UserPostPerm;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-818199978, "Ltbclient/UserPostPerm;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserPostPerm> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer not_show_hide_thread;
    
    public Builder() {}
    
    public Builder(UserPostPerm param1UserPostPerm) {
      super(param1UserPostPerm);
      if (param1UserPostPerm == null)
        return; 
      this.not_show_hide_thread = param1UserPostPerm.not_show_hide_thread;
    }
    
    public UserPostPerm build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserPostPerm)interceptResult.objValue; 
      } 
      return new UserPostPerm(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
