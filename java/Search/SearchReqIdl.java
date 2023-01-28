package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SearchReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SearchReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SearchReqIdl param1SearchReqIdl) {
      super(param1SearchReqIdl);
      if (param1SearchReqIdl == null)
        return; 
      this.data = param1SearchReqIdl.data;
    }
    
    public SearchReqIdl build(boolean param1Boolean) {
      return new SearchReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
