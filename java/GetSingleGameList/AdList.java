package tbclient.GetSingleGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AdList extends Message {
  public static final String DEFAULT_AD_LINK_ANDROID = "";
  
  public static final String DEFAULT_AD_LINK_IOS = "";
  
  public static final String DEFAULT_AD_LINK_WEBVIEW = "";
  
  public static final List<String> DEFAULT_AD_PIC = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String ad_link_android;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_link_ios;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ad_link_webview;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> ad_pic;
  
  public AdList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.ad_link_android;
      if (str == null) {
        this.ad_link_android = "";
      } else {
        this.ad_link_android = str;
      } 
      str = paramBuilder.ad_link_webview;
      if (str == null) {
        this.ad_link_webview = "";
      } else {
        this.ad_link_webview = str;
      } 
      str = paramBuilder.ad_link_ios;
      if (str == null) {
        this.ad_link_ios = "";
      } else {
        this.ad_link_ios = str;
      } 
      list = paramBuilder.ad_pic;
      if (list == null) {
        this.ad_pic = DEFAULT_AD_PIC;
      } else {
        this.ad_pic = Message.immutableCopyOf(list);
      } 
    } else {
      this.ad_link_android = ((Builder)list).ad_link_android;
      this.ad_link_webview = ((Builder)list).ad_link_webview;
      this.ad_link_ios = ((Builder)list).ad_link_ios;
      this.ad_pic = Message.immutableCopyOf(((Builder)list).ad_pic);
    } 
  }
  
  public AdList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdList> {
    public String ad_link_android;
    
    public String ad_link_ios;
    
    public String ad_link_webview;
    
    public List<String> ad_pic;
    
    public Builder() {}
    
    public Builder(AdList param1AdList) {
      super(param1AdList);
      if (param1AdList == null)
        return; 
      this.ad_link_android = param1AdList.ad_link_android;
      this.ad_link_webview = param1AdList.ad_link_webview;
      this.ad_link_ios = param1AdList.ad_link_ios;
      this.ad_pic = Message.copyOf(param1AdList.ad_pic);
    }
    
    public AdList build(boolean param1Boolean) {
      return new AdList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
