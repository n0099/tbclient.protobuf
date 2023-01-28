package tbclient.GetMsgRecForumlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMsgRecForumlistResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetMsgRecForumlistResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMsgRecForumlistResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMsgRecForumlistResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMsgRecForumlistResIdl param1GetMsgRecForumlistResIdl) {
      super(param1GetMsgRecForumlistResIdl);
      if (param1GetMsgRecForumlistResIdl == null)
        return; 
      this.error = param1GetMsgRecForumlistResIdl.error;
      this.data = param1GetMsgRecForumlistResIdl.data;
    }
    
    public GetMsgRecForumlistResIdl build(boolean param1Boolean) {
      return new GetMsgRecForumlistResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
