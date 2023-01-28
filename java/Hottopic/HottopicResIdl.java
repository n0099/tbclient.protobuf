package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class HottopicResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public HottopicResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public HottopicResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HottopicResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(HottopicResIdl param1HottopicResIdl) {
      super(param1HottopicResIdl);
      if (param1HottopicResIdl == null)
        return; 
      this.data = param1HottopicResIdl.data;
      this.error = param1HottopicResIdl.error;
    }
    
    public HottopicResIdl build(boolean param1Boolean) {
      return new HottopicResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
