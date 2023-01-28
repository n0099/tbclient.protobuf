package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Bottle extends Message {
  public static final Integer DEFAULT_HAS_ENTER_DISPLAY = Integer.valueOf(0);
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_enter_display;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  public Bottle(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_enter_display;
      if (integer == null) {
        this.has_enter_display = DEFAULT_HAS_ENTER_DISPLAY;
      } else {
        this.has_enter_display = integer;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.has_enter_display = ((Builder)long_).has_enter_display;
      this.tid = ((Builder)long_).tid;
    } 
  }
  
  public Bottle(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Bottle> {
    public Integer has_enter_display;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(Bottle param1Bottle) {
      super(param1Bottle);
      if (param1Bottle == null)
        return; 
      this.has_enter_display = param1Bottle.has_enter_display;
      this.tid = param1Bottle.tid;
    }
    
    public Bottle build(boolean param1Boolean) {
      return new Bottle(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
