package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignatureContent extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  public SignatureContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.text = ((Builder)str).text;
    } 
  }
  
  public SignatureContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SignatureContent> {
    public String text;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(SignatureContent param1SignatureContent) {
      super(param1SignatureContent);
      if (param1SignatureContent == null)
        return; 
      this.type = param1SignatureContent.type;
      this.text = param1SignatureContent.text;
    }
    
    public SignatureContent build(boolean param1Boolean) {
      return new SignatureContent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
