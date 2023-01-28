package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PlaceOrderResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public PlaceOrderResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public PlaceOrderResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PlaceOrderResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PlaceOrderResIdl param1PlaceOrderResIdl) {
      super(param1PlaceOrderResIdl);
      if (param1PlaceOrderResIdl == null)
        return; 
      this.data = param1PlaceOrderResIdl.data;
      this.error = param1PlaceOrderResIdl.error;
    }
    
    public PlaceOrderResIdl build(boolean param1Boolean) {
      return new PlaceOrderResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
