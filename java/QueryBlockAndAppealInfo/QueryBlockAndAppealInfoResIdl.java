package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class QueryBlockAndAppealInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public QueryBlockAndAppealInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public QueryBlockAndAppealInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<QueryBlockAndAppealInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(QueryBlockAndAppealInfoResIdl param1QueryBlockAndAppealInfoResIdl) {
      super(param1QueryBlockAndAppealInfoResIdl);
      if (param1QueryBlockAndAppealInfoResIdl == null)
        return; 
      this.error = param1QueryBlockAndAppealInfoResIdl.error;
      this.data = param1QueryBlockAndAppealInfoResIdl.data;
    }
    
    public QueryBlockAndAppealInfoResIdl build(boolean param1Boolean) {
      return new QueryBlockAndAppealInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
