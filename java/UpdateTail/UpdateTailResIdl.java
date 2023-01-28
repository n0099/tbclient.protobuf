package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UpdateTailResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public UpdateTailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public UpdateTailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UpdateTailResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UpdateTailResIdl param1UpdateTailResIdl) {
      super(param1UpdateTailResIdl);
      if (param1UpdateTailResIdl == null)
        return; 
      this.data = param1UpdateTailResIdl.data;
      this.error = param1UpdateTailResIdl.error;
    }
    
    public UpdateTailResIdl build(boolean param1Boolean) {
      return new UpdateTailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
