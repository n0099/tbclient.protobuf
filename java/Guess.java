package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Guess extends Message {
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public Guess(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.url = ((Builder)str).url;
    } 
  }
  
  public Guess(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Guess> {
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Guess param1Guess) {
      super(param1Guess);
      if (param1Guess == null)
        return; 
      this.title = param1Guess.title;
      this.url = param1Guess.url;
    }
    
    public Guess build(boolean param1Boolean) {
      return new Guess(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
