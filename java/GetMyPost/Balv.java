package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Balv extends Message {
  public static final Integer DEFAULT_DAYS_TOFREE;
  
  public static final Integer DEFAULT_IS_BLACK;
  
  public static final Integer DEFAULT_IS_BLOCK;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer days_tofree;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_black;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_block;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BLACK = integer;
    DEFAULT_IS_BLOCK = integer;
    DEFAULT_DAYS_TOFREE = integer;
  }
  
  public Balv(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_black;
      if (integer1 == null) {
        this.is_black = DEFAULT_IS_BLACK;
      } else {
        this.is_black = integer1;
      } 
      integer1 = paramBuilder.is_block;
      if (integer1 == null) {
        this.is_block = DEFAULT_IS_BLOCK;
      } else {
        this.is_block = integer1;
      } 
      integer = paramBuilder.days_tofree;
      if (integer == null) {
        this.days_tofree = DEFAULT_DAYS_TOFREE;
      } else {
        this.days_tofree = integer;
      } 
    } else {
      this.is_black = ((Builder)integer).is_black;
      this.is_block = ((Builder)integer).is_block;
      this.days_tofree = ((Builder)integer).days_tofree;
    } 
  }
  
  public Balv(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Balv> {
    public Integer days_tofree;
    
    public Integer is_black;
    
    public Integer is_block;
    
    public Builder() {}
    
    public Builder(Balv param1Balv) {
      super(param1Balv);
      if (param1Balv == null)
        return; 
      this.is_black = param1Balv.is_black;
      this.is_block = param1Balv.is_block;
      this.days_tofree = param1Balv.days_tofree;
    }
    
    public Balv build(boolean param1Boolean) {
      return new Balv(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
