package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetPostListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetPostListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPostListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPostListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetPostListReqIdl param1GetPostListReqIdl) {
      super(param1GetPostListReqIdl);
      if (param1GetPostListReqIdl == null)
        return; 
      this.data = param1GetPostListReqIdl.data;
    }
    
    public GetPostListReqIdl build(boolean param1Boolean) {
      return new GetPostListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
