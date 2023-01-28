package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadPublishReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ThreadPublishReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ThreadPublishReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadPublishReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ThreadPublishReqIdl param1ThreadPublishReqIdl) {
      super(param1ThreadPublishReqIdl);
      if (param1ThreadPublishReqIdl == null)
        return; 
      this.data = param1ThreadPublishReqIdl.data;
    }
    
    public ThreadPublishReqIdl build(boolean param1Boolean) {
      return new ThreadPublishReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
