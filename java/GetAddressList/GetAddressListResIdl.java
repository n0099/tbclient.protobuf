package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetAddressListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetAddressListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetAddressListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetAddressListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetAddressListResIdl param1GetAddressListResIdl) {
      super(param1GetAddressListResIdl);
      if (param1GetAddressListResIdl == null)
        return; 
      this.error = param1GetAddressListResIdl.error;
      this.data = param1GetAddressListResIdl.data;
    }
    
    public GetAddressListResIdl build(boolean param1Boolean) {
      return new GetAddressListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
