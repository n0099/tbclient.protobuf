package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Terminal extends Message {
  public static final Integer DEFAULT_CLIENT;
  
  public static final Integer DEFAULT_PC;
  
  public static final Integer DEFAULT_WAP;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer client;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pc;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer wap;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PC = integer;
    DEFAULT_WAP = integer;
    DEFAULT_CLIENT = integer;
  }
  
  public Terminal(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.pc;
      if (integer1 == null) {
        this.pc = DEFAULT_PC;
      } else {
        this.pc = integer1;
      } 
      integer1 = paramBuilder.wap;
      if (integer1 == null) {
        this.wap = DEFAULT_WAP;
      } else {
        this.wap = integer1;
      } 
      integer = paramBuilder.client;
      if (integer == null) {
        this.client = DEFAULT_CLIENT;
      } else {
        this.client = integer;
      } 
    } else {
      this.pc = ((Builder)integer).pc;
      this.wap = ((Builder)integer).wap;
      this.client = ((Builder)integer).client;
    } 
  }
  
  public Terminal(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Terminal> {
    public Integer client;
    
    public Integer pc;
    
    public Integer wap;
    
    public Builder() {}
    
    public Builder(Terminal param1Terminal) {
      super(param1Terminal);
      if (param1Terminal == null)
        return; 
      this.pc = param1Terminal.pc;
      this.wap = param1Terminal.wap;
      this.client = param1Terminal.client;
    }
    
    public Terminal build(boolean param1Boolean) {
      return new Terminal(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
