package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrivateForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PRIVATE_FORUM_AUDIT_STATUS;
  
  public static final Integer DEFAULT_PRIVATE_FORUM_STATUS;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer private_forum_audit_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer private_forum_status;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1469869339, "Ltbclient/PrivateForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1469869339, "Ltbclient/PrivateForumInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PRIVATE_FORUM_STATUS = integer;
    DEFAULT_PRIVATE_FORUM_AUDIT_STATUS = integer;
  }
  
  public PrivateForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.private_forum_status;
      if (integer1 == null) {
        this.private_forum_status = DEFAULT_PRIVATE_FORUM_STATUS;
      } else {
        this.private_forum_status = integer1;
      } 
      integer = paramBuilder.private_forum_audit_status;
      if (integer == null) {
        this.private_forum_audit_status = DEFAULT_PRIVATE_FORUM_AUDIT_STATUS;
      } else {
        this.private_forum_audit_status = integer;
      } 
    } else {
      this.private_forum_status = ((Builder)integer).private_forum_status;
      this.private_forum_audit_status = ((Builder)integer).private_forum_audit_status;
    } 
  }
  
  public PrivateForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PrivateForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer private_forum_audit_status;
    
    public Integer private_forum_status;
    
    public Builder() {}
    
    public Builder(PrivateForumInfo param1PrivateForumInfo) {
      super(param1PrivateForumInfo);
      if (param1PrivateForumInfo == null)
        return; 
      this.private_forum_status = param1PrivateForumInfo.private_forum_status;
      this.private_forum_audit_status = param1PrivateForumInfo.private_forum_audit_status;
    }
    
    public PrivateForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PrivateForumInfo)interceptResult.objValue; 
      } 
      return new PrivateForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
