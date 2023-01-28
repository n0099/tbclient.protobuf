package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ForumMenuResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ForumMenuResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumMenuResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumMenuResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ForumMenuResIdl param1ForumMenuResIdl) {
      super(param1ForumMenuResIdl);
      if (param1ForumMenuResIdl == null)
        return; 
      this.error = param1ForumMenuResIdl.error;
      this.data = param1ForumMenuResIdl.data;
    }
    
    public ForumMenuResIdl build(boolean param1Boolean) {
      return new ForumMenuResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
