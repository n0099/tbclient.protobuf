package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetForumBroadcastListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetForumBroadcastListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumBroadcastListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumBroadcastListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetForumBroadcastListResIdl param1GetForumBroadcastListResIdl) {
      super(param1GetForumBroadcastListResIdl);
      if (param1GetForumBroadcastListResIdl == null)
        return; 
      this.error = param1GetForumBroadcastListResIdl.error;
      this.data = param1GetForumBroadcastListResIdl.data;
    }
    
    public GetForumBroadcastListResIdl build(boolean param1Boolean) {
      return new GetForumBroadcastListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
