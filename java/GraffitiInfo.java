package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GraffitiInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_GID = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long gid;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public GraffitiInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      long_ = paramBuilder.gid;
      if (long_ == null) {
        this.gid = DEFAULT_GID;
      } else {
        this.gid = long_;
      } 
    } else {
      this.url = ((Builder)long_).url;
      this.gid = ((Builder)long_).gid;
    } 
  }
  
  public GraffitiInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1706547387, "Ltbclient/GraffitiInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1706547387, "Ltbclient/GraffitiInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GraffitiInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long gid;
    
    public String url;
    
    public Builder() {}
    
    public Builder(GraffitiInfo param1GraffitiInfo) {
      super(param1GraffitiInfo);
      if (param1GraffitiInfo == null)
        return; 
      this.url = param1GraffitiInfo.url;
      this.gid = param1GraffitiInfo.gid;
    }
    
    public GraffitiInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GraffitiInfo)interceptResult.objValue; 
      } 
      return new GraffitiInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
