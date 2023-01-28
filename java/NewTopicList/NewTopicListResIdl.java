package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class NewTopicListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public NewTopicListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public NewTopicListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(NewTopicListResIdl param1NewTopicListResIdl) {
      super(param1NewTopicListResIdl);
      if (param1NewTopicListResIdl == null)
        return; 
      this.error = param1NewTopicListResIdl.error;
      this.data = param1NewTopicListResIdl.data;
    }
    
    public NewTopicListResIdl build(boolean param1Boolean) {
      return new NewTopicListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
