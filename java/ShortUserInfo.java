package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShortUserInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_GENDER;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer gender;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_GENDER = Integer.valueOf(0);
  }
  
  public ShortUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      Integer integer = paramBuilder.gender;
      if (integer == null) {
        this.gender = DEFAULT_GENDER;
      } else {
        this.gender = integer;
      } 
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.portrait = ((Builder)str).portrait;
      this.user_name = ((Builder)str).user_name;
      this.gender = ((Builder)str).gender;
      this.intro = ((Builder)str).intro;
    } 
  }
  
  public ShortUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-870573424, "Ltbclient/ShortUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-870573424, "Ltbclient/ShortUserInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ShortUserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer gender;
    
    public String intro;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(ShortUserInfo param1ShortUserInfo) {
      super(param1ShortUserInfo);
      if (param1ShortUserInfo == null)
        return; 
      this.user_id = param1ShortUserInfo.user_id;
      this.portrait = param1ShortUserInfo.portrait;
      this.user_name = param1ShortUserInfo.user_name;
      this.gender = param1ShortUserInfo.gender;
      this.intro = param1ShortUserInfo.intro;
    }
    
    public ShortUserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ShortUserInfo)interceptResult.objValue; 
      } 
      return new ShortUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
