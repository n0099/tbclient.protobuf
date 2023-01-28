package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Calendar extends Message {
  public static final Integer DEFAULT_D;
  
  public static final Integer DEFAULT_RANK;
  
  public static final Integer DEFAULT_SIGN_TYPE;
  
  public static final String DEFAULT_T = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer d;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer sign_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String t;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_D = integer;
    DEFAULT_RANK = integer;
    DEFAULT_SIGN_TYPE = integer;
  }
  
  public Calendar(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.d;
      if (integer2 == null) {
        this.d = DEFAULT_D;
      } else {
        this.d = integer2;
      } 
      String str = paramBuilder.t;
      if (str == null) {
        this.t = "";
      } else {
        this.t = str;
      } 
      Integer integer1 = paramBuilder.rank;
      if (integer1 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer1;
      } 
      integer = paramBuilder.sign_type;
      if (integer == null) {
        this.sign_type = DEFAULT_SIGN_TYPE;
      } else {
        this.sign_type = integer;
      } 
    } else {
      this.d = ((Builder)integer).d;
      this.t = ((Builder)integer).t;
      this.rank = ((Builder)integer).rank;
      this.sign_type = ((Builder)integer).sign_type;
    } 
  }
  
  public Calendar(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Calendar> {
    public Integer d;
    
    public Integer rank;
    
    public Integer sign_type;
    
    public String t;
    
    public Builder() {}
    
    public Builder(Calendar param1Calendar) {
      super(param1Calendar);
      if (param1Calendar == null)
        return; 
      this.d = param1Calendar.d;
      this.t = param1Calendar.t;
      this.rank = param1Calendar.rank;
      this.sign_type = param1Calendar.sign_type;
    }
    
    public Calendar build(boolean param1Boolean) {
      return new Calendar(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
