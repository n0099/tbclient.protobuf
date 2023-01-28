package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IncrForumAccessCountReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public IncrForumAccessCountReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public IncrForumAccessCountReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IncrForumAccessCountReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(IncrForumAccessCountReqIdl param1IncrForumAccessCountReqIdl) {
      super(param1IncrForumAccessCountReqIdl);
      if (param1IncrForumAccessCountReqIdl == null)
        return; 
      this.data = param1IncrForumAccessCountReqIdl.data;
    }
    
    public IncrForumAccessCountReqIdl build(boolean param1Boolean) {
      return new IncrForumAccessCountReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
