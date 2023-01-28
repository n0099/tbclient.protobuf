package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class QueryBlockAndAppealInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public QueryBlockAndAppealInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public QueryBlockAndAppealInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<QueryBlockAndAppealInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(QueryBlockAndAppealInfoReqIdl param1QueryBlockAndAppealInfoReqIdl) {
      super(param1QueryBlockAndAppealInfoReqIdl);
      if (param1QueryBlockAndAppealInfoReqIdl == null)
        return; 
      this.data = param1QueryBlockAndAppealInfoReqIdl.data;
    }
    
    public QueryBlockAndAppealInfoReqIdl build(boolean param1Boolean) {
      return new QueryBlockAndAppealInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
