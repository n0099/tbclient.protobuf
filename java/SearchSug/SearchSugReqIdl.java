package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SearchSugReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SearchSugReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchSugReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchSugReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SearchSugReqIdl param1SearchSugReqIdl) {
      super(param1SearchSugReqIdl);
      if (param1SearchSugReqIdl == null)
        return; 
      this.data = param1SearchSugReqIdl.data;
    }
    
    public SearchSugReqIdl build(boolean param1Boolean) {
      return new SearchSugReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
