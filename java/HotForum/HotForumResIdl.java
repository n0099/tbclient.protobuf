package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class HotForumResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public HotForumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public HotForumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotForumResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(HotForumResIdl param1HotForumResIdl) {
      super(param1HotForumResIdl);
      if (param1HotForumResIdl == null)
        return; 
      this.data = param1HotForumResIdl.data;
      this.error = param1HotForumResIdl.error;
    }
    
    public HotForumResIdl build(boolean param1Boolean) {
      return new HotForumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
