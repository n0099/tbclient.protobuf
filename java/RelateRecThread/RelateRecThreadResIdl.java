package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class RelateRecThreadResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public RelateRecThreadResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public RelateRecThreadResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RelateRecThreadResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(RelateRecThreadResIdl param1RelateRecThreadResIdl) {
      super(param1RelateRecThreadResIdl);
      if (param1RelateRecThreadResIdl == null)
        return; 
      this.error = param1RelateRecThreadResIdl.error;
      this.data = param1RelateRecThreadResIdl.data;
    }
    
    public RelateRecThreadResIdl build(boolean param1Boolean) {
      return new RelateRecThreadResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
