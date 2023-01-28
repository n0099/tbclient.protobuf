package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PassFriendResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PassFriendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PassFriendResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PassFriendResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PassFriendResIdl param1PassFriendResIdl) {
      super(param1PassFriendResIdl);
      if (param1PassFriendResIdl == null)
        return; 
      this.error = param1PassFriendResIdl.error;
      this.data = param1PassFriendResIdl.data;
    }
    
    public PassFriendResIdl build(boolean param1Boolean) {
      return new PassFriendResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
