package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipShowInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VIP_ICON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String vip_icon;
  
  public VipShowInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.vip_icon;
      if (str1 == null) {
        this.vip_icon = "";
      } else {
        this.vip_icon = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.vip_icon = ((Builder)str).vip_icon;
      this.content = ((Builder)str).content;
      this.link = ((Builder)str).link;
      this.title = ((Builder)str).title;
    } 
  }
  
  public VipShowInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipShowInfo> {
    public String content;
    
    public String link;
    
    public String title;
    
    public String vip_icon;
    
    public Builder() {}
    
    public Builder(VipShowInfo param1VipShowInfo) {
      super(param1VipShowInfo);
      if (param1VipShowInfo == null)
        return; 
      this.vip_icon = param1VipShowInfo.vip_icon;
      this.content = param1VipShowInfo.content;
      this.link = param1VipShowInfo.link;
      this.title = param1VipShowInfo.title;
    }
    
    public VipShowInfo build(boolean param1Boolean) {
      return new VipShowInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
