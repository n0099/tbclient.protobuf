package ActiveConfig;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_IS_FIRST_UP;
  
  public static final Integer DEFAULT_IS_SCHEMA_UP;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_first_up;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_schema_up;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-314789916, "Ltbclient/ActiveConfig/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-314789916, "Ltbclient/ActiveConfig/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SCHEMA_UP = integer;
    DEFAULT_IS_FIRST_UP = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.is_schema_up;
      if (integer1 == null) {
        this.is_schema_up = DEFAULT_IS_SCHEMA_UP;
      } else {
        this.is_schema_up = integer1;
      } 
      integer = paramBuilder.is_first_up;
      if (integer == null) {
        this.is_first_up = DEFAULT_IS_FIRST_UP;
      } else {
        this.is_first_up = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.is_schema_up = ((Builder)integer).is_schema_up;
      this.is_first_up = ((Builder)integer).is_first_up;
    } 
  }
}
