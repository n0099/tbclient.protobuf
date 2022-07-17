package tbclient.ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ZanInfo extends Message {
  public static Interceptable $ic;
  
  public static final Boolean DEFAULT_IS_ZAN;
  
  public static final Long DEFAULT_ZANSUM = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean is_zan;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long zansum;
  
  static {
    DEFAULT_IS_ZAN = Boolean.FALSE;
  }
  
  public ZanInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.zansum;
      if (long_ == null) {
        this.zansum = DEFAULT_ZANSUM;
      } else {
        this.zansum = long_;
      } 
      bool = paramBuilder.is_zan;
      if (bool == null) {
        this.is_zan = DEFAULT_IS_ZAN;
      } else {
        this.is_zan = bool;
      } 
    } else {
      this.zansum = ((Builder)bool).zansum;
      this.is_zan = ((Builder)bool).is_zan;
    } 
  }
  
  public ZanInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(347674734, "Ltbclient/ExcPbPage/ZanInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(347674734, "Ltbclient/ExcPbPage/ZanInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ZanInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Boolean is_zan;
    
    public Long zansum;
    
    public Builder() {}
    
    public Builder(ZanInfo param1ZanInfo) {
      super(param1ZanInfo);
      if (param1ZanInfo == null)
        return; 
      this.zansum = param1ZanInfo.zansum;
      this.is_zan = param1ZanInfo.is_zan;
    }
    
    public ZanInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ZanInfo)interceptResult.objValue; 
      } 
      return new ZanInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
