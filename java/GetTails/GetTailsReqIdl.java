package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetTailsReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public GetTailsReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTailsReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTailsReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(GetTailsReqIdl param1GetTailsReqIdl) {
      super(param1GetTailsReqIdl);
      if (param1GetTailsReqIdl == null)
        return; 
      this.data = param1GetTailsReqIdl.data;
    }
    
    public GetTailsReqIdl build(boolean param1Boolean) {
      return new GetTailsReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
