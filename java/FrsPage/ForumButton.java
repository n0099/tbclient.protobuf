package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumButton extends Message {
  public static final Integer DEFAULT_IS_BLUEV = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_blueV;
  
  public ForumButton(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_blueV;
      if (integer == null) {
        this.is_blueV = DEFAULT_IS_BLUEV;
      } else {
        this.is_blueV = integer;
      } 
    } else {
      this.is_blueV = ((Builder)integer).is_blueV;
    } 
  }
  
  public ForumButton(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumButton> {
    public Integer is_blueV;
    
    public Builder() {}
    
    public Builder(ForumButton param1ForumButton) {
      super(param1ForumButton);
      if (param1ForumButton == null)
        return; 
      this.is_blueV = param1ForumButton.is_blueV;
    }
    
    public ForumButton build(boolean param1Boolean) {
      return new ForumButton(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
