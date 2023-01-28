package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UserMuteCheckResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public UserMuteCheckResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public UserMuteCheckResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserMuteCheckResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UserMuteCheckResIdl param1UserMuteCheckResIdl) {
      super(param1UserMuteCheckResIdl);
      if (param1UserMuteCheckResIdl == null)
        return; 
      this.data = param1UserMuteCheckResIdl.data;
      this.error = param1UserMuteCheckResIdl.error;
    }
    
    public UserMuteCheckResIdl build(boolean param1Boolean) {
      return new UserMuteCheckResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
