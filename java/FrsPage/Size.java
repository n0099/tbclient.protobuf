package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Size extends Message {
  public static final Integer DEFAULT_HEIGHT;
  
  public static final Integer DEFAULT_WIDTH;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WIDTH = integer;
    DEFAULT_HEIGHT = integer;
  }
  
  public Size(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.width;
      if (integer1 == null) {
        this.width = DEFAULT_WIDTH;
      } else {
        this.width = integer1;
      } 
      integer = paramBuilder.height;
      if (integer == null) {
        this.height = DEFAULT_HEIGHT;
      } else {
        this.height = integer;
      } 
    } else {
      this.width = ((Builder)integer).width;
      this.height = ((Builder)integer).height;
    } 
  }
  
  public Size(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Size> {
    public Integer height;
    
    public Integer width;
    
    public Builder() {}
    
    public Builder(Size param1Size) {
      super(param1Size);
      if (param1Size == null)
        return; 
      this.width = param1Size.width;
      this.height = param1Size.height;
    }
    
    public Size build(boolean param1Boolean) {
      return new Size(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
