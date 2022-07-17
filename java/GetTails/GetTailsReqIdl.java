package tbclient.GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetTailsReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public GetTailsReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTailsReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTailsReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ReqData data;
    
    public Builder() {}
    
    public Builder(GetTailsReqIdl param1GetTailsReqIdl) {
      super(param1GetTailsReqIdl);
      if (param1GetTailsReqIdl == null)
        return; 
      this.data = param1GetTailsReqIdl.data;
    }
    
    public GetTailsReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GetTailsReqIdl)interceptResult.objValue; 
      } 
      return new GetTailsReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
