package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MediaNum extends Message {
  public static final Integer DEFAULT_PIC = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pic;
  
  public MediaNum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.pic;
      if (integer == null) {
        this.pic = DEFAULT_PIC;
      } else {
        this.pic = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
    } 
  }
  
  public MediaNum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MediaNum> {
    public Integer pic;
    
    public Builder() {}
    
    public Builder(MediaNum param1MediaNum) {
      super(param1MediaNum);
      if (param1MediaNum == null)
        return; 
      this.pic = param1MediaNum.pic;
    }
    
    public MediaNum build(boolean param1Boolean) {
      return new MediaNum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
