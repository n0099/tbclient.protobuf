package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetForumSquareReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetForumSquareReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumSquareReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumSquareReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetForumSquareReqIdl param1GetForumSquareReqIdl) {
      super(param1GetForumSquareReqIdl);
      if (param1GetForumSquareReqIdl == null)
        return; 
      this.data = param1GetForumSquareReqIdl.data;
    }
    
    public GetForumSquareReqIdl build(boolean param1Boolean) {
      return new GetForumSquareReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
