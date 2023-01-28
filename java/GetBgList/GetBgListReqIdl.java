package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBgListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBgListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBgListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBgListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBgListReqIdl param1GetBgListReqIdl) {
      super(param1GetBgListReqIdl);
      if (param1GetBgListReqIdl == null)
        return; 
      this.data = param1GetBgListReqIdl.data;
    }
    
    public GetBgListReqIdl build(boolean param1Boolean) {
      return new GetBgListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
