package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ReplyFriendResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public ReplyFriendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public ReplyFriendResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyFriendResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ReplyFriendResIdl param1ReplyFriendResIdl) {
      super(param1ReplyFriendResIdl);
      if (param1ReplyFriendResIdl == null)
        return; 
      this.data = param1ReplyFriendResIdl.data;
      this.error = param1ReplyFriendResIdl.error;
    }
    
    public ReplyFriendResIdl build(boolean param1Boolean) {
      return new ReplyFriendResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
