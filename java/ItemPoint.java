package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemPoint extends Message {
  public static final Double DEFAULT_POINT = Double.valueOf(0.0D);
  
  public static final String DEFAULT_TIME_INTVAL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double point;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time_intval;
  
  public ItemPoint(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str = paramBuilder.time_intval;
      if (str == null) {
        this.time_intval = "";
      } else {
        this.time_intval = str;
      } 
      double_ = paramBuilder.point;
      if (double_ == null) {
        this.point = DEFAULT_POINT;
      } else {
        this.point = double_;
      } 
    } else {
      this.time_intval = ((Builder)double_).time_intval;
      this.point = ((Builder)double_).point;
    } 
  }
  
  public ItemPoint(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemPoint> {
    public Double point;
    
    public String time_intval;
    
    public Builder() {}
    
    public Builder(ItemPoint param1ItemPoint) {
      super(param1ItemPoint);
      if (param1ItemPoint == null)
        return; 
      this.time_intval = param1ItemPoint.time_intval;
      this.point = param1ItemPoint.point;
    }
    
    public ItemPoint build(boolean param1Boolean) {
      return new ItemPoint(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
