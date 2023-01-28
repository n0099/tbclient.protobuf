package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ActiveConfigResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ActiveConfigResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ActiveConfigResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActiveConfigResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ActiveConfigResIdl param1ActiveConfigResIdl) {
      super(param1ActiveConfigResIdl);
      if (param1ActiveConfigResIdl == null)
        return; 
      this.error = param1ActiveConfigResIdl.error;
      this.data = param1ActiveConfigResIdl.data;
    }
    
    public ActiveConfigResIdl build(boolean param1Boolean) {
      return new ActiveConfigResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
