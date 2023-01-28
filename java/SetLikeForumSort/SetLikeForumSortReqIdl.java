package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetLikeForumSortReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SetLikeForumSortReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetLikeForumSortReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetLikeForumSortReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SetLikeForumSortReqIdl param1SetLikeForumSortReqIdl) {
      super(param1SetLikeForumSortReqIdl);
      if (param1SetLikeForumSortReqIdl == null)
        return; 
      this.data = param1SetLikeForumSortReqIdl.data;
    }
    
    public SetLikeForumSortReqIdl build(boolean param1Boolean) {
      return new SetLikeForumSortReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
