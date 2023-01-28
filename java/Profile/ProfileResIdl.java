package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ProfileResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ProfileResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ProfileResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ProfileResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ProfileResIdl param1ProfileResIdl) {
      super(param1ProfileResIdl);
      if (param1ProfileResIdl == null)
        return; 
      this.error = param1ProfileResIdl.error;
      this.data = param1ProfileResIdl.data;
    }
    
    public ProfileResIdl build(boolean param1Boolean) {
      return new ProfileResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
