package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DeleteTailResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public DeleteTailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public DeleteTailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeleteTailResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DeleteTailResIdl param1DeleteTailResIdl) {
      super(param1DeleteTailResIdl);
      if (param1DeleteTailResIdl == null)
        return; 
      this.data = param1DeleteTailResIdl.data;
      this.error = param1DeleteTailResIdl.error;
    }
    
    public DeleteTailResIdl build(boolean param1Boolean) {
      return new DeleteTailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
