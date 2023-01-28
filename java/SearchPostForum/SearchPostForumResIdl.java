package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SearchPostForumResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SearchPostForumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchPostForumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchPostForumResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SearchPostForumResIdl param1SearchPostForumResIdl) {
      super(param1SearchPostForumResIdl);
      if (param1SearchPostForumResIdl == null)
        return; 
      this.error = param1SearchPostForumResIdl.error;
      this.data = param1SearchPostForumResIdl.data;
    }
    
    public SearchPostForumResIdl build(boolean param1Boolean) {
      return new SearchPostForumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
