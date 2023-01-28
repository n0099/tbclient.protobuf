package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetVerticalForumListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetVerticalForumListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetVerticalForumListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetVerticalForumListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetVerticalForumListReqIdl param1GetVerticalForumListReqIdl) {
      super(param1GetVerticalForumListReqIdl);
      if (param1GetVerticalForumListReqIdl == null)
        return; 
      this.data = param1GetVerticalForumListReqIdl.data;
    }
    
    public GetVerticalForumListReqIdl build(boolean param1Boolean) {
      return new GetVerticalForumListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
