package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetVerticalForumListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetVerticalForumListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetVerticalForumListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetVerticalForumListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetVerticalForumListResIdl param1GetVerticalForumListResIdl) {
      super(param1GetVerticalForumListResIdl);
      if (param1GetVerticalForumListResIdl == null)
        return; 
      this.error = param1GetVerticalForumListResIdl.error;
      this.data = param1GetVerticalForumListResIdl.data;
    }
    
    public GetVerticalForumListResIdl build(boolean param1Boolean) {
      return new GetVerticalForumListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
