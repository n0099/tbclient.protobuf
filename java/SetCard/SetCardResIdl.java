package tbclient.SetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetCardResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetCardResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetCardResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetCardResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetCardResIdl param1SetCardResIdl) {
      super(param1SetCardResIdl);
      if (param1SetCardResIdl == null)
        return; 
      this.error = param1SetCardResIdl.error;
      this.data = param1SetCardResIdl.data;
    }
    
    public SetCardResIdl build(boolean param1Boolean) {
      return new SetCardResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
