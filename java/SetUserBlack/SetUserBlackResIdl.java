package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetUserBlackResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetUserBlackResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetUserBlackResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetUserBlackResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetUserBlackResIdl param1SetUserBlackResIdl) {
      super(param1SetUserBlackResIdl);
      if (param1SetUserBlackResIdl == null)
        return; 
      this.error = param1SetUserBlackResIdl.error;
      this.data = param1SetUserBlackResIdl.data;
    }
    
    public SetUserBlackResIdl build(boolean param1Boolean) {
      return new SetUserBlackResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
