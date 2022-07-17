package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaUserlike extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(tag = 1)
  public final User user;
  
  public AlaUserlike(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } else {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } 
  }
  
  public AlaUserlike(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaUserlike> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public AlaLiveInfo ala_live_info;
    
    public User user;
    
    public Builder() {}
    
    public Builder(AlaUserlike param1AlaUserlike) {
      super(param1AlaUserlike);
      if (param1AlaUserlike == null)
        return; 
      this.user = param1AlaUserlike.user;
      this.ala_live_info = param1AlaUserlike.ala_live_info;
    }
    
    public AlaUserlike build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AlaUserlike)interceptResult.objValue; 
      } 
      return new AlaUserlike(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
