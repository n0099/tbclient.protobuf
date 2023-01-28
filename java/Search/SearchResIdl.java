package tbclient.Search;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SearchResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SearchResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SearchResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SearchResIdl param1SearchResIdl) {
      super(param1SearchResIdl);
      if (param1SearchResIdl == null)
        return; 
      this.error = param1SearchResIdl.error;
      this.data = param1SearchResIdl.data;
    }
    
    public SearchResIdl build(boolean param1Boolean) {
      return new SearchResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
