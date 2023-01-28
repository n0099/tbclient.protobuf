package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetClientConfigResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetClientConfigResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetClientConfigResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetClientConfigResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetClientConfigResIdl param1GetClientConfigResIdl) {
      super(param1GetClientConfigResIdl);
      if (param1GetClientConfigResIdl == null)
        return; 
      this.data = param1GetClientConfigResIdl.data;
      this.error = param1GetClientConfigResIdl.error;
    }
    
    public GetClientConfigResIdl build(boolean param1Boolean) {
      return new GetClientConfigResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
