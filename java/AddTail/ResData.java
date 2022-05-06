package AddTail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static final Long DEFAULT_TAILID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tailId;
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.tailId;
      if (long_ == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = long_;
      } 
    } else {
      this.tailId = ((Builder)long_).tailId;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(953660889, "Ltbclient/AddTail/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(953660889, "Ltbclient/AddTail/ResData;");
          return;
        } 
      } 
    } 
  }
}
