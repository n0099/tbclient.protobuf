import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ManagerApplyInfo;

public final class ManagerApplyInfo extends Message {
  public static final Integer DEFAULT_MANAGER_APPLY_STATUS;
  
  public static final String DEFAULT_MANAGER_APPLY_URL = "";
  
  public static final Integer DEFAULT_MANAGER_LEFT_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer manager_apply_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String manager_apply_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer manager_left_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-527875486, "Ltbclient/ManagerApplyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-527875486, "Ltbclient/ManagerApplyInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MANAGER_LEFT_NUM = integer;
    DEFAULT_MANAGER_APPLY_STATUS = integer;
  }
  
  public ManagerApplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.manager_left_num;
      if (integer1 == null) {
        this.manager_left_num = DEFAULT_MANAGER_LEFT_NUM;
      } else {
        this.manager_left_num = integer1;
      } 
      String str = paramBuilder.manager_apply_url;
      if (str == null) {
        this.manager_apply_url = "";
      } else {
        this.manager_apply_url = str;
      } 
      integer = paramBuilder.manager_apply_status;
      if (integer == null) {
        this.manager_apply_status = DEFAULT_MANAGER_APPLY_STATUS;
      } else {
        this.manager_apply_status = integer;
      } 
    } else {
      this.manager_left_num = ((Builder)integer).manager_left_num;
      this.manager_apply_url = ((Builder)integer).manager_apply_url;
      this.manager_apply_status = ((Builder)integer).manager_apply_status;
    } 
  }
}
