package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetGiftListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetGiftListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetGiftListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGiftListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetGiftListReqIdl param1GetGiftListReqIdl) {
      super(param1GetGiftListReqIdl);
      if (param1GetGiftListReqIdl == null)
        return; 
      this.data = param1GetGiftListReqIdl.data;
    }
    
    public GetGiftListReqIdl build(boolean param1Boolean) {
      return new GetGiftListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
