package tbclient.SetPendant;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetPendantResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetPendantResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetPendantResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetPendantResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetPendantResIdl param1SetPendantResIdl) {
      super(param1SetPendantResIdl);
      if (param1SetPendantResIdl == null)
        return; 
      this.error = param1SetPendantResIdl.error;
      this.data = param1SetPendantResIdl.data;
    }
    
    public SetPendantResIdl build(boolean param1Boolean) {
      return new SetPendantResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
