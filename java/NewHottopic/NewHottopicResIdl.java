package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class NewHottopicResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public NewHottopicResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public NewHottopicResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewHottopicResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(NewHottopicResIdl param1NewHottopicResIdl) {
      super(param1NewHottopicResIdl);
      if (param1NewHottopicResIdl == null)
        return; 
      this.error = param1NewHottopicResIdl.error;
      this.data = param1NewHottopicResIdl.data;
    }
    
    public NewHottopicResIdl build(boolean param1Boolean) {
      return new NewHottopicResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
