package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AD_APK_PACKAGE_NAME = "";
  
  public static final Integer DEFAULT_AD_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_AD_NAME = "";
  
  public static final String DEFAULT_APK_URL = "";
  
  public static final Long DEFAULT_APP_SIZE = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
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
  
  public AppInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<AppInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ad_apk_package_name;
    
    public Integer ad_id;
    
    public String ad_name;
    
    public String apk_url;
    
    public Long app_size;
    
    public Builder() {}
    
    public Builder(AppInfo param1AppInfo) {
      super(param1AppInfo);
      if (param1AppInfo == null)
        return; 
      this.ad_id = param1AppInfo.ad_id;
      this.ad_name = param1AppInfo.ad_name;
      this.apk_url = param1AppInfo.apk_url;
      this.ad_apk_package_name = param1AppInfo.ad_apk_package_name;
      this.app_size = param1AppInfo.app_size;
    }
    
    public AppInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppInfo)interceptResult.objValue; 
      } 
      return new AppInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
