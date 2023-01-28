package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddFriendReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public AddFriendReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddFriendReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddFriendReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(AddFriendReqIdl param1AddFriendReqIdl) {
      super(param1AddFriendReqIdl);
      if (param1AddFriendReqIdl == null)
        return; 
      this.data = param1AddFriendReqIdl.data;
    }
    
    public AddFriendReqIdl build(boolean param1Boolean) {
      return new AddFriendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
