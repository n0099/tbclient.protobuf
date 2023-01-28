package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TWGuideDesc extends Message {
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_ORDER = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer order;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TWGuideDesc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.order;
      if (integer == null) {
        this.order = DEFAULT_ORDER;
      } else {
        this.order = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.order = ((Builder)str).order;
      this.title = ((Builder)str).title;
      this.link = ((Builder)str).link;
    } 
  }
  
  public TWGuideDesc(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TWGuideDesc> {
    public String link;
    
    public Integer order;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TWGuideDesc param1TWGuideDesc) {
      super(param1TWGuideDesc);
      if (param1TWGuideDesc == null)
        return; 
      this.order = param1TWGuideDesc.order;
      this.title = param1TWGuideDesc.title;
      this.link = param1TWGuideDesc.link;
    }
    
    public TWGuideDesc build(boolean param1Boolean) {
      return new TWGuideDesc(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
