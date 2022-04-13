package DeleteTail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final Integer DEFAULT_TAILID = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tailId;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tailId;
      if (integer == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.tailId = paramBuilder.tailId;
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-203174467, "Ltbclient/DeleteTail/ReqData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-203174467, "Ltbclient/DeleteTail/ReqData;");
          return;
        } 
      } 
    } 
  }
}
