package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ForumRecommendResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ForumRecommendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumRecommendResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumRecommendResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ForumRecommendResIdl param1ForumRecommendResIdl) {
      super(param1ForumRecommendResIdl);
      if (param1ForumRecommendResIdl == null)
        return; 
      this.error = param1ForumRecommendResIdl.error;
      this.data = param1ForumRecommendResIdl.data;
    }
    
    public ForumRecommendResIdl build(boolean param1Boolean) {
      return new ForumRecommendResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
