package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AutoPayInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AUTOPAY_URL = "";
  
  public static final Long DEFAULT_BEGIN_TIME;
  
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_PAY_CHANNEL = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String autopay_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long begin_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long create_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer pay_channel;
  
  static {
    DEFAULT_BEGIN_TIME = long_;
  }
  
  public AutoPayInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.create_time;
      if (long_2 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_2;
      } 
      Integer integer = paramBuilder.pay_channel;
      if (integer == null) {
        this.pay_channel = DEFAULT_PAY_CHANNEL;
      } else {
        this.pay_channel = integer;
      } 
      Long long_1 = paramBuilder.begin_time;
      if (long_1 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = long_1;
      } 
      str = paramBuilder.autopay_url;
      if (str == null) {
        this.autopay_url = "";
      } else {
        this.autopay_url = str;
      } 
    } else {
      this.create_time = ((Builder)str).create_time;
      this.pay_channel = ((Builder)str).pay_channel;
      this.begin_time = ((Builder)str).begin_time;
      this.autopay_url = ((Builder)str).autopay_url;
    } 
  }
  
  public AutoPayInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-363534786, "Ltbclient/AutoPayInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-363534786, "Ltbclient/AutoPayInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_CREATE_TIME = long_;
  }
  
  public static final class Builder extends Message.Builder<AutoPayInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String autopay_url;
    
    public Long begin_time;
    
    public Long create_time;
    
    public Integer pay_channel;
    
    public Builder() {}
    
    public Builder(AutoPayInfo param1AutoPayInfo) {
      super(param1AutoPayInfo);
      if (param1AutoPayInfo == null)
        return; 
      this.create_time = param1AutoPayInfo.create_time;
      this.pay_channel = param1AutoPayInfo.pay_channel;
      this.begin_time = param1AutoPayInfo.begin_time;
      this.autopay_url = param1AutoPayInfo.autopay_url;
    }
    
    public AutoPayInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AutoPayInfo)interceptResult.objValue; 
      } 
      return new AutoPayInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
