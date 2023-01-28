package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_RIGHT = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer has_right;
  
  @ProtoField(tag = 2)
  public final Toast toast;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_right;
      if (integer == null) {
        this.has_right = DEFAULT_HAS_RIGHT;
      } else {
        this.has_right = integer;
      } 
      this.toast = paramBuilder.toast;
    } else {
      this.has_right = paramBuilder.has_right;
      this.toast = paramBuilder.toast;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer has_right;
    
    public Toast toast;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.has_right = param1DataRes.has_right;
      this.toast = param1DataRes.toast;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
