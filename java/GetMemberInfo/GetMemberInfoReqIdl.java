package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMemberInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMemberInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMemberInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMemberInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMemberInfoReqIdl param1GetMemberInfoReqIdl) {
      super(param1GetMemberInfoReqIdl);
      if (param1GetMemberInfoReqIdl == null)
        return; 
      this.data = param1GetMemberInfoReqIdl.data;
    }
    
    public GetMemberInfoReqIdl build(boolean param1Boolean) {
      return new GetMemberInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
