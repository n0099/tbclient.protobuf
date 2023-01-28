package tbclient.GetRecommendTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetRecommendTopicResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetRecommendTopicResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRecommendTopicResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRecommendTopicResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetRecommendTopicResIdl param1GetRecommendTopicResIdl) {
      super(param1GetRecommendTopicResIdl);
      if (param1GetRecommendTopicResIdl == null)
        return; 
      this.error = param1GetRecommendTopicResIdl.error;
      this.data = param1GetRecommendTopicResIdl.data;
    }
    
    public GetRecommendTopicResIdl build(boolean param1Boolean) {
      return new GetRecommendTopicResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
