package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetWebviewCacheInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetWebviewCacheInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetWebviewCacheInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetWebviewCacheInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetWebviewCacheInfoReqIdl param1GetWebviewCacheInfoReqIdl) {
      super(param1GetWebviewCacheInfoReqIdl);
      if (param1GetWebviewCacheInfoReqIdl == null)
        return; 
      this.data = param1GetWebviewCacheInfoReqIdl.data;
    }
    
    public GetWebviewCacheInfoReqIdl build(boolean param1Boolean) {
      return new GetWebviewCacheInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
