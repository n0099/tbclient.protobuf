package ExcFrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcellentTagInfo extends Message {
  public static final Long DEFAULT_TAG_CODE = Long.valueOf(0L);
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  public ExcellentTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tag_code;
      if (long_ == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_;
      } 
      str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
    } else {
      this.tag_code = ((Builder)str).tag_code;
      this.tag_name = ((Builder)str).tag_name;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1870860362, "Ltbclient/ExcFrsPage/ExcellentTagInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1870860362, "Ltbclient/ExcFrsPage/ExcellentTagInfo;");
          return;
        } 
      } 
    } 
  }
}
