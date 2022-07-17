package tbclient.GetForumBroadcastList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetForumBroadcastListReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetForumBroadcastListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumBroadcastListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumBroadcastListReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetForumBroadcastListReqIdl param1GetForumBroadcastListReqIdl) {
      super(param1GetForumBroadcastListReqIdl);
      if (param1GetForumBroadcastListReqIdl == null)
        return; 
      this.data = param1GetForumBroadcastListReqIdl.data;
    }
    
    public GetForumBroadcastListReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GetForumBroadcastListReqIdl)interceptResult.objValue; 
      } 
      return new GetForumBroadcastListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
