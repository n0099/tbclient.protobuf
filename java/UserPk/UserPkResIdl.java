package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UserPkResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public UserPkResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public UserPkResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPkResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UserPkResIdl param1UserPkResIdl) {
      super(param1UserPkResIdl);
      if (param1UserPkResIdl == null)
        return; 
      this.data = param1UserPkResIdl.data;
      this.error = param1UserPkResIdl.error;
    }
    
    public UserPkResIdl build(boolean param1Boolean) {
      return new UserPkResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
