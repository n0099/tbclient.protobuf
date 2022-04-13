package GetBgList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(133562503, "Ltbclient/GetBgList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(133562503, "Ltbclient/GetBgList/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.pn = paramBuilder.pn;
      this.rn = paramBuilder.rn;
      this.common = paramBuilder.common;
    } 
  }
}
