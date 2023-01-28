package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetLockWindowMsgResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetLockWindowMsgResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetLockWindowMsgResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetLockWindowMsgResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetLockWindowMsgResIdl param1GetLockWindowMsgResIdl) {
      super(param1GetLockWindowMsgResIdl);
      if (param1GetLockWindowMsgResIdl == null)
        return; 
      this.error = param1GetLockWindowMsgResIdl.error;
      this.data = param1GetLockWindowMsgResIdl.data;
    }
    
    public GetLockWindowMsgResIdl build(boolean param1Boolean) {
      return new GetLockWindowMsgResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
