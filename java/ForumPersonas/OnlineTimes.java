package tbclient.ForumPersonas;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OnlineTimes extends Message {
  public static final String DEFAULT_END = "";
  
  public static final Integer DEFAULT_SEQ = Integer.valueOf(0);
  
  public static final String DEFAULT_START = "";
  
  public static final String DEFAULT_TIME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String end;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer seq;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String start;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time;
  
  public OnlineTimes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.time;
      if (str == null) {
        this.time = "";
      } else {
        this.time = str;
      } 
      str = paramBuilder.start;
      if (str == null) {
        this.start = "";
      } else {
        this.start = str;
      } 
      str = paramBuilder.end;
      if (str == null) {
        this.end = "";
      } else {
        this.end = str;
      } 
      integer = paramBuilder.seq;
      if (integer == null) {
        this.seq = DEFAULT_SEQ;
      } else {
        this.seq = integer;
      } 
    } else {
      this.time = ((Builder)integer).time;
      this.start = ((Builder)integer).start;
      this.end = ((Builder)integer).end;
      this.seq = ((Builder)integer).seq;
    } 
  }
  
  public OnlineTimes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<OnlineTimes> {
    public String end;
    
    public Integer seq;
    
    public String start;
    
    public String time;
    
    public Builder() {}
    
    public Builder(OnlineTimes param1OnlineTimes) {
      super(param1OnlineTimes);
      if (param1OnlineTimes == null)
        return; 
      this.time = param1OnlineTimes.time;
      this.start = param1OnlineTimes.start;
      this.end = param1OnlineTimes.end;
      this.seq = param1OnlineTimes.seq;
    }
    
    public OnlineTimes build(boolean param1Boolean) {
      return new OnlineTimes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
