package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Good extends Message {
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer num;
  
  public Good(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.num = ((Builder)integer).num;
    } 
  }
  
  public Good(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Good> {
    public Integer num;
    
    public Builder() {}
    
    public Builder(Good param1Good) {
      super(param1Good);
      if (param1Good == null)
        return; 
      this.num = param1Good.num;
    }
    
    public Good build(boolean param1Boolean) {
      return new Good(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
