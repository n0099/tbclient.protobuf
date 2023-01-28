package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class FrsPageResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public FrsPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public FrsPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsPageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(FrsPageResIdl param1FrsPageResIdl) {
      super(param1FrsPageResIdl);
      if (param1FrsPageResIdl == null)
        return; 
      this.error = param1FrsPageResIdl.error;
      this.data = param1FrsPageResIdl.data;
    }
    
    public FrsPageResIdl build(boolean param1Boolean) {
      return new FrsPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
