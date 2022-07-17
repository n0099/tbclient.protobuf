package tbclient.GetBawuInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ManagerApplyInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ASSIST_APPLY_URL = "";
  
  public static final Integer DEFAULT_ASSIST_LEFT_NUM;
  
  public static final String DEFAULT_MANAGER_APPLY_URL = "";
  
  public static final Integer DEFAULT_MANAGER_LEFT_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String assist_apply_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer assist_left_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String manager_apply_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer manager_left_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1858128428, "Ltbclient/GetBawuInfo/ManagerApplyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1858128428, "Ltbclient/GetBawuInfo/ManagerApplyInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MANAGER_LEFT_NUM = integer;
    DEFAULT_ASSIST_LEFT_NUM = integer;
  }
  
  public ManagerApplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.manager_left_num;
      if (integer2 == null) {
        this.manager_left_num = DEFAULT_MANAGER_LEFT_NUM;
      } else {
        this.manager_left_num = integer2;
      } 
      String str1 = paramBuilder.manager_apply_url;
      if (str1 == null) {
        this.manager_apply_url = "";
      } else {
        this.manager_apply_url = str1;
      } 
      Integer integer1 = paramBuilder.assist_left_num;
      if (integer1 == null) {
        this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
      } else {
        this.assist_left_num = integer1;
      } 
      str = paramBuilder.assist_apply_url;
      if (str == null) {
        this.assist_apply_url = "";
      } else {
        this.assist_apply_url = str;
      } 
    } else {
      this.manager_left_num = ((Builder)str).manager_left_num;
      this.manager_apply_url = ((Builder)str).manager_apply_url;
      this.assist_left_num = ((Builder)str).assist_left_num;
      this.assist_apply_url = ((Builder)str).assist_apply_url;
    } 
  }
  
  public ManagerApplyInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ManagerApplyInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String assist_apply_url;
    
    public Integer assist_left_num;
    
    public String manager_apply_url;
    
    public Integer manager_left_num;
    
    public Builder() {}
    
    public Builder(ManagerApplyInfo param1ManagerApplyInfo) {
      super(param1ManagerApplyInfo);
      if (param1ManagerApplyInfo == null)
        return; 
      this.manager_left_num = param1ManagerApplyInfo.manager_left_num;
      this.manager_apply_url = param1ManagerApplyInfo.manager_apply_url;
      this.assist_left_num = param1ManagerApplyInfo.assist_left_num;
      this.assist_apply_url = param1ManagerApplyInfo.assist_apply_url;
    }
    
    public ManagerApplyInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ManagerApplyInfo)interceptResult.objValue; 
      } 
      return new ManagerApplyInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
