package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddTailResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public AddTailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public AddTailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddTailResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddTailResIdl param1AddTailResIdl) {
      super(param1AddTailResIdl);
      if (param1AddTailResIdl == null)
        return; 
      this.data = param1AddTailResIdl.data;
      this.error = param1AddTailResIdl.error;
    }
    
    public AddTailResIdl build(boolean param1Boolean) {
      return new AddTailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
