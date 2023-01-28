package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class HistorySwanResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public HistorySwanResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public HistorySwanResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HistorySwanResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(HistorySwanResIdl param1HistorySwanResIdl) {
      super(param1HistorySwanResIdl);
      if (param1HistorySwanResIdl == null)
        return; 
      this.error = param1HistorySwanResIdl.error;
      this.data = param1HistorySwanResIdl.data;
    }
    
    public HistorySwanResIdl build(boolean param1Boolean) {
      return new HistorySwanResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
