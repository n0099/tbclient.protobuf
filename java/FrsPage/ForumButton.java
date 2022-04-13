package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumButton extends Message {
  public static final Integer DEFAULT_IS_BLUEV = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_blueV;
  
  public ForumButton(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_blueV;
      if (integer == null) {
        this.is_blueV = DEFAULT_IS_BLUEV;
      } else {
        this.is_blueV = integer;
      } 
    } else {
      this.is_blueV = ((Builder)integer).is_blueV;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1359266805, "Ltbclient/FrsPage/ForumButton;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1359266805, "Ltbclient/FrsPage/ForumButton;");
          return;
        } 
      } 
    } 
  }
}
