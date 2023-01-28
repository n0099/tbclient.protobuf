package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class BigvipResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public BigvipResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public BigvipResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BigvipResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(BigvipResIdl param1BigvipResIdl) {
      super(param1BigvipResIdl);
      if (param1BigvipResIdl == null)
        return; 
      this.data = param1BigvipResIdl.data;
      this.error = param1BigvipResIdl.error;
    }
    
    public BigvipResIdl build(boolean param1Boolean) {
      return new BigvipResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
