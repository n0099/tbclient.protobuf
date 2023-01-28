package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetForumDetailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetForumDetailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumDetailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumDetailReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetForumDetailReqIdl param1GetForumDetailReqIdl) {
      super(param1GetForumDetailReqIdl);
      if (param1GetForumDetailReqIdl == null)
        return; 
      this.data = param1GetForumDetailReqIdl.data;
    }
    
    public GetForumDetailReqIdl build(boolean param1Boolean) {
      return new GetForumDetailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
