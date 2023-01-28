package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ItemManageResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ItemManageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ItemManageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemManageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ItemManageResIdl param1ItemManageResIdl) {
      super(param1ItemManageResIdl);
      if (param1ItemManageResIdl == null)
        return; 
      this.error = param1ItemManageResIdl.error;
      this.data = param1ItemManageResIdl.data;
    }
    
    public ItemManageResIdl build(boolean param1Boolean) {
      return new ItemManageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
