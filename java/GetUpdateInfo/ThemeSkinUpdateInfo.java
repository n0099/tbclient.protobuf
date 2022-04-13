package GetUpdateInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeSkinUpdateInfo extends Message {
  public static final String DEFAULT_PACKAGE_URL = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final Integer DEFAULT_PROPS_VERSION;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String package_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer props_version;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1104914038, "Ltbclient/GetUpdateInfo/ThemeSkinUpdateInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1104914038, "Ltbclient/GetUpdateInfo/ThemeSkinUpdateInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_PROPS_VERSION = integer;
  }
  
  public ThemeSkinUpdateInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.props_version;
      if (integer == null) {
        this.props_version = DEFAULT_PROPS_VERSION;
      } else {
        this.props_version = integer;
      } 
      str = paramBuilder.package_url;
      if (str == null) {
        this.package_url = "";
      } else {
        this.package_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.props_version = ((Builder)str).props_version;
      this.package_url = ((Builder)str).package_url;
    } 
  }
}
