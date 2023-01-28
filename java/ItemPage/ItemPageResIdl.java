package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ItemPageResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ItemPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ItemPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemPageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ItemPageResIdl param1ItemPageResIdl) {
      super(param1ItemPageResIdl);
      if (param1ItemPageResIdl == null)
        return; 
      this.error = param1ItemPageResIdl.error;
      this.data = param1ItemPageResIdl.data;
    }
    
    public ItemPageResIdl build(boolean param1Boolean) {
      return new ItemPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
