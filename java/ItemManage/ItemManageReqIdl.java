package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemManageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ItemManageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ItemManageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemManageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ItemManageReqIdl param1ItemManageReqIdl) {
      super(param1ItemManageReqIdl);
      if (param1ItemManageReqIdl == null)
        return; 
      this.data = param1ItemManageReqIdl.data;
    }
    
    public ItemManageReqIdl build(boolean param1Boolean) {
      return new ItemManageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
