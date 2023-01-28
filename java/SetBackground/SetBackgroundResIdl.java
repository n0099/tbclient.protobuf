package tbclient.SetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetBackgroundResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public SetBackgroundResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public SetBackgroundResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetBackgroundResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetBackgroundResIdl param1SetBackgroundResIdl) {
      super(param1SetBackgroundResIdl);
      if (param1SetBackgroundResIdl == null)
        return; 
      this.data = param1SetBackgroundResIdl.data;
      this.error = param1SetBackgroundResIdl.error;
    }
    
    public SetBackgroundResIdl build(boolean param1Boolean) {
      return new SetBackgroundResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
