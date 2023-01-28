package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SearchPostForumReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SearchPostForumReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchPostForumReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchPostForumReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SearchPostForumReqIdl param1SearchPostForumReqIdl) {
      super(param1SearchPostForumReqIdl);
      if (param1SearchPostForumReqIdl == null)
        return; 
      this.data = param1SearchPostForumReqIdl.data;
    }
    
    public SearchPostForumReqIdl build(boolean param1Boolean) {
      return new SearchPostForumReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
