package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ThreadListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ThreadListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ThreadListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ThreadListResIdl param1ThreadListResIdl) {
      super(param1ThreadListResIdl);
      if (param1ThreadListResIdl == null)
        return; 
      this.error = param1ThreadListResIdl.error;
      this.data = param1ThreadListResIdl.data;
    }
    
    public ThreadListResIdl build(boolean param1Boolean) {
      return new ThreadListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
