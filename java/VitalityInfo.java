package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VitalityInfo extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final FrequentlyForumInfo frequently_forum_info;
  
  public VitalityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } else {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } 
  }
  
  public VitalityInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VitalityInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public FrequentlyForumInfo frequently_forum_info;
    
    public Builder() {}
    
    public Builder(VitalityInfo param1VitalityInfo) {
      super(param1VitalityInfo);
      if (param1VitalityInfo == null)
        return; 
      this.frequently_forum_info = param1VitalityInfo.frequently_forum_info;
    }
    
    public VitalityInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VitalityInfo)interceptResult.objValue; 
      } 
      return new VitalityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
