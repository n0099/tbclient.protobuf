package tbclient.QueryCollectUpdateNum;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QueryCollectUpdateNumReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public QueryCollectUpdateNumReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public QueryCollectUpdateNumReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<QueryCollectUpdateNumReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataReq data;
    
    public Builder() {}
    
    public Builder(QueryCollectUpdateNumReqIdl param1QueryCollectUpdateNumReqIdl) {
      super(param1QueryCollectUpdateNumReqIdl);
      if (param1QueryCollectUpdateNumReqIdl == null)
        return; 
      this.data = param1QueryCollectUpdateNumReqIdl.data;
    }
    
    public QueryCollectUpdateNumReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (QueryCollectUpdateNumReqIdl)interceptResult.objValue; 
      } 
      return new QueryCollectUpdateNumReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
