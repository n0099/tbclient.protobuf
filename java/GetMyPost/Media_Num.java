package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Media_Num extends Message {
  public static final Integer DEFAULT_PIC = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pic;
  
  public Media_Num(Builder paramBuilder, boolean paramBoolean) {
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
  
  public Media_Num(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Media_Num> {
    public Integer pic;
    
    public Builder() {}
    
    public Builder(Media_Num param1Media_Num) {
      super(param1Media_Num);
      if (param1Media_Num == null)
        return; 
      this.pic = param1Media_Num.pic;
    }
    
    public Media_Num build(boolean param1Boolean) {
      return new Media_Num(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
