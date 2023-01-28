package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ThreadPublishResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ThreadPublishResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ThreadPublishResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadPublishResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ThreadPublishResIdl param1ThreadPublishResIdl) {
      super(param1ThreadPublishResIdl);
      if (param1ThreadPublishResIdl == null)
        return; 
      this.error = param1ThreadPublishResIdl.error;
      this.data = param1ThreadPublishResIdl.data;
    }
    
    public ThreadPublishResIdl build(boolean param1Boolean) {
      return new ThreadPublishResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
