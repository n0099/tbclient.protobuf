package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SendFreeGiftReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SendFreeGiftReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SendFreeGiftReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SendFreeGiftReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SendFreeGiftReqIdl param1SendFreeGiftReqIdl) {
      super(param1SendFreeGiftReqIdl);
      if (param1SendFreeGiftReqIdl == null)
        return; 
      this.data = param1SendFreeGiftReqIdl.data;
    }
    
    public SendFreeGiftReqIdl build(boolean param1Boolean) {
      return new SendFreeGiftReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
