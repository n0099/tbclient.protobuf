package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetLikeForumSortResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetLikeForumSortResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetLikeForumSortResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetLikeForumSortResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetLikeForumSortResIdl param1SetLikeForumSortResIdl) {
      super(param1SetLikeForumSortResIdl);
      if (param1SetLikeForumSortResIdl == null)
        return; 
      this.error = param1SetLikeForumSortResIdl.error;
      this.data = param1SetLikeForumSortResIdl.data;
    }
    
    public SetLikeForumSortResIdl build(boolean param1Boolean) {
      return new SetLikeForumSortResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
