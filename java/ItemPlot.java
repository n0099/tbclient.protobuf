package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemPlot extends Message {
  public static final Integer DEFAULT_LEVEL;
  
  public static final Integer DEFAULT_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LEVEL = integer;
    DEFAULT_NUM = integer;
  }
  
  public ItemPlot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.level;
      if (integer1 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer1;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.level = ((Builder)integer).level;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public ItemPlot(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemPlot> {
    public Integer level;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(ItemPlot param1ItemPlot) {
      super(param1ItemPlot);
      if (param1ItemPlot == null)
        return; 
      this.level = param1ItemPlot.level;
      this.num = param1ItemPlot.num;
    }
    
    public ItemPlot build(boolean param1Boolean) {
      return new ItemPlot(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
