package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetRecommendGodListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetRecommendGodListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRecommendGodListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRecommendGodListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetRecommendGodListReqIdl param1GetRecommendGodListReqIdl) {
      super(param1GetRecommendGodListReqIdl);
      if (param1GetRecommendGodListReqIdl == null)
        return; 
      this.data = param1GetRecommendGodListReqIdl.data;
    }
    
    public GetRecommendGodListReqIdl build(boolean param1Boolean) {
      return new GetRecommendGodListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
