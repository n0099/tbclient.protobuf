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

public final class BawuRoleDes extends Message {
  public static Interceptable $ic;
  
  public static final List<BawuRoleInfoPub> DEFAULT_ROLE_INFO = Collections.emptyList();
  
  public static final String DEFAULT_ROLE_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BawuRoleInfoPub> role_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String role_name;
  
  public BawuRoleDes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BawuRoleInfoPub> list;
    if (paramBoolean == true) {
      String str = paramBuilder.role_name;
      if (str == null) {
        this.role_name = "";
      } else {
        this.role_name = str;
      } 
      list = paramBuilder.role_info;
      if (list == null) {
        this.role_info = DEFAULT_ROLE_INFO;
      } else {
        this.role_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.role_name = ((Builder)list).role_name;
      this.role_info = Message.immutableCopyOf(((Builder)list).role_info);
    } 
  }
  
  public BawuRoleDes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1178701926, "Ltbclient/BawuRoleDes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1178701926, "Ltbclient/BawuRoleDes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BawuRoleDes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<BawuRoleInfoPub> role_info;
    
    public String role_name;
    
    public Builder() {}
    
    public Builder(BawuRoleDes param1BawuRoleDes) {
      super(param1BawuRoleDes);
      if (param1BawuRoleDes == null)
        return; 
      this.role_name = param1BawuRoleDes.role_name;
      this.role_info = Message.copyOf(param1BawuRoleDes.role_info);
    }
    
    public BawuRoleDes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BawuRoleDes)interceptResult.objValue; 
      } 
      return new BawuRoleDes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
