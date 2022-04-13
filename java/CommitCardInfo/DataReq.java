package CommitCardInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_CARD_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_IMAGE_INFO = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer card_type;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String image_info;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer = paramBuilder.card_type;
      if (integer == null) {
        this.card_type = DEFAULT_CARD_TYPE;
      } else {
        this.card_type = integer;
      } 
      str = paramBuilder.image_info;
      if (str == null) {
        this.image_info = "";
      } else {
        this.image_info = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.card_type = ((Builder)str).card_type;
      this.image_info = ((Builder)str).image_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1334450359, "Ltbclient/CommitCardInfo/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1334450359, "Ltbclient/CommitCardInfo/DataReq;");
          return;
        } 
      } 
    } 
  }
}
