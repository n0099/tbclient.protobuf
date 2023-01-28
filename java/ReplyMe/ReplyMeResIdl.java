package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ReplyMeResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ReplyMeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ReplyMeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyMeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ReplyMeResIdl param1ReplyMeResIdl) {
      super(param1ReplyMeResIdl);
      if (param1ReplyMeResIdl == null)
        return; 
      this.error = param1ReplyMeResIdl.error;
      this.data = param1ReplyMeResIdl.data;
    }
    
    public ReplyMeResIdl build(boolean param1Boolean) {
      return new ReplyMeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
