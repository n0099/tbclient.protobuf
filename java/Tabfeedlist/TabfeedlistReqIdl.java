package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabfeedlistReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public TabfeedlistReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public TabfeedlistReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TabfeedlistReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(TabfeedlistReqIdl param1TabfeedlistReqIdl) {
      super(param1TabfeedlistReqIdl);
      if (param1TabfeedlistReqIdl == null)
        return; 
      this.data = param1TabfeedlistReqIdl.data;
    }
    
    public TabfeedlistReqIdl build(boolean param1Boolean) {
      return new TabfeedlistReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
