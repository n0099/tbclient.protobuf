package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Ticket extends Message {
  public static final Integer DEFAULT_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public Ticket(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.url = ((Builder)str).url;
    } 
  }
  
  public Ticket(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Ticket> {
    public Integer time;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Ticket param1Ticket) {
      super(param1Ticket);
      if (param1Ticket == null)
        return; 
      this.time = param1Ticket.time;
      this.url = param1Ticket.url;
    }
    
    public Ticket build(boolean param1Boolean) {
      return new Ticket(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
