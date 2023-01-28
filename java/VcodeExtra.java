package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VcodeExtra extends Message {
  public static final String DEFAULT_ENDPOINT = "";
  
  public static final String DEFAULT_SLIDEENDPOINT = "";
  
  public static final String DEFAULT_SLIDEIMG = "";
  
  public static final String DEFAULT_SUCCESSIMG = "";
  
  public static final String DEFAULT_TEXTIMG = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String endpoint;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String slideendpoint;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String slideimg;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String successimg;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String textimg;
  
  public VcodeExtra(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.textimg;
      if (str1 == null) {
        this.textimg = "";
      } else {
        this.textimg = str1;
      } 
      str1 = paramBuilder.slideimg;
      if (str1 == null) {
        this.slideimg = "";
      } else {
        this.slideimg = str1;
      } 
      str1 = paramBuilder.endpoint;
      if (str1 == null) {
        this.endpoint = "";
      } else {
        this.endpoint = str1;
      } 
      str1 = paramBuilder.successimg;
      if (str1 == null) {
        this.successimg = "";
      } else {
        this.successimg = str1;
      } 
      str = paramBuilder.slideendpoint;
      if (str == null) {
        this.slideendpoint = "";
      } else {
        this.slideendpoint = str;
      } 
    } else {
      this.textimg = ((Builder)str).textimg;
      this.slideimg = ((Builder)str).slideimg;
      this.endpoint = ((Builder)str).endpoint;
      this.successimg = ((Builder)str).successimg;
      this.slideendpoint = ((Builder)str).slideendpoint;
    } 
  }
  
  public VcodeExtra(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VcodeExtra> {
    public String endpoint;
    
    public String slideendpoint;
    
    public String slideimg;
    
    public String successimg;
    
    public String textimg;
    
    public Builder() {}
    
    public Builder(VcodeExtra param1VcodeExtra) {
      super(param1VcodeExtra);
      if (param1VcodeExtra == null)
        return; 
      this.textimg = param1VcodeExtra.textimg;
      this.slideimg = param1VcodeExtra.slideimg;
      this.endpoint = param1VcodeExtra.endpoint;
      this.successimg = param1VcodeExtra.successimg;
      this.slideendpoint = param1VcodeExtra.slideendpoint;
    }
    
    public VcodeExtra build(boolean param1Boolean) {
      return new VcodeExtra(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
