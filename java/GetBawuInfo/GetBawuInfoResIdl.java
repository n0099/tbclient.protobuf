package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBawuInfoResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBawuInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBawuInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBawuInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBawuInfoResIdl param1GetBawuInfoResIdl) {
      super(param1GetBawuInfoResIdl);
      if (param1GetBawuInfoResIdl == null)
        return; 
      this.data = param1GetBawuInfoResIdl.data;
      this.error = param1GetBawuInfoResIdl.error;
    }
    
    public GetBawuInfoResIdl build(boolean param1Boolean) {
      return new GetBawuInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
