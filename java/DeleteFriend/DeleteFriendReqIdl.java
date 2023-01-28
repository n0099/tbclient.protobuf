package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DeleteFriendReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public DeleteFriendReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public DeleteFriendReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeleteFriendReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(DeleteFriendReqIdl param1DeleteFriendReqIdl) {
      super(param1DeleteFriendReqIdl);
      if (param1DeleteFriendReqIdl == null)
        return; 
      this.data = param1DeleteFriendReqIdl.data;
    }
    
    public DeleteFriendReqIdl build(boolean param1Boolean) {
      return new DeleteFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
