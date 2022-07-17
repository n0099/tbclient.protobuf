package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumToolPerm extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_PERM = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long perm;
  
  public ForumToolPerm(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.perm;
      if (long_ == null) {
        this.perm = DEFAULT_PERM;
      } else {
        this.perm = long_;
      } 
    } else {
      this.perm = ((Builder)long_).perm;
    } 
  }
  
  public ForumToolPerm(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-729428004, "Ltbclient/ForumToolPerm;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-729428004, "Ltbclient/ForumToolPerm;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumToolPerm> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long perm;
    
    public Builder() {}
    
    public Builder(ForumToolPerm param1ForumToolPerm) {
      super(param1ForumToolPerm);
      if (param1ForumToolPerm == null)
        return; 
      this.perm = param1ForumToolPerm.perm;
    }
    
    public ForumToolPerm build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumToolPerm)interceptResult.objValue; 
      } 
      return new ForumToolPerm(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
