package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Identify extends Message {
  public static final String DEFAULT_ID = "";
  
  public static final Integer DEFAULT_IS_IDENTIFY = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_identify;
  
  public Identify(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_identify;
      if (integer == null) {
        this.is_identify = DEFAULT_IS_IDENTIFY;
      } else {
        this.is_identify = integer;
      } 
      str = paramBuilder.id;
      if (str == null) {
        this.id = "";
      } else {
        this.id = str;
      } 
    } else {
      this.is_identify = ((Builder)str).is_identify;
      this.id = ((Builder)str).id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(737965164, "Ltbclient/FrsPage/Identify;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(737965164, "Ltbclient/FrsPage/Identify;");
          return;
        } 
      } 
    } 
  }
}
