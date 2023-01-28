package tbclient.ExcZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ExcZanResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public ExcZanResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public ExcZanResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcZanResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ExcZanResIdl param1ExcZanResIdl) {
      super(param1ExcZanResIdl);
      if (param1ExcZanResIdl == null)
        return; 
      this.data = param1ExcZanResIdl.data;
      this.error = param1ExcZanResIdl.error;
    }
    
    public ExcZanResIdl build(boolean param1Boolean) {
      return new ExcZanResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
