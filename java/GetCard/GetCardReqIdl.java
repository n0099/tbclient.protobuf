package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetCardReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetCardReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetCardReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetCardReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetCardReqIdl param1GetCardReqIdl) {
      super(param1GetCardReqIdl);
      if (param1GetCardReqIdl == null)
        return; 
      this.data = param1GetCardReqIdl.data;
    }
    
    public GetCardReqIdl build(boolean param1Boolean) {
      return new GetCardReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
