package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PermissionList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CHAT;
  
  public static final Integer DEFAULT_FOLLOW;
  
  public static final Integer DEFAULT_INTERACT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer chat;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer follow;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer interact;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(573287588, "Ltbclient/PermissionList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(573287588, "Ltbclient/PermissionList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FOLLOW = integer;
    DEFAULT_INTERACT = integer;
    DEFAULT_CHAT = integer;
  }
  
  public PermissionList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.follow;
      if (integer1 == null) {
        this.follow = DEFAULT_FOLLOW;
      } else {
        this.follow = integer1;
      } 
      integer1 = paramBuilder.interact;
      if (integer1 == null) {
        this.interact = DEFAULT_INTERACT;
      } else {
        this.interact = integer1;
      } 
      integer = paramBuilder.chat;
      if (integer == null) {
        this.chat = DEFAULT_CHAT;
      } else {
        this.chat = integer;
      } 
    } else {
      this.follow = ((Builder)integer).follow;
      this.interact = ((Builder)integer).interact;
      this.chat = ((Builder)integer).chat;
    } 
  }
  
  public PermissionList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PermissionList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer chat;
    
    public Integer follow;
    
    public Integer interact;
    
    public Builder() {}
    
    public Builder(PermissionList param1PermissionList) {
      super(param1PermissionList);
      if (param1PermissionList == null)
        return; 
      this.follow = param1PermissionList.follow;
      this.interact = param1PermissionList.interact;
      this.chat = param1PermissionList.chat;
    }
    
    public PermissionList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PermissionList)interceptResult.objValue; 
      } 
      return new PermissionList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
