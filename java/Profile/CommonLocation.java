package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonLocation extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DISTANCE = "";
  
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String distance;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long time;
  
  public CommonLocation(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.distance;
      if (str == null) {
        this.distance = "";
      } else {
        this.distance = str;
      } 
      long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
    } else {
      this.distance = ((Builder)long_).distance;
      this.time = ((Builder)long_).time;
    } 
  }
  
  public CommonLocation(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2007847115, "Ltbclient/Profile/CommonLocation;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2007847115, "Ltbclient/Profile/CommonLocation;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CommonLocation> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String distance;
    
    public Long time;
    
    public Builder() {}
    
    public Builder(CommonLocation param1CommonLocation) {
      super(param1CommonLocation);
      if (param1CommonLocation == null)
        return; 
      this.distance = param1CommonLocation.distance;
      this.time = param1CommonLocation.time;
    }
    
    public CommonLocation build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CommonLocation)interceptResult.objValue; 
      } 
      return new CommonLocation(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
