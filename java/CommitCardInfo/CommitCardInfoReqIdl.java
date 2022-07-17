package tbclient.CommitCardInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommitCardInfoReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public CommitCardInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CommitCardInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommitCardInfoReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataReq data;
    
    public Builder() {}
    
    public Builder(CommitCardInfoReqIdl param1CommitCardInfoReqIdl) {
      super(param1CommitCardInfoReqIdl);
      if (param1CommitCardInfoReqIdl == null)
        return; 
      this.data = param1CommitCardInfoReqIdl.data;
    }
    
    public CommitCardInfoReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CommitCardInfoReqIdl)interceptResult.objValue; 
      } 
      return new CommitCardInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
