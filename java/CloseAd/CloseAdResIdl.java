package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class CloseAdResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public CloseAdResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public CloseAdResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CloseAdResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(CloseAdResIdl param1CloseAdResIdl) {
      super(param1CloseAdResIdl);
      if (param1CloseAdResIdl == null)
        return; 
      this.error = param1CloseAdResIdl.error;
      this.data = param1CloseAdResIdl.data;
    }
    
    public CloseAdResIdl build(boolean param1Boolean) {
      return new CloseAdResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
