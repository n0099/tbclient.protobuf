package tbclient.GetMsgRecForumlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMsgRecForumlistReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMsgRecForumlistReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMsgRecForumlistReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMsgRecForumlistReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMsgRecForumlistReqIdl param1GetMsgRecForumlistReqIdl) {
      super(param1GetMsgRecForumlistReqIdl);
      if (param1GetMsgRecForumlistReqIdl == null)
        return; 
      this.data = param1GetMsgRecForumlistReqIdl.data;
    }
    
    public GetMsgRecForumlistReqIdl build(boolean param1Boolean) {
      return new GetMsgRecForumlistReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
