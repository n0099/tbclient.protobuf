package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Ecom extends Message {
  public static final Integer DEFAULT_IS_SELLER = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_seller;
  
  public Ecom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_seller;
      if (integer == null) {
        this.is_seller = DEFAULT_IS_SELLER;
      } else {
        this.is_seller = integer;
      } 
    } else {
      this.is_seller = ((Builder)integer).is_seller;
    } 
  }
  
  public Ecom(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Ecom> {
    public Integer is_seller;
    
    public Builder() {}
    
    public Builder(Ecom param1Ecom) {
      super(param1Ecom);
      if (param1Ecom == null)
        return; 
      this.is_seller = param1Ecom.is_seller;
    }
    
    public Ecom build(boolean param1Boolean) {
      return new Ecom(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
