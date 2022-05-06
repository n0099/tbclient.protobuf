import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PriManagerApplyInfo;

public final class PriManagerApplyInfo extends Message {
  public static final Integer DEFAULT_ASSIST_APPLY_STATUS;
  
  public static final String DEFAULT_ASSIST_APPLY_URL = "";
  
  public static final Integer DEFAULT_ASSIST_LEFT_NUM;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer assist_apply_status;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String assist_apply_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer assist_left_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(628587023, "Ltbclient/PriManagerApplyInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(628587023, "Ltbclient/PriManagerApplyInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ASSIST_LEFT_NUM = integer;
    DEFAULT_ASSIST_APPLY_STATUS = integer;
  }
  
  public PriManagerApplyInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.assist_left_num;
      if (integer1 == null) {
        this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
      } else {
        this.assist_left_num = integer1;
      } 
      String str = paramBuilder.assist_apply_url;
      if (str == null) {
        this.assist_apply_url = "";
      } else {
        this.assist_apply_url = str;
      } 
      integer = paramBuilder.assist_apply_status;
      if (integer == null) {
        this.assist_apply_status = DEFAULT_ASSIST_APPLY_STATUS;
      } else {
        this.assist_apply_status = integer;
      } 
    } else {
      this.assist_left_num = ((Builder)integer).assist_left_num;
      this.assist_apply_url = ((Builder)integer).assist_apply_url;
      this.assist_apply_status = ((Builder)integer).assist_apply_status;
    } 
  }
}
