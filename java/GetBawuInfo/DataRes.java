package GetBawuInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuTeam;
import tbclient.GetBawuInfo.ManagerApplyInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_PRIVATE_FORUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final BawuTeam bawu_team_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_private_forum;
  
  @ProtoField(tag = 2)
  public final ManagerApplyInfo manager_apply_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
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
}
