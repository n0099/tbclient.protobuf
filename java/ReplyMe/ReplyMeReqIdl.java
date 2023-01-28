package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyMeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ReplyMeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ReplyMeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyMeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ReplyMeReqIdl param1ReplyMeReqIdl) {
      super(param1ReplyMeReqIdl);
      if (param1ReplyMeReqIdl == null)
        return; 
      this.data = param1ReplyMeReqIdl.data;
    }
    
    public ReplyMeReqIdl build(boolean param1Boolean) {
      return new ReplyMeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
