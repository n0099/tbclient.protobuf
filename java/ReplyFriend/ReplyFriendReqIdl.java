package tbclient.ReplyFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyFriendReqIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public ReplyFriendReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ReplyFriendReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyFriendReqIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public ReqData data;
    
    public Builder() {}
    
    public Builder(ReplyFriendReqIdl param1ReplyFriendReqIdl) {
      super(param1ReplyFriendReqIdl);
      if (param1ReplyFriendReqIdl == null)
        return; 
      this.data = param1ReplyFriendReqIdl.data;
    }
    
    public ReplyFriendReqIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReplyFriendReqIdl)interceptResult.objValue; 
      } 
      return new ReplyFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
