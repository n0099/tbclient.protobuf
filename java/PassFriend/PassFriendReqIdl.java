package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PassFriendReqIdl extends Message {
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
    public ReqData data;
    
    public Builder() {}
    
    public Builder(PassFriendReqIdl param1PassFriendReqIdl) {
      super(param1PassFriendReqIdl);
      if (param1PassFriendReqIdl == null)
        return; 
      this.data = param1PassFriendReqIdl.data;
    }
    
    public PassFriendReqIdl build(boolean param1Boolean) {
      return new PassFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
