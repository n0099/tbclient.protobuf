package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBackgroundReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBackgroundReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBackgroundReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBackgroundReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBackgroundReqIdl param1GetBackgroundReqIdl) {
      super(param1GetBackgroundReqIdl);
      if (param1GetBackgroundReqIdl == null)
        return; 
      this.data = param1GetBackgroundReqIdl.data;
    }
    
    public GetBackgroundReqIdl build(boolean param1Boolean) {
      return new GetBackgroundReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
