package tbclient.GetRank;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACHIEVEMENT = "";
  
  public static final Long DEFAULT_GRADE;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String achievement;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long grade;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-420787381, "Ltbclient/GetRank/UserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-420787381, "Ltbclient/GetRank/UserInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_GRADE = long_;
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.user_id;
      if (long_2 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_2;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      Long long_1 = paramBuilder.grade;
      if (long_1 == null) {
        this.grade = DEFAULT_GRADE;
      } else {
        this.grade = long_1;
      } 
      str = paramBuilder.achievement;
      if (str == null) {
        this.achievement = "";
      } else {
        this.achievement = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.portrait = ((Builder)str).portrait;
      this.grade = ((Builder)str).grade;
      this.achievement = ((Builder)str).achievement;
    } 
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String achievement;
    
    public Long grade;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(UserInfo param1UserInfo) {
      super(param1UserInfo);
      if (param1UserInfo == null)
        return; 
      this.user_id = param1UserInfo.user_id;
      this.user_name = param1UserInfo.user_name;
      this.portrait = param1UserInfo.portrait;
      this.grade = param1UserInfo.grade;
      this.achievement = param1UserInfo.achievement;
    }
    
    public UserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserInfo)interceptResult.objValue; 
      } 
      return new UserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
