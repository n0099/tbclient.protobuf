package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddPostResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AddPostResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AddPostResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddPostResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddPostResIdl param1AddPostResIdl) {
      super(param1AddPostResIdl);
      if (param1AddPostResIdl == null)
        return; 
      this.error = param1AddPostResIdl.error;
      this.data = param1AddPostResIdl.data;
    }
    
    public AddPostResIdl build(boolean param1Boolean) {
      return new AddPostResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
