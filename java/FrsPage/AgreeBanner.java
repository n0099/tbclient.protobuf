package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleUser;

public final class AgreeBanner extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final List<SimpleUser> DEFAULT_TOP_AGREE_USER = Collections.emptyList();
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SimpleUser> top_agree_user;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public AgreeBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SimpleUser> list;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      list = paramBuilder.top_agree_user;
      if (list == null) {
        this.top_agree_user = DEFAULT_TOP_AGREE_USER;
      } else {
        this.top_agree_user = Message.immutableCopyOf(list);
      } 
    } else {
      this.text = ((Builder)list).text;
      this.icon_url = ((Builder)list).icon_url;
      this.url = ((Builder)list).url;
      this.top_agree_user = Message.immutableCopyOf(((Builder)list).top_agree_user);
    } 
  }
  
  public AgreeBanner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AgreeBanner> {
    public String icon_url;
    
    public String text;
    
    public List<SimpleUser> top_agree_user;
    
    public String url;
    
    public Builder() {}
    
    public Builder(AgreeBanner param1AgreeBanner) {
      super(param1AgreeBanner);
      if (param1AgreeBanner == null)
        return; 
      this.text = param1AgreeBanner.text;
      this.icon_url = param1AgreeBanner.icon_url;
      this.url = param1AgreeBanner.url;
      this.top_agree_user = Message.copyOf(param1AgreeBanner.top_agree_user);
    }
    
    public AgreeBanner build(boolean param1Boolean) {
      return new AgreeBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
