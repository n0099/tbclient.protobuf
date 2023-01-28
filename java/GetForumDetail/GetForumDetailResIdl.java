package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetForumDetailResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetForumDetailResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumDetailResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumDetailResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetForumDetailResIdl param1GetForumDetailResIdl) {
      super(param1GetForumDetailResIdl);
      if (param1GetForumDetailResIdl == null)
        return; 
      this.error = param1GetForumDetailResIdl.error;
      this.data = param1GetForumDetailResIdl.data;
    }
    
    public GetForumDetailResIdl build(boolean param1Boolean) {
      return new GetForumDetailResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
