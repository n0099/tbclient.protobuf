package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class BannerThreadInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FROM = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer from;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  public BannerThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      integer = paramBuilder.from;
      if (integer == null) {
        this.from = DEFAULT_FROM;
      } else {
        this.from = integer;
      } 
    } else {
      this.thread_info = ((Builder)integer).thread_info;
      this.from = ((Builder)integer).from;
    } 
  }
  
  public BannerThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2042860372, "Ltbclient/FrsPage/BannerThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2042860372, "Ltbclient/FrsPage/BannerThreadInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerThreadInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer from;
    
    public ThreadInfo thread_info;
    
    public Builder() {}
    
    public Builder(BannerThreadInfo param1BannerThreadInfo) {
      super(param1BannerThreadInfo);
      if (param1BannerThreadInfo == null)
        return; 
      this.thread_info = param1BannerThreadInfo.thread_info;
      this.from = param1BannerThreadInfo.from;
    }
    
    public BannerThreadInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BannerThreadInfo)interceptResult.objValue; 
      } 
      return new BannerThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
