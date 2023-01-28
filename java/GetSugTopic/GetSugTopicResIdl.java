package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetSugTopicResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetSugTopicResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetSugTopicResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetSugTopicResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetSugTopicResIdl param1GetSugTopicResIdl) {
      super(param1GetSugTopicResIdl);
      if (param1GetSugTopicResIdl == null)
        return; 
      this.error = param1GetSugTopicResIdl.error;
      this.data = param1GetSugTopicResIdl.data;
    }
    
    public GetSugTopicResIdl build(boolean param1Boolean) {
      return new GetSugTopicResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
