package tbclient.GetForumDetail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;

public final class BzApplySwitch extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  public BzApplySwitch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public BzApplySwitch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BzApplySwitch> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Builder() {}
    
    public Builder(BzApplySwitch param1BzApplySwitch) {
      super(param1BzApplySwitch);
    }
    
    public BzApplySwitch build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BzApplySwitch)interceptResult.objValue; 
      } 
      return new BzApplySwitch(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
