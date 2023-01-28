package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyFriendReqIdl extends Message {
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
    public ReqData data;
    
    public Builder() {}
    
    public Builder(ReplyFriendReqIdl param1ReplyFriendReqIdl) {
      super(param1ReplyFriendReqIdl);
      if (param1ReplyFriendReqIdl == null)
        return; 
      this.data = param1ReplyFriendReqIdl.data;
    }
    
    public ReplyFriendReqIdl build(boolean param1Boolean) {
      return new ReplyFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
