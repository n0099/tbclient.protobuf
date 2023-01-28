package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumRecommendReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ForumRecommendReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumRecommendReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumRecommendReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ForumRecommendReqIdl param1ForumRecommendReqIdl) {
      super(param1ForumRecommendReqIdl);
      if (param1ForumRecommendReqIdl == null)
        return; 
      this.data = param1ForumRecommendReqIdl.data;
    }
    
    public ForumRecommendReqIdl build(boolean param1Boolean) {
      return new ForumRecommendReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
