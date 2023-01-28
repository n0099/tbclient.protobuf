package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SearchSugResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SearchSugResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchSugResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchSugResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SearchSugResIdl param1SearchSugResIdl) {
      super(param1SearchSugResIdl);
      if (param1SearchSugResIdl == null)
        return; 
      this.error = param1SearchSugResIdl.error;
      this.data = param1SearchSugResIdl.data;
    }
    
    public SearchSugResIdl build(boolean param1Boolean) {
      return new SearchSugResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
