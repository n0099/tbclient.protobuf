package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ElectionInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ElectionInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ElectionInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ElectionInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ElectionInfoResIdl param1ElectionInfoResIdl) {
      super(param1ElectionInfoResIdl);
      if (param1ElectionInfoResIdl == null)
        return; 
      this.error = param1ElectionInfoResIdl.error;
      this.data = param1ElectionInfoResIdl.data;
    }
    
    public ElectionInfoResIdl build(boolean param1Boolean) {
      return new ElectionInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
