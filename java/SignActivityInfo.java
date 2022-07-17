package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignActivityInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ACTIVITY_DURATION;
  
  public static final String DEFAULT_ACTIVITY_FAIL_MSG = "";
  
  public static final Long DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_ACTIVITY_MSG = "";
  
  public static final String DEFAULT_ACTIVITY_NAME = "";
  
  public static final String DEFAULT_ACTIVITY_SUC_MSG = "";
  
  public static final Integer DEFAULT_ACTIVITY_TIME;
  
  public static final String DEFAULT_COUNTDOWN_MSG = "";
  
  public static final Integer DEFAULT_COUNTDOWN_TIME;
  
  public static final String DEFAULT_GIFT_NAME = "";
  
  public static final Integer DEFAULT_GIFT_TYPE;
  
  public static final String DEFAULT_GIFT_URL = "";
  
  public static final Integer DEFAULT_ICON_LIFECYCLE;
  
  public static final String DEFAULT_ICON_NAME = "";
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer activity_duration;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String activity_fail_msg;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long activity_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String activity_msg;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String activity_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String activity_suc_msg;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String countdown_msg;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer countdown_time;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String gift_name;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer gift_type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String gift_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer icon_lifecycle;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String icon_name;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String image_url;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVITY_TIME = integer;
    DEFAULT_COUNTDOWN_TIME = integer;
    DEFAULT_ACTIVITY_DURATION = integer;
    DEFAULT_GIFT_TYPE = integer;
    DEFAULT_ICON_LIFECYCLE = integer;
  }
  
  public SignActivityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      Integer integer3 = paramBuilder.activity_time;
      if (integer3 == null) {
        this.activity_time = DEFAULT_ACTIVITY_TIME;
      } else {
        this.activity_time = integer3;
      } 
      integer3 = paramBuilder.countdown_time;
      if (integer3 == null) {
        this.countdown_time = DEFAULT_COUNTDOWN_TIME;
      } else {
        this.countdown_time = integer3;
      } 
      integer3 = paramBuilder.activity_duration;
      if (integer3 == null) {
        this.activity_duration = DEFAULT_ACTIVITY_DURATION;
      } else {
        this.activity_duration = integer3;
      } 
      String str3 = paramBuilder.countdown_msg;
      if (str3 == null) {
        this.countdown_msg = "";
      } else {
        this.countdown_msg = str3;
      } 
      str3 = paramBuilder.activity_msg;
      if (str3 == null) {
        this.activity_msg = "";
      } else {
        this.activity_msg = str3;
      } 
      str3 = paramBuilder.activity_suc_msg;
      if (str3 == null) {
        this.activity_suc_msg = "";
      } else {
        this.activity_suc_msg = str3;
      } 
      str3 = paramBuilder.activity_fail_msg;
      if (str3 == null) {
        this.activity_fail_msg = "";
      } else {
        this.activity_fail_msg = str3;
      } 
      Integer integer2 = paramBuilder.gift_type;
      if (integer2 == null) {
        this.gift_type = DEFAULT_GIFT_TYPE;
      } else {
        this.gift_type = integer2;
      } 
      String str2 = paramBuilder.gift_url;
      if (str2 == null) {
        this.gift_url = "";
      } else {
        this.gift_url = str2;
      } 
      str2 = paramBuilder.gift_name;
      if (str2 == null) {
        this.gift_name = "";
      } else {
        this.gift_name = str2;
      } 
      str2 = paramBuilder.icon_name;
      if (str2 == null) {
        this.icon_name = "";
      } else {
        this.icon_name = str2;
      } 
      Integer integer1 = paramBuilder.icon_lifecycle;
      if (integer1 == null) {
        this.icon_lifecycle = DEFAULT_ICON_LIFECYCLE;
      } else {
        this.icon_lifecycle = integer1;
      } 
      String str1 = paramBuilder.activity_name;
      if (str1 == null) {
        this.activity_name = "";
      } else {
        this.activity_name = str1;
      } 
      str = paramBuilder.image_url;
      if (str == null) {
        this.image_url = "";
      } else {
        this.image_url = str;
      } 
    } else {
      this.activity_id = ((Builder)str).activity_id;
      this.activity_time = ((Builder)str).activity_time;
      this.countdown_time = ((Builder)str).countdown_time;
      this.activity_duration = ((Builder)str).activity_duration;
      this.countdown_msg = ((Builder)str).countdown_msg;
      this.activity_msg = ((Builder)str).activity_msg;
      this.activity_suc_msg = ((Builder)str).activity_suc_msg;
      this.activity_fail_msg = ((Builder)str).activity_fail_msg;
      this.gift_type = ((Builder)str).gift_type;
      this.gift_url = ((Builder)str).gift_url;
      this.gift_name = ((Builder)str).gift_name;
      this.icon_name = ((Builder)str).icon_name;
      this.icon_lifecycle = ((Builder)str).icon_lifecycle;
      this.activity_name = ((Builder)str).activity_name;
      this.image_url = ((Builder)str).image_url;
    } 
  }
  
  public SignActivityInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-60308201, "Ltbclient/SignActivityInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-60308201, "Ltbclient/SignActivityInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SignActivityInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer activity_duration;
    
    public String activity_fail_msg;
    
    public Long activity_id;
    
    public String activity_msg;
    
    public String activity_name;
    
    public String activity_suc_msg;
    
    public Integer activity_time;
    
    public String countdown_msg;
    
    public Integer countdown_time;
    
    public String gift_name;
    
    public Integer gift_type;
    
    public String gift_url;
    
    public Integer icon_lifecycle;
    
    public String icon_name;
    
    public String image_url;
    
    public Builder() {}
    
    public Builder(SignActivityInfo param1SignActivityInfo) {
      super(param1SignActivityInfo);
      if (param1SignActivityInfo == null)
        return; 
      this.activity_id = param1SignActivityInfo.activity_id;
      this.activity_time = param1SignActivityInfo.activity_time;
      this.countdown_time = param1SignActivityInfo.countdown_time;
      this.activity_duration = param1SignActivityInfo.activity_duration;
      this.countdown_msg = param1SignActivityInfo.countdown_msg;
      this.activity_msg = param1SignActivityInfo.activity_msg;
      this.activity_suc_msg = param1SignActivityInfo.activity_suc_msg;
      this.activity_fail_msg = param1SignActivityInfo.activity_fail_msg;
      this.gift_type = param1SignActivityInfo.gift_type;
      this.gift_url = param1SignActivityInfo.gift_url;
      this.gift_name = param1SignActivityInfo.gift_name;
      this.icon_name = param1SignActivityInfo.icon_name;
      this.icon_lifecycle = param1SignActivityInfo.icon_lifecycle;
      this.activity_name = param1SignActivityInfo.activity_name;
      this.image_url = param1SignActivityInfo.image_url;
    }
    
    public SignActivityInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SignActivityInfo)interceptResult.objValue; 
      } 
      return new SignActivityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
