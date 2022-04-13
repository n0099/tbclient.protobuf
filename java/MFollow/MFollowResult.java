package MFollow;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MFollowResult extends Message {
  public static final Boolean DEFAULT_IS_SUCCESS = Boolean.FALSE;
  
  public static final String DEFAULT_MSG = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean is_success;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  public MFollowResult(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      Boolean bool = paramBuilder.is_success;
      if (bool == null) {
        this.is_success = DEFAULT_IS_SUCCESS;
      } else {
        this.is_success = bool;
      } 
      str = paramBuilder.msg;
      if (str == null) {
        this.msg = "";
      } else {
        this.msg = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.is_success = ((Builder)str).is_success;
      this.msg = ((Builder)str).msg;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2031070053, "Ltbclient/MFollow/MFollowResult;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2031070053, "Ltbclient/MFollow/MFollowResult;");
          return;
        } 
      } 
    } 
  }
}
