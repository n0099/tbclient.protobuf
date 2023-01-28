package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetLevelInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetLevelInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetLevelInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetLevelInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetLevelInfoReqIdl param1GetLevelInfoReqIdl) {
      super(param1GetLevelInfoReqIdl);
      if (param1GetLevelInfoReqIdl == null)
        return; 
      this.data = param1GetLevelInfoReqIdl.data;
    }
    
    public GetLevelInfoReqIdl build(boolean param1Boolean) {
      return new GetLevelInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
