package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Discount extends Message {
  public static final Integer DEFAULT_REBATE;
  
  public static final Integer DEFAULT_RECHARGE;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rebate;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer recharge;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RECHARGE = integer;
    DEFAULT_REBATE = integer;
  }
  
  public Discount(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.recharge;
      if (integer1 == null) {
        this.recharge = DEFAULT_RECHARGE;
      } else {
        this.recharge = integer1;
      } 
      integer = paramBuilder.rebate;
      if (integer == null) {
        this.rebate = DEFAULT_REBATE;
      } else {
        this.rebate = integer;
      } 
    } else {
      this.recharge = ((Builder)integer).recharge;
      this.rebate = ((Builder)integer).rebate;
    } 
  }
  
  public Discount(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Discount> {
    public Integer rebate;
    
    public Integer recharge;
    
    public Builder() {}
    
    public Builder(Discount param1Discount) {
      super(param1Discount);
      if (param1Discount == null)
        return; 
      this.recharge = param1Discount.recharge;
      this.rebate = param1Discount.rebate;
    }
    
    public Discount build(boolean param1Boolean) {
      return new Discount(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
