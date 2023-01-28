package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SubTagListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SubTagListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SubTagListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SubTagListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SubTagListResIdl param1SubTagListResIdl) {
      super(param1SubTagListResIdl);
      if (param1SubTagListResIdl == null)
        return; 
      this.error = param1SubTagListResIdl.error;
      this.data = param1SubTagListResIdl.data;
    }
    
    public SubTagListResIdl build(boolean param1Boolean) {
      return new SubTagListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
