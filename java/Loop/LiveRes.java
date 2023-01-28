package tbclient.Loop;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LiveRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_IS_END = "";
  
  public static final List<YyLiveInfoSimple> DEFAULT_LIVE_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String is_end;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<YyLiveInfoSimple> live_list;
  
  @ProtoField(tag = 1)
  public final NormalConfig normal_config;
  
  public LiveRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.normal_config = paramBuilder.normal_config;
      List<YyLiveInfoSimple> list = paramBuilder.live_list;
      if (list == null) {
        this.live_list = DEFAULT_LIVE_LIST;
      } else {
        this.live_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.is_end;
      if (str == null) {
        this.is_end = "";
      } else {
        this.is_end = str;
      } 
    } else {
      this.normal_config = ((Builder)str).normal_config;
      this.live_list = Message.immutableCopyOf(((Builder)str).live_list);
      this.is_end = ((Builder)str).is_end;
    } 
  }
  
  public LiveRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-651913944, "Ltbclient/Loop/LiveRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-651913944, "Ltbclient/Loop/LiveRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LiveRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String is_end;
    
    public List<YyLiveInfoSimple> live_list;
    
    public NormalConfig normal_config;
    
    public Builder() {}
    
    public Builder(LiveRes param1LiveRes) {
      super(param1LiveRes);
      if (param1LiveRes == null)
        return; 
      this.normal_config = param1LiveRes.normal_config;
      this.live_list = Message.copyOf(param1LiveRes.live_list);
      this.is_end = param1LiveRes.is_end;
    }
    
    public LiveRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LiveRes)interceptResult.objValue; 
      } 
      return new LiveRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
