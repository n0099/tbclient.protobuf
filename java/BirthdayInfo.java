package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BirthdayInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_AGE;
  
  public static final Integer DEFAULT_BIRTHDAY_SHOW_STATUS;
  
  public static final Long DEFAULT_BIRTHDAY_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_CONSTELLATION = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer age;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer birthday_show_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long birthday_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String constellation;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_BIRTHDAY_SHOW_STATUS = integer;
    DEFAULT_AGE = integer;
  }
  
  public BirthdayInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.birthday_time;
      if (long_ == null) {
        this.birthday_time = DEFAULT_BIRTHDAY_TIME;
      } else {
        this.birthday_time = long_;
      } 
      Integer integer1 = paramBuilder.birthday_show_status;
      if (integer1 == null) {
        this.birthday_show_status = DEFAULT_BIRTHDAY_SHOW_STATUS;
      } else {
        this.birthday_show_status = integer1;
      } 
      String str = paramBuilder.constellation;
      if (str == null) {
        this.constellation = "";
      } else {
        this.constellation = str;
      } 
      integer = paramBuilder.age;
      if (integer == null) {
        this.age = DEFAULT_AGE;
      } else {
        this.age = integer;
      } 
    } else {
      this.birthday_time = ((Builder)integer).birthday_time;
      this.birthday_show_status = ((Builder)integer).birthday_show_status;
      this.constellation = ((Builder)integer).constellation;
      this.age = ((Builder)integer).age;
    } 
  }
  
  public BirthdayInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(108533798, "Ltbclient/BirthdayInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(108533798, "Ltbclient/BirthdayInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BirthdayInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer age;
    
    public Integer birthday_show_status;
    
    public Long birthday_time;
    
    public String constellation;
    
    public Builder() {}
    
    public Builder(BirthdayInfo param1BirthdayInfo) {
      super(param1BirthdayInfo);
      if (param1BirthdayInfo == null)
        return; 
      this.birthday_time = param1BirthdayInfo.birthday_time;
      this.birthday_show_status = param1BirthdayInfo.birthday_show_status;
      this.constellation = param1BirthdayInfo.constellation;
      this.age = param1BirthdayInfo.age;
    }
    
    public BirthdayInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BirthdayInfo)interceptResult.objValue; 
      } 
      return new BirthdayInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
