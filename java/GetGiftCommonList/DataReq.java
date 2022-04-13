package GetGiftCommonList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_TIMESTAMP = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer timestamp;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.timestamp;
      if (integer == null) {
        this.timestamp = DEFAULT_TIMESTAMP;
      } else {
        this.timestamp = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.timestamp = paramBuilder.timestamp;
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(468335953, "Ltbclient/GetGiftCommonList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(468335953, "Ltbclient/GetGiftCommonList/DataReq;");
          return;
        } 
      } 
    } 
  }
}
