package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetShoubaiThreadListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetShoubaiThreadListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetShoubaiThreadListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetShoubaiThreadListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetShoubaiThreadListReqIdl param1GetShoubaiThreadListReqIdl) {
      super(param1GetShoubaiThreadListReqIdl);
      if (param1GetShoubaiThreadListReqIdl == null)
        return; 
      this.data = param1GetShoubaiThreadListReqIdl.data;
    }
    
    public GetShoubaiThreadListReqIdl build(boolean param1Boolean) {
      return new GetShoubaiThreadListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
