package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetRepostRecommendForumReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetRepostRecommendForumReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetRepostRecommendForumReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetRepostRecommendForumReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetRepostRecommendForumReqIdl param1GetRepostRecommendForumReqIdl) {
      super(param1GetRepostRecommendForumReqIdl);
      if (param1GetRepostRecommendForumReqIdl == null)
        return; 
      this.data = param1GetRepostRecommendForumReqIdl.data;
    }
    
    public GetRepostRecommendForumReqIdl build(boolean param1Boolean) {
      return new GetRepostRecommendForumReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
