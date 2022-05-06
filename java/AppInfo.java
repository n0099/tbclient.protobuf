import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppInfo;

public final class AppInfo extends Message {
  public static final String DEFAULT_AD_APK_PACKAGE_NAME = "";
  
  public static final Integer DEFAULT_AD_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_AD_NAME = "";
  
  public static final String DEFAULT_APK_URL = "";
  
  public static final Long DEFAULT_APP_SIZE = Long.valueOf(0L);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ad_apk_package_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer ad_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ad_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String apk_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long app_size;
  
  public AppInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.ad_id;
      if (integer == null) {
        this.ad_id = DEFAULT_AD_ID;
      } else {
        this.ad_id = integer;
      } 
      String str = paramBuilder.ad_name;
      if (str == null) {
        this.ad_name = "";
      } else {
        this.ad_name = str;
      } 
      str = paramBuilder.apk_url;
      if (str == null) {
        this.apk_url = "";
      } else {
        this.apk_url = str;
      } 
      str = paramBuilder.ad_apk_package_name;
      if (str == null) {
        this.ad_apk_package_name = "";
      } else {
        this.ad_apk_package_name = str;
      } 
      long_ = paramBuilder.app_size;
      if (long_ == null) {
        this.app_size = DEFAULT_APP_SIZE;
      } else {
        this.app_size = long_;
      } 
    } else {
      this.ad_id = ((Builder)long_).ad_id;
      this.ad_name = ((Builder)long_).ad_name;
      this.apk_url = ((Builder)long_).apk_url;
      this.ad_apk_package_name = ((Builder)long_).ad_apk_package_name;
      this.app_size = ((Builder)long_).app_size;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1421312662, "Ltbclient/AppInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1421312662, "Ltbclient/AppInfo;");
          return;
        } 
      } 
    } 
  }
}
