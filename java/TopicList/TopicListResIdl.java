package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class TopicListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public TopicListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public TopicListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(TopicListResIdl param1TopicListResIdl) {
      super(param1TopicListResIdl);
      if (param1TopicListResIdl == null)
        return; 
      this.error = param1TopicListResIdl.error;
      this.data = param1TopicListResIdl.data;
    }
    
    public TopicListResIdl build(boolean param1Boolean) {
      return new TopicListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
