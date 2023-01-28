package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMyGiftReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMyGiftReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMyGiftReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMyGiftReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMyGiftReqIdl param1GetMyGiftReqIdl) {
      super(param1GetMyGiftReqIdl);
      if (param1GetMyGiftReqIdl == null)
        return; 
      this.data = param1GetMyGiftReqIdl.data;
    }
    
    public GetMyGiftReqIdl build(boolean param1Boolean) {
      return new GetMyGiftReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
