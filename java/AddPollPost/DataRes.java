package AddPollPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_ERROR_CODE = Integer.valueOf(0);
  
  public static final String DEFAULT_ERROR_MSG = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer error_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String error_msg;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.error_code;
      if (integer == null) {
        this.error_code = DEFAULT_ERROR_CODE;
      } else {
        this.error_code = integer;
      } 
      str = paramBuilder.error_msg;
      if (str == null) {
        this.error_msg = "";
      } else {
        this.error_msg = str;
      } 
    } else {
      this.error_code = ((Builder)str).error_code;
      this.error_msg = ((Builder)str).error_msg;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(386899678, "Ltbclient/AddPollPost/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(386899678, "Ltbclient/AddPollPost/DataRes;");
          return;
        } 
      } 
    } 
  }
}
