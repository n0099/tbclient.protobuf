package tbclient.IncrForumAccessCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class IncrForumAccessCountResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public IncrForumAccessCountResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public IncrForumAccessCountResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IncrForumAccessCountResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(IncrForumAccessCountResIdl param1IncrForumAccessCountResIdl) {
      super(param1IncrForumAccessCountResIdl);
      if (param1IncrForumAccessCountResIdl == null)
        return; 
      this.error = param1IncrForumAccessCountResIdl.error;
      this.data = param1IncrForumAccessCountResIdl.data;
    }
    
    public IncrForumAccessCountResIdl build(boolean param1Boolean) {
      return new IncrForumAccessCountResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
