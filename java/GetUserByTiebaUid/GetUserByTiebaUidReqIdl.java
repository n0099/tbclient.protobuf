package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetUserByTiebaUidReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetUserByTiebaUidReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserByTiebaUidReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserByTiebaUidReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetUserByTiebaUidReqIdl param1GetUserByTiebaUidReqIdl) {
      super(param1GetUserByTiebaUidReqIdl);
      if (param1GetUserByTiebaUidReqIdl == null)
        return; 
      this.data = param1GetUserByTiebaUidReqIdl.data;
    }
    
    public GetUserByTiebaUidReqIdl build(boolean param1Boolean) {
      return new GetUserByTiebaUidReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
