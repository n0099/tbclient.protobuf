package tbclient.GetPrivateInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetPrivateInfoReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public GetPrivateInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPrivateInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPrivateInfoReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ReqData data;
    
    public Builder() {}
    
    public Builder(GetPrivateInfoReqIdl param1GetPrivateInfoReqIdl) {
      super(param1GetPrivateInfoReqIdl);
      if (param1GetPrivateInfoReqIdl == null)
        return; 
      this.data = param1GetPrivateInfoReqIdl.data;
    }
    
    public GetPrivateInfoReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GetPrivateInfoReqIdl)interceptResult.objValue; 
      } 
      return new GetPrivateInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
