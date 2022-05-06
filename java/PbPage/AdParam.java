package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdParam extends Message {
  public static final Integer DEFAULT_IS_REQ_AD;
  
  public static final Integer DEFAULT_LOAD_COUNT;
  
  public static final Integer DEFAULT_REFRESH_COUNT;
  
  public static final String DEFAULT_YOGA_LIB_VERSION = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_req_ad;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer load_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer refresh_count;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String yoga_lib_version;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-675057675, "Ltbclient/PbPage/AdParam;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-675057675, "Ltbclient/PbPage/AdParam;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOAD_COUNT = integer;
    DEFAULT_REFRESH_COUNT = integer;
    DEFAULT_IS_REQ_AD = integer;
  }
  
  public AdParam(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.load_count;
      if (integer1 == null) {
        this.load_count = DEFAULT_LOAD_COUNT;
      } else {
        this.load_count = integer1;
      } 
      integer1 = paramBuilder.refresh_count;
      if (integer1 == null) {
        this.refresh_count = DEFAULT_REFRESH_COUNT;
      } else {
        this.refresh_count = integer1;
      } 
      String str = paramBuilder.yoga_lib_version;
      if (str == null) {
        this.yoga_lib_version = "";
      } else {
        this.yoga_lib_version = str;
      } 
      integer = paramBuilder.is_req_ad;
      if (integer == null) {
        this.is_req_ad = DEFAULT_IS_REQ_AD;
      } else {
        this.is_req_ad = integer;
      } 
    } else {
      this.load_count = ((Builder)integer).load_count;
      this.refresh_count = ((Builder)integer).refresh_count;
      this.yoga_lib_version = ((Builder)integer).yoga_lib_version;
      this.is_req_ad = ((Builder)integer).is_req_ad;
    } 
  }
}
