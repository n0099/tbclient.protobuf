package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GeneralTabListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GeneralTabListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GeneralTabListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GeneralTabListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GeneralTabListResIdl param1GeneralTabListResIdl) {
      super(param1GeneralTabListResIdl);
      if (param1GeneralTabListResIdl == null)
        return; 
      this.error = param1GeneralTabListResIdl.error;
      this.data = param1GeneralTabListResIdl.data;
    }
    
    public GeneralTabListResIdl build(boolean param1Boolean) {
      return new GeneralTabListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
