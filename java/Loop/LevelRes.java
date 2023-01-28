package tbclient.Loop;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelRes extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final LevelPop pop;
  
  public LevelRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pop = paramBuilder.pop;
    } else {
      this.pop = paramBuilder.pop;
    } 
  }
  
  public LevelRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LevelRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public LevelPop pop;
    
    public Builder() {}
    
    public Builder(LevelRes param1LevelRes) {
      super(param1LevelRes);
      if (param1LevelRes == null)
        return; 
      this.pop = param1LevelRes.pop;
    }
    
    public LevelRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LevelRes)interceptResult.objValue; 
      } 
      return new LevelRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
