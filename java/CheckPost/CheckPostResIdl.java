package tbclient.CheckPost;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class CheckPostResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public CheckPostResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public CheckPostResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CheckPostResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(CheckPostResIdl param1CheckPostResIdl) {
      super(param1CheckPostResIdl);
      if (param1CheckPostResIdl == null)
        return; 
      this.data = param1CheckPostResIdl.data;
      this.error = param1CheckPostResIdl.error;
    }
    
    public CheckPostResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CheckPostResIdl)interceptResult.objValue; 
      } 
      return new CheckPostResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
