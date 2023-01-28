package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LinkInfo extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String type;
  
  public LinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
    } else {
      this.desc = ((Builder)str).desc;
      this.link = ((Builder)str).link;
      this.type = ((Builder)str).type;
    } 
  }
  
  public LinkInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LinkInfo> {
    public String desc;
    
    public String link;
    
    public String type;
    
    public Builder() {}
    
    public Builder(LinkInfo param1LinkInfo) {
      super(param1LinkInfo);
      if (param1LinkInfo == null)
        return; 
      this.desc = param1LinkInfo.desc;
      this.link = param1LinkInfo.link;
      this.type = param1LinkInfo.type;
    }
    
    public LinkInfo build(boolean param1Boolean) {
      return new LinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
