package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddFriendResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public AddFriendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public AddFriendResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddFriendResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddFriendResIdl param1AddFriendResIdl) {
      super(param1AddFriendResIdl);
      if (param1AddFriendResIdl == null)
        return; 
      this.data = param1AddFriendResIdl.data;
      this.error = param1AddFriendResIdl.error;
    }
    
    public AddFriendResIdl build(boolean param1Boolean) {
      return new AddFriendResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
