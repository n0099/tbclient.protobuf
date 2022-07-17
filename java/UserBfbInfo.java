package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserBfbInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ACTIVITY_STATUS;
  
  public static final String DEFAULT_BFB_URL = "";
  
  public static final String DEFAULT_MASTE_URL = "";
  
  public static final Integer DEFAULT_RES_NO;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer activity_status;
  
  @ProtoField(tag = 5)
  public final AndroidBfbSdk android_bfb_sdk;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bfb_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String maste_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer res_no;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-103066076, "Ltbclient/UserBfbInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-103066076, "Ltbclient/UserBfbInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVITY_STATUS = integer;
    DEFAULT_RES_NO = integer;
  }
  
  public UserBfbInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.activity_status;
      if (integer2 == null) {
        this.activity_status = DEFAULT_ACTIVITY_STATUS;
      } else {
        this.activity_status = integer2;
      } 
      String str = paramBuilder.bfb_url;
      if (str == null) {
        this.bfb_url = "";
      } else {
        this.bfb_url = str;
      } 
      str = paramBuilder.maste_url;
      if (str == null) {
        this.maste_url = "";
      } else {
        this.maste_url = str;
      } 
      Integer integer1 = paramBuilder.res_no;
      if (integer1 == null) {
        this.res_no = DEFAULT_RES_NO;
      } else {
        this.res_no = integer1;
      } 
      this.android_bfb_sdk = paramBuilder.android_bfb_sdk;
    } else {
      this.activity_status = paramBuilder.activity_status;
      this.bfb_url = paramBuilder.bfb_url;
      this.maste_url = paramBuilder.maste_url;
      this.res_no = paramBuilder.res_no;
      this.android_bfb_sdk = paramBuilder.android_bfb_sdk;
    } 
  }
  
  public UserBfbInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserBfbInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer activity_status;
    
    public AndroidBfbSdk android_bfb_sdk;
    
    public String bfb_url;
    
    public String maste_url;
    
    public Integer res_no;
    
    public Builder() {}
    
    public Builder(UserBfbInfo param1UserBfbInfo) {
      super(param1UserBfbInfo);
      if (param1UserBfbInfo == null)
        return; 
      this.activity_status = param1UserBfbInfo.activity_status;
      this.bfb_url = param1UserBfbInfo.bfb_url;
      this.maste_url = param1UserBfbInfo.maste_url;
      this.res_no = param1UserBfbInfo.res_no;
      this.android_bfb_sdk = param1UserBfbInfo.android_bfb_sdk;
    }
    
    public UserBfbInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserBfbInfo)interceptResult.objValue; 
      } 
      return new UserBfbInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
