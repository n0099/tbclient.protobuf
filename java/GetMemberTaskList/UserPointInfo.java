package tbclient.GetMemberTaskList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPointInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_POINTS_TOTAL = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long points_total;
  
  public UserPointInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.points_total;
      if (long_ == null) {
        this.points_total = DEFAULT_POINTS_TOTAL;
      } else {
        this.points_total = long_;
      } 
    } else {
      this.points_total = ((Builder)long_).points_total;
    } 
  }
  
  public UserPointInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-561191698, "Ltbclient/GetMemberTaskList/UserPointInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-561191698, "Ltbclient/GetMemberTaskList/UserPointInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserPointInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long points_total;
    
    public Builder() {}
    
    public Builder(UserPointInfo param1UserPointInfo) {
      super(param1UserPointInfo);
      if (param1UserPointInfo == null)
        return; 
      this.points_total = param1UserPointInfo.points_total;
    }
    
    public UserPointInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserPointInfo)interceptResult.objValue; 
      } 
      return new UserPointInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
