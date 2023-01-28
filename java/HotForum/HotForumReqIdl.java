package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotForumReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public HotForumReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public HotForumReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotForumReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(HotForumReqIdl param1HotForumReqIdl) {
      super(param1HotForumReqIdl);
      if (param1HotForumReqIdl == null)
        return; 
      this.data = param1HotForumReqIdl.data;
    }
    
    public HotForumReqIdl build(boolean param1Boolean) {
      return new HotForumReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
