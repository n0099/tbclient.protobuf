package tbclient.PbFloor;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PbFloorResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PbFloorResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PbFloorResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbFloorResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PbFloorResIdl param1PbFloorResIdl) {
      super(param1PbFloorResIdl);
      if (param1PbFloorResIdl == null)
        return; 
      this.error = param1PbFloorResIdl.error;
      this.data = param1PbFloorResIdl.data;
    }
    
    public PbFloorResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PbFloorResIdl)interceptResult.objValue; 
      } 
      return new PbFloorResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
