package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Namoaixud extends Message {
  public static final Integer DEFAULT_IS_END;
  
  public static final Integer DEFAULT_TOTAL_CASH;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_end;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total_cash;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_CASH = integer;
    DEFAULT_IS_END = integer;
  }
  
  public Namoaixud(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.total_cash;
      if (integer1 == null) {
        this.total_cash = DEFAULT_TOTAL_CASH;
      } else {
        this.total_cash = integer1;
      } 
      integer = paramBuilder.is_end;
      if (integer == null) {
        this.is_end = DEFAULT_IS_END;
      } else {
        this.is_end = integer;
      } 
    } else {
      this.total_cash = ((Builder)integer).total_cash;
      this.is_end = ((Builder)integer).is_end;
    } 
  }
  
  public Namoaixud(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Namoaixud> {
    public Integer is_end;
    
    public Integer total_cash;
    
    public Builder() {}
    
    public Builder(Namoaixud param1Namoaixud) {
      super(param1Namoaixud);
      if (param1Namoaixud == null)
        return; 
      this.total_cash = param1Namoaixud.total_cash;
      this.is_end = param1Namoaixud.is_end;
    }
    
    public Namoaixud build(boolean param1Boolean) {
      return new Namoaixud(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
