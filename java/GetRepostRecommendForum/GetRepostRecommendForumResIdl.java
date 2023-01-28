package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetRepostRecommendForumResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetRepostRecommendForumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRepostRecommendForumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRepostRecommendForumResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetRepostRecommendForumResIdl param1GetRepostRecommendForumResIdl) {
      super(param1GetRepostRecommendForumResIdl);
      if (param1GetRepostRecommendForumResIdl == null)
        return; 
      this.error = param1GetRepostRecommendForumResIdl.error;
      this.data = param1GetRepostRecommendForumResIdl.data;
    }
    
    public GetRepostRecommendForumResIdl build(boolean param1Boolean) {
      return new GetRepostRecommendForumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
