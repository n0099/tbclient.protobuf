package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DeleteFriendResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public DeleteFriendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public DeleteFriendResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeleteFriendResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DeleteFriendResIdl param1DeleteFriendResIdl) {
      super(param1DeleteFriendResIdl);
      if (param1DeleteFriendResIdl == null)
        return; 
      this.error = param1DeleteFriendResIdl.error;
      this.data = param1DeleteFriendResIdl.data;
    }
    
    public DeleteFriendResIdl build(boolean param1Boolean) {
      return new DeleteFriendResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
