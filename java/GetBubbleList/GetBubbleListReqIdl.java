package tbclient.GetBubbleList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBubbleListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBubbleListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBubbleListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBubbleListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBubbleListReqIdl param1GetBubbleListReqIdl) {
      super(param1GetBubbleListReqIdl);
      if (param1GetBubbleListReqIdl == null)
        return; 
      this.data = param1GetBubbleListReqIdl.data;
    }
    
    public GetBubbleListReqIdl build(boolean param1Boolean) {
      return new GetBubbleListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
