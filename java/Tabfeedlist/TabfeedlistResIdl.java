package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class TabfeedlistResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public TabfeedlistResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public TabfeedlistResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TabfeedlistResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(TabfeedlistResIdl param1TabfeedlistResIdl) {
      super(param1TabfeedlistResIdl);
      if (param1TabfeedlistResIdl == null)
        return; 
      this.error = param1TabfeedlistResIdl.error;
      this.data = param1TabfeedlistResIdl.data;
    }
    
    public TabfeedlistResIdl build(boolean param1Boolean) {
      return new TabfeedlistResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
