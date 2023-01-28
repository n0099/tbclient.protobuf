package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class LoopResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public LoopResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public LoopResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LoopResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(LoopResIdl param1LoopResIdl) {
      super(param1LoopResIdl);
      if (param1LoopResIdl == null)
        return; 
      this.error = param1LoopResIdl.error;
      this.data = param1LoopResIdl.data;
    }
    
    public LoopResIdl build(boolean param1Boolean) {
      return new LoopResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
