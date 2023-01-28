package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AddPollPostResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public AddPollPostResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public AddPollPostResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddPollPostResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AddPollPostResIdl param1AddPollPostResIdl) {
      super(param1AddPollPostResIdl);
      if (param1AddPollPostResIdl == null)
        return; 
      this.data = param1AddPollPostResIdl.data;
      this.error = param1AddPollPostResIdl.error;
    }
    
    public AddPollPostResIdl build(boolean param1Boolean) {
      return new AddPollPostResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
