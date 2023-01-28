package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostPrefix extends Message {
  public static final Integer DEFAULT_MODE = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TIME = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer mode;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String type;
  
  public PostPrefix(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.mode;
      if (integer == null) {
        this.mode = DEFAULT_MODE;
      } else {
        this.mode = integer;
      } 
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str = paramBuilder.time;
      if (str == null) {
        this.time = "";
      } else {
        this.time = str;
      } 
    } else {
      this.mode = ((Builder)str).mode;
      this.text = ((Builder)str).text;
      this.type = ((Builder)str).type;
      this.time = ((Builder)str).time;
    } 
  }
  
  public PostPrefix(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostPrefix> {
    public Integer mode;
    
    public String text;
    
    public String time;
    
    public String type;
    
    public Builder() {}
    
    public Builder(PostPrefix param1PostPrefix) {
      super(param1PostPrefix);
      if (param1PostPrefix == null)
        return; 
      this.mode = param1PostPrefix.mode;
      this.text = param1PostPrefix.text;
      this.type = param1PostPrefix.type;
      this.time = param1PostPrefix.time;
    }
    
    public PostPrefix build(boolean param1Boolean) {
      return new PostPrefix(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
