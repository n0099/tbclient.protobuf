package tbclient.GetBawuInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuTeam;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_PRIVATE_FORUM = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final BawuTeam bawu_team_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 2)
  public final ManagerApplyInfo manager_apply_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.bawu_team_info = paramBuilder.bawu_team_info;
      this.manager_apply_info = paramBuilder.manager_apply_info;
      integer = paramBuilder.is_private_forum;
      if (integer == null) {
        this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
      } else {
        this.is_private_forum = integer;
      } 
    } else {
      this.bawu_team_info = ((Builder)integer).bawu_team_info;
      this.manager_apply_info = ((Builder)integer).manager_apply_info;
      this.is_private_forum = ((Builder)integer).is_private_forum;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-951751267, "Ltbclient/GetBawuInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-951751267, "Ltbclient/GetBawuInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public BawuTeam bawu_team_info;
    
    public Integer is_private_forum;
    
    public ManagerApplyInfo manager_apply_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.bawu_team_info = param1DataRes.bawu_team_info;
      this.manager_apply_info = param1DataRes.manager_apply_info;
      this.is_private_forum = param1DataRes.is_private_forum;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
