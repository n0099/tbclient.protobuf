package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetRecommendTopicReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetRecommendTopicReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRecommendTopicReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRecommendTopicReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetRecommendTopicReqIdl param1GetRecommendTopicReqIdl) {
      super(param1GetRecommendTopicReqIdl);
      if (param1GetRecommendTopicReqIdl == null)
        return; 
      this.data = param1GetRecommendTopicReqIdl.data;
    }
    
    public GetRecommendTopicReqIdl build(boolean param1Boolean) {
      return new GetRecommendTopicReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
