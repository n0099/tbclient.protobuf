package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetRecommendGodListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetRecommendGodListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRecommendGodListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRecommendGodListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetRecommendGodListResIdl param1GetRecommendGodListResIdl) {
      super(param1GetRecommendGodListResIdl);
      if (param1GetRecommendGodListResIdl == null)
        return; 
      this.error = param1GetRecommendGodListResIdl.error;
      this.data = param1GetRecommendGodListResIdl.data;
    }
    
    public GetRecommendGodListResIdl build(boolean param1Boolean) {
      return new GetRecommendGodListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
