package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class QueryCollectUpdateNumResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public QueryCollectUpdateNumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public QueryCollectUpdateNumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<QueryCollectUpdateNumResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(QueryCollectUpdateNumResIdl param1QueryCollectUpdateNumResIdl) {
      super(param1QueryCollectUpdateNumResIdl);
      if (param1QueryCollectUpdateNumResIdl == null)
        return; 
      this.error = param1QueryCollectUpdateNumResIdl.error;
      this.data = param1QueryCollectUpdateNumResIdl.data;
    }
    
    public QueryCollectUpdateNumResIdl build(boolean param1Boolean) {
      return new QueryCollectUpdateNumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
