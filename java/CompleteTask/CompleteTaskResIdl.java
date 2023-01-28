package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class CompleteTaskResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public CompleteTaskResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public CompleteTaskResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CompleteTaskResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(CompleteTaskResIdl param1CompleteTaskResIdl) {
      super(param1CompleteTaskResIdl);
      if (param1CompleteTaskResIdl == null)
        return; 
      this.error = param1CompleteTaskResIdl.error;
      this.data = param1CompleteTaskResIdl.data;
    }
    
    public CompleteTaskResIdl build(boolean param1Boolean) {
      return new CompleteTaskResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
