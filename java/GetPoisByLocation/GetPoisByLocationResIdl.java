package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetPoisByLocationResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetPoisByLocationResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPoisByLocationResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPoisByLocationResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetPoisByLocationResIdl param1GetPoisByLocationResIdl) {
      super(param1GetPoisByLocationResIdl);
      if (param1GetPoisByLocationResIdl == null)
        return; 
      this.error = param1GetPoisByLocationResIdl.error;
      this.data = param1GetPoisByLocationResIdl.data;
    }
    
    public GetPoisByLocationResIdl build(boolean param1Boolean) {
      return new GetPoisByLocationResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
