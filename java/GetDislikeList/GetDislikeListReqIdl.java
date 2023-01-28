package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetDislikeListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetDislikeListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetDislikeListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetDislikeListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetDislikeListReqIdl param1GetDislikeListReqIdl) {
      super(param1GetDislikeListReqIdl);
      if (param1GetDislikeListReqIdl == null)
        return; 
      this.data = param1GetDislikeListReqIdl.data;
    }
    
    public GetDislikeListReqIdl build(boolean param1Boolean) {
      return new GetDislikeListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
