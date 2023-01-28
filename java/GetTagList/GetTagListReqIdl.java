package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetTagListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetTagListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTagListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTagListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetTagListReqIdl param1GetTagListReqIdl) {
      super(param1GetTagListReqIdl);
      if (param1GetTagListReqIdl == null)
        return; 
      this.data = param1GetTagListReqIdl.data;
    }
    
    public GetTagListReqIdl build(boolean param1Boolean) {
      return new GetTagListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
