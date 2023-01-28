package tbclient.ItemPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ItemPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ItemPageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemPageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ItemPageReqIdl param1ItemPageReqIdl) {
      super(param1ItemPageReqIdl);
      if (param1ItemPageReqIdl == null)
        return; 
      this.data = param1ItemPageReqIdl.data;
    }
    
    public ItemPageReqIdl build(boolean param1Boolean) {
      return new ItemPageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
