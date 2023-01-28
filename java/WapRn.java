package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WapRn extends Message {
  public static final Integer DEFAULT_FRSRN;
  
  public static final Integer DEFAULT_PBRN;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer frsrn;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pbrn;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FRSRN = integer;
    DEFAULT_PBRN = integer;
  }
  
  public WapRn(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.frsrn;
      if (integer1 == null) {
        this.frsrn = DEFAULT_FRSRN;
      } else {
        this.frsrn = integer1;
      } 
      integer = paramBuilder.pbrn;
      if (integer == null) {
        this.pbrn = DEFAULT_PBRN;
      } else {
        this.pbrn = integer;
      } 
    } else {
      this.frsrn = ((Builder)integer).frsrn;
      this.pbrn = ((Builder)integer).pbrn;
    } 
  }
  
  public WapRn(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WapRn> {
    public Integer frsrn;
    
    public Integer pbrn;
    
    public Builder() {}
    
    public Builder(WapRn param1WapRn) {
      super(param1WapRn);
      if (param1WapRn == null)
        return; 
      this.frsrn = param1WapRn.frsrn;
      this.pbrn = param1WapRn.pbrn;
    }
    
    public WapRn build(boolean param1Boolean) {
      return new WapRn(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
