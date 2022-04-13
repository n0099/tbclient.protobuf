package GetGiftListByCategoryId;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      this.common = paramBuilder.common;
    } else {
      this.category_id = paramBuilder.category_id;
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(641469164, "Ltbclient/GetGiftListByCategoryId/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(641469164, "Ltbclient/GetGiftListByCategoryId/DataReq;");
          return;
        } 
      } 
    } 
  }
}
