package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetHistoryForumReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetHistoryForumReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetHistoryForumReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetHistoryForumReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetHistoryForumReqIdl param1GetHistoryForumReqIdl) {
      super(param1GetHistoryForumReqIdl);
      if (param1GetHistoryForumReqIdl == null)
        return; 
      this.data = param1GetHistoryForumReqIdl.data;
    }
    
    public GetHistoryForumReqIdl build(boolean param1Boolean) {
      return new GetHistoryForumReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
