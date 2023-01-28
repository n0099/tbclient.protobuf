package tbclient.GetBubbleList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBubbleListResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBubbleListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBubbleListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBubbleListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBubbleListResIdl param1GetBubbleListResIdl) {
      super(param1GetBubbleListResIdl);
      if (param1GetBubbleListResIdl == null)
        return; 
      this.data = param1GetBubbleListResIdl.data;
      this.error = param1GetBubbleListResIdl.error;
    }
    
    public GetBubbleListResIdl build(boolean param1Boolean) {
      return new GetBubbleListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
