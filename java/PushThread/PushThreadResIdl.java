package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PushThreadResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PushThreadResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PushThreadResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PushThreadResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PushThreadResIdl param1PushThreadResIdl) {
      super(param1PushThreadResIdl);
      if (param1PushThreadResIdl == null)
        return; 
      this.error = param1PushThreadResIdl.error;
      this.data = param1PushThreadResIdl.data;
    }
    
    public PushThreadResIdl build(boolean param1Boolean) {
      return new PushThreadResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
