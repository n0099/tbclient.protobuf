package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetGameDetailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetGameDetailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetGameDetailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGameDetailReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetGameDetailReqIdl param1GetGameDetailReqIdl) {
      super(param1GetGameDetailReqIdl);
      if (param1GetGameDetailReqIdl == null)
        return; 
      this.data = param1GetGameDetailReqIdl.data;
    }
    
    public GetGameDetailReqIdl build(boolean param1Boolean) {
      return new GetGameDetailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
