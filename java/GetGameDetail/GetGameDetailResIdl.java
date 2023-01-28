package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetGameDetailResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetGameDetailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetGameDetailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGameDetailResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetGameDetailResIdl param1GetGameDetailResIdl) {
      super(param1GetGameDetailResIdl);
      if (param1GetGameDetailResIdl == null)
        return; 
      this.error = param1GetGameDetailResIdl.error;
      this.data = param1GetGameDetailResIdl.data;
    }
    
    public GetGameDetailResIdl build(boolean param1Boolean) {
      return new GetGameDetailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
