package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBubbleByCategoryResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBubbleByCategoryResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBubbleByCategoryResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBubbleByCategoryResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBubbleByCategoryResIdl param1GetBubbleByCategoryResIdl) {
      super(param1GetBubbleByCategoryResIdl);
      if (param1GetBubbleByCategoryResIdl == null)
        return; 
      this.data = param1GetBubbleByCategoryResIdl.data;
      this.error = param1GetBubbleByCategoryResIdl.error;
    }
    
    public GetBubbleByCategoryResIdl build(boolean param1Boolean) {
      return new GetBubbleByCategoryResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
