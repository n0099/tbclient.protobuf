package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetWebviewCacheInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetWebviewCacheInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetWebviewCacheInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetWebviewCacheInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetWebviewCacheInfoResIdl param1GetWebviewCacheInfoResIdl) {
      super(param1GetWebviewCacheInfoResIdl);
      if (param1GetWebviewCacheInfoResIdl == null)
        return; 
      this.error = param1GetWebviewCacheInfoResIdl.error;
      this.data = param1GetWebviewCacheInfoResIdl.data;
    }
    
    public GetWebviewCacheInfoResIdl build(boolean param1Boolean) {
      return new GetWebviewCacheInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
