package tbclient.PassFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PassFriendReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public PassFriendReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PassFriendReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PassFriendReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ReqData data;
    
    public Builder() {}
    
    public Builder(PassFriendReqIdl param1PassFriendReqIdl) {
      super(param1PassFriendReqIdl);
      if (param1PassFriendReqIdl == null)
        return; 
      this.data = param1PassFriendReqIdl.data;
    }
    
    public PassFriendReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PassFriendReqIdl)interceptResult.objValue; 
      } 
      return new PassFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
