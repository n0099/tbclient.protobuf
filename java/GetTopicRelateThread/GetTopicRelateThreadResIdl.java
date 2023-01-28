package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetTopicRelateThreadResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetTopicRelateThreadResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetTopicRelateThreadResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTopicRelateThreadResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetTopicRelateThreadResIdl param1GetTopicRelateThreadResIdl) {
      super(param1GetTopicRelateThreadResIdl);
      if (param1GetTopicRelateThreadResIdl == null)
        return; 
      this.data = param1GetTopicRelateThreadResIdl.data;
      this.error = param1GetTopicRelateThreadResIdl.error;
    }
    
    public GetTopicRelateThreadResIdl build(boolean param1Boolean) {
      return new GetTopicRelateThreadResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
