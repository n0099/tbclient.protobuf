package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AwardUser extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AWARD_NAME = "";
  
  public static final Integer DEFAULT_AWARD_TIME;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String award_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer award_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_AWARD_TIME = Integer.valueOf(0);
  }
  
  public AwardUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.award_name;
      if (str == null) {
        this.award_name = "";
      } else {
        this.award_name = str;
      } 
      integer = paramBuilder.award_time;
      if (integer == null) {
        this.award_time = DEFAULT_AWARD_TIME;
      } else {
        this.award_time = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.award_name = ((Builder)integer).award_name;
      this.award_time = ((Builder)integer).award_time;
    } 
  }
  
  public AwardUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1668321757, "Ltbclient/AwardUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1668321757, "Ltbclient/AwardUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AwardUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String award_name;
    
    public Integer award_time;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(AwardUser param1AwardUser) {
      super(param1AwardUser);
      if (param1AwardUser == null)
        return; 
      this.user_id = param1AwardUser.user_id;
      this.user_name = param1AwardUser.user_name;
      this.award_name = param1AwardUser.award_name;
      this.award_time = param1AwardUser.award_time;
    }
    
    public AwardUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AwardUser)interceptResult.objValue; 
      } 
      return new AwardUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
