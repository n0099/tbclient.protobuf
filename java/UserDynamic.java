package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserDynamic extends Message {
  public static Interceptable $ic;
  
  public static final List<User> DEFAULT_CONCERNED_USER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> concerned_user_list;
  
  public UserDynamic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      list = paramBuilder.concerned_user_list;
      if (list == null) {
        this.concerned_user_list = DEFAULT_CONCERNED_USER_LIST;
      } else {
        this.concerned_user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.concerned_user_list = Message.immutableCopyOf(((Builder)list).concerned_user_list);
    } 
  }
  
  public UserDynamic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-864024911, "Ltbclient/UserDynamic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-864024911, "Ltbclient/UserDynamic;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserDynamic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<User> concerned_user_list;
    
    public Builder() {}
    
    public Builder(UserDynamic param1UserDynamic) {
      super(param1UserDynamic);
      if (param1UserDynamic == null)
        return; 
      this.concerned_user_list = Message.copyOf(param1UserDynamic.concerned_user_list);
    }
    
    public UserDynamic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserDynamic)interceptResult.objValue; 
      } 
      return new UserDynamic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
