package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DoDailyTaskResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public DoDailyTaskResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public DoDailyTaskResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DoDailyTaskResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DoDailyTaskResIdl param1DoDailyTaskResIdl) {
      super(param1DoDailyTaskResIdl);
      if (param1DoDailyTaskResIdl == null)
        return; 
      this.error = param1DoDailyTaskResIdl.error;
      this.data = param1DoDailyTaskResIdl.data;
    }
    
    public DoDailyTaskResIdl build(boolean param1Boolean) {
      return new DoDailyTaskResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
