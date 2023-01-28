package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class HotThreadListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public HotThreadListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public HotThreadListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotThreadListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(HotThreadListResIdl param1HotThreadListResIdl) {
      super(param1HotThreadListResIdl);
      if (param1HotThreadListResIdl == null)
        return; 
      this.error = param1HotThreadListResIdl.error;
      this.data = param1HotThreadListResIdl.data;
    }
    
    public HotThreadListResIdl build(boolean param1Boolean) {
      return new HotThreadListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
