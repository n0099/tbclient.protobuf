package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_IS_JAIL_BROKEN = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_jail_broken;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      integer = paramBuilder.is_jail_broken;
      if (integer == null) {
        this.is_jail_broken = DEFAULT_IS_JAIL_BROKEN;
      } else {
        this.is_jail_broken = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.is_jail_broken = ((Builder)integer).is_jail_broken;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1243160503, "Ltbclient/GetVipInfo/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1243160503, "Ltbclient/GetVipInfo/DataReq;");
          return;
        } 
      } 
    } 
  }
}
