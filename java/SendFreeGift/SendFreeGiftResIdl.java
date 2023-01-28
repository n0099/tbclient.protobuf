package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SendFreeGiftResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public SendFreeGiftResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public SendFreeGiftResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SendFreeGiftResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SendFreeGiftResIdl param1SendFreeGiftResIdl) {
      super(param1SendFreeGiftResIdl);
      if (param1SendFreeGiftResIdl == null)
        return; 
      this.data = param1SendFreeGiftResIdl.data;
      this.error = param1SendFreeGiftResIdl.error;
    }
    
    public SendFreeGiftResIdl build(boolean param1Boolean) {
      return new SendFreeGiftResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
