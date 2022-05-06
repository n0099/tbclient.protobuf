package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Bottle extends Message {
  public static final Integer DEFAULT_HAS_ENTER_DISPLAY = Integer.valueOf(0);
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_enter_display;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  public Bottle(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_enter_display;
      if (integer == null) {
        this.has_enter_display = DEFAULT_HAS_ENTER_DISPLAY;
      } else {
        this.has_enter_display = integer;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.has_enter_display = ((Builder)long_).has_enter_display;
      this.tid = ((Builder)long_).tid;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(526117938, "Ltbclient/FrsPage/Bottle;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(526117938, "Ltbclient/FrsPage/Bottle;");
          return;
        } 
      } 
    } 
  }
}
