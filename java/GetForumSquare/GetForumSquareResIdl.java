package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetForumSquareResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetForumSquareResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetForumSquareResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetForumSquareResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetForumSquareResIdl param1GetForumSquareResIdl) {
      super(param1GetForumSquareResIdl);
      if (param1GetForumSquareResIdl == null)
        return; 
      this.error = param1GetForumSquareResIdl.error;
      this.data = param1GetForumSquareResIdl.data;
    }
    
    public GetForumSquareResIdl build(boolean param1Boolean) {
      return new GetForumSquareResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
