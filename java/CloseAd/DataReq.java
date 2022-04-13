package CloseAd;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_VIP_CLOSE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_close;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      integer = paramBuilder.vip_close;
      if (integer == null) {
        this.vip_close = DEFAULT_VIP_CLOSE;
      } else {
        this.vip_close = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.vip_close = ((Builder)integer).vip_close;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(458780293, "Ltbclient/CloseAd/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(458780293, "Ltbclient/CloseAd/DataReq;");
          return;
        } 
      } 
    } 
  }
}
