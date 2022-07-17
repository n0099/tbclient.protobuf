package tbclient.DeleteTail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DeleteTailResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public DeleteTailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public DeleteTailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeleteTailResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DeleteTailResIdl param1DeleteTailResIdl) {
      super(param1DeleteTailResIdl);
      if (param1DeleteTailResIdl == null)
        return; 
      this.data = param1DeleteTailResIdl.data;
      this.error = param1DeleteTailResIdl.error;
    }
    
    public DeleteTailResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DeleteTailResIdl)interceptResult.objValue; 
      } 
      return new DeleteTailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
