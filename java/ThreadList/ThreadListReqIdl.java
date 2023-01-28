package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ThreadListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ThreadListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ThreadListReqIdl param1ThreadListReqIdl) {
      super(param1ThreadListReqIdl);
      if (param1ThreadListReqIdl == null)
        return; 
      this.data = param1ThreadListReqIdl.data;
    }
    
    public ThreadListReqIdl build(boolean param1Boolean) {
      return new ThreadListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
