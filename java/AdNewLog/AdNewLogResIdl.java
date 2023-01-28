package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AdNewLogResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AdNewLogResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AdNewLogResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdNewLogResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AdNewLogResIdl param1AdNewLogResIdl) {
      super(param1AdNewLogResIdl);
      if (param1AdNewLogResIdl == null)
        return; 
      this.error = param1AdNewLogResIdl.error;
      this.data = param1AdNewLogResIdl.data;
    }
    
    public AdNewLogResIdl build(boolean param1Boolean) {
      return new AdNewLogResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
