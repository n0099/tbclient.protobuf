package tbclient.RecommendFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LbsInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DISTANCE = "";
  
  public static final Integer DEFAULT_IS_HIDE;
  
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String distance;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_hide;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long time;
  
  static {
    DEFAULT_IS_HIDE = Integer.valueOf(0);
  }
  
  public LbsInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.distance;
      if (str == null) {
        this.distance = "";
      } else {
        this.distance = str;
      } 
      Long long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
      integer = paramBuilder.is_hide;
      if (integer == null) {
        this.is_hide = DEFAULT_IS_HIDE;
      } else {
        this.is_hide = integer;
      } 
    } else {
      this.distance = ((Builder)integer).distance;
      this.time = ((Builder)integer).time;
      this.is_hide = ((Builder)integer).is_hide;
    } 
  }
  
  public LbsInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-560853873, "Ltbclient/RecommendFriend/LbsInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-560853873, "Ltbclient/RecommendFriend/LbsInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LbsInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String distance;
    
    public Integer is_hide;
    
    public Long time;
    
    public Builder() {}
    
    public Builder(LbsInfo param1LbsInfo) {
      super(param1LbsInfo);
      if (param1LbsInfo == null)
        return; 
      this.distance = param1LbsInfo.distance;
      this.time = param1LbsInfo.time;
      this.is_hide = param1LbsInfo.is_hide;
    }
    
    public LbsInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LbsInfo)interceptResult.objValue; 
      } 
      return new LbsInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
