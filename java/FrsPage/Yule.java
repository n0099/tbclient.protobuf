package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsPage.YuleActivity;

public final class Yule extends Message {
  public static final Integer DEFAULT_ACTIVITY_SHOW = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_show;
  
  @ProtoField(tag = 1)
  public final YuleActivity yule_activity;
  
  public Yule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.yule_activity = paramBuilder.yule_activity;
      integer = paramBuilder.activity_show;
      if (integer == null) {
        this.activity_show = DEFAULT_ACTIVITY_SHOW;
      } else {
        this.activity_show = integer;
      } 
    } else {
      this.yule_activity = ((Builder)integer).yule_activity;
      this.activity_show = ((Builder)integer).activity_show;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1068542589, "Ltbclient/FrsPage/Yule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1068542589, "Ltbclient/FrsPage/Yule;");
          return;
        } 
      } 
    } 
  }
}
