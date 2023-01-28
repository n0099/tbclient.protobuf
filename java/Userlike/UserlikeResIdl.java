package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UserlikeResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public UserlikeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public UserlikeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserlikeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UserlikeResIdl param1UserlikeResIdl) {
      super(param1UserlikeResIdl);
      if (param1UserlikeResIdl == null)
        return; 
      this.error = param1UserlikeResIdl.error;
      this.data = param1UserlikeResIdl.data;
    }
    
    public UserlikeResIdl build(boolean param1Boolean) {
      return new UserlikeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
