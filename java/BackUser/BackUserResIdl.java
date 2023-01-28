package tbclient.BackUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class BackUserResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public BackUserResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public BackUserResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BackUserResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(BackUserResIdl param1BackUserResIdl) {
      super(param1BackUserResIdl);
      if (param1BackUserResIdl == null)
        return; 
      this.error = param1BackUserResIdl.error;
      this.data = param1BackUserResIdl.data;
    }
    
    public BackUserResIdl build(boolean param1Boolean) {
      return new BackUserResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
