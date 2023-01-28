package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMyPostReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMyPostReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMyPostReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMyPostReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMyPostReqIdl param1GetMyPostReqIdl) {
      super(param1GetMyPostReqIdl);
      if (param1GetMyPostReqIdl == null)
        return; 
      this.data = param1GetMyPostReqIdl.data;
    }
    
    public GetMyPostReqIdl build(boolean param1Boolean) {
      return new GetMyPostReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
