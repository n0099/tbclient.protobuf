package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CPayType extends Message {
  public static final Integer DEFAULT_PAY_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pay_type;
  
  public CPayType(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.pay_type;
      if (integer == null) {
        this.pay_type = DEFAULT_PAY_TYPE;
      } else {
        this.pay_type = integer;
      } 
    } else {
      this.pay_type = ((Builder)integer).pay_type;
    } 
  }
  
  public CPayType(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CPayType> {
    public Integer pay_type;
    
    public Builder() {}
    
    public Builder(CPayType param1CPayType) {
      super(param1CPayType);
      if (param1CPayType == null)
        return; 
      this.pay_type = param1CPayType.pay_type;
    }
    
    public CPayType build(boolean param1Boolean) {
      return new CPayType(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
