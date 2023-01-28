package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UserMuteQueryResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public UserMuteQueryResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public UserMuteQueryResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserMuteQueryResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UserMuteQueryResIdl param1UserMuteQueryResIdl) {
      super(param1UserMuteQueryResIdl);
      if (param1UserMuteQueryResIdl == null)
        return; 
      this.data = param1UserMuteQueryResIdl.data;
      this.error = param1UserMuteQueryResIdl.error;
    }
    
    public UserMuteQueryResIdl build(boolean param1Boolean) {
      return new UserMuteQueryResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
