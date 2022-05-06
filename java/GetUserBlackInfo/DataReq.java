package GetUserBlackInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_BLACK_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long black_uid;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      long_ = paramBuilder.black_uid;
      if (long_ == null) {
        this.black_uid = DEFAULT_BLACK_UID;
      } else {
        this.black_uid = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.black_uid = ((Builder)long_).black_uid;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-837011136, "Ltbclient/GetUserBlackInfo/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-837011136, "Ltbclient/GetUserBlackInfo/DataReq;");
          return;
        } 
      } 
    } 
  }
}
