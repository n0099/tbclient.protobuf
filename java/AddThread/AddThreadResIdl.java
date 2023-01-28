package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddThreadResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AddThreadResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AddThreadResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddThreadResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddThreadResIdl param1AddThreadResIdl) {
      super(param1AddThreadResIdl);
      if (param1AddThreadResIdl == null)
        return; 
      this.error = param1AddThreadResIdl.error;
      this.data = param1AddThreadResIdl.data;
    }
    
    public AddThreadResIdl build(boolean param1Boolean) {
      return new AddThreadResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
