package tbclient.NewTopicThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class NewTopicThreadResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public NewTopicThreadResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public NewTopicThreadResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicThreadResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(NewTopicThreadResIdl param1NewTopicThreadResIdl) {
      super(param1NewTopicThreadResIdl);
      if (param1NewTopicThreadResIdl == null)
        return; 
      this.error = param1NewTopicThreadResIdl.error;
      this.data = param1NewTopicThreadResIdl.data;
    }
    
    public NewTopicThreadResIdl build(boolean param1Boolean) {
      return new NewTopicThreadResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
