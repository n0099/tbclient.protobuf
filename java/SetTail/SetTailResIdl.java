package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetTailResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public SetTailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public SetTailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetTailResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetTailResIdl param1SetTailResIdl) {
      super(param1SetTailResIdl);
      if (param1SetTailResIdl == null)
        return; 
      this.data = param1SetTailResIdl.data;
      this.error = param1SetTailResIdl.error;
    }
    
    public SetTailResIdl build(boolean param1Boolean) {
      return new SetTailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
