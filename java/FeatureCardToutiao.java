package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;

public final class FeatureCardToutiao extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  public FeatureCardToutiao(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public FeatureCardToutiao(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardToutiao> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Builder() {}
    
    public Builder(FeatureCardToutiao param1FeatureCardToutiao) {
      super(param1FeatureCardToutiao);
    }
    
    public FeatureCardToutiao build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeatureCardToutiao)interceptResult.objValue; 
      } 
      return new FeatureCardToutiao(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
