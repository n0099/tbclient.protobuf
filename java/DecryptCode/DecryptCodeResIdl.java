package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DecryptCodeResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public DecryptCodeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public DecryptCodeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DecryptCodeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DecryptCodeResIdl param1DecryptCodeResIdl) {
      super(param1DecryptCodeResIdl);
      if (param1DecryptCodeResIdl == null)
        return; 
      this.error = param1DecryptCodeResIdl.error;
      this.data = param1DecryptCodeResIdl.data;
    }
    
    public DecryptCodeResIdl build(boolean param1Boolean) {
      return new DecryptCodeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
