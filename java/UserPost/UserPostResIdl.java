package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UserPostResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public UserPostResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public UserPostResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPostResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UserPostResIdl param1UserPostResIdl) {
      super(param1UserPostResIdl);
      if (param1UserPostResIdl == null)
        return; 
      this.error = param1UserPostResIdl.error;
      this.data = param1UserPostResIdl.data;
    }
    
    public UserPostResIdl build(boolean param1Boolean) {
      return new UserPostResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
