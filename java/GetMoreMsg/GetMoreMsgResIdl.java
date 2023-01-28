package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMoreMsgResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetMoreMsgResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMoreMsgResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMoreMsgResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMoreMsgResIdl param1GetMoreMsgResIdl) {
      super(param1GetMoreMsgResIdl);
      if (param1GetMoreMsgResIdl == null)
        return; 
      this.error = param1GetMoreMsgResIdl.error;
      this.data = param1GetMoreMsgResIdl.data;
    }
    
    public GetMoreMsgResIdl build(boolean param1Boolean) {
      return new GetMoreMsgResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
