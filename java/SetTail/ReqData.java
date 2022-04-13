package SetTail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final Integer DEFAULT_TAILID;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tailId;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1989696902, "Ltbclient/SetTail/ReqData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1989696902, "Ltbclient/SetTail/ReqData;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_TAILID = integer;
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.tailId;
      if (integer == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.type = paramBuilder.type;
      this.tailId = paramBuilder.tailId;
      this.common = paramBuilder.common;
    } 
  }
}
