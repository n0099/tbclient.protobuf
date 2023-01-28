package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetHistoryForumResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetHistoryForumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetHistoryForumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetHistoryForumResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetHistoryForumResIdl param1GetHistoryForumResIdl) {
      super(param1GetHistoryForumResIdl);
      if (param1GetHistoryForumResIdl == null)
        return; 
      this.error = param1GetHistoryForumResIdl.error;
      this.data = param1GetHistoryForumResIdl.data;
    }
    
    public GetHistoryForumResIdl build(boolean param1Boolean) {
      return new GetHistoryForumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
