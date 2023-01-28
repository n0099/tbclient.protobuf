package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaLiveNotify extends Message {
  public static final String DEFAULT_NOTI_CONTENT = "";
  
  public static final String DEFAULT_NOTI_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String noti_content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String noti_url;
  
  public AlaLiveNotify(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.noti_content;
      if (str1 == null) {
        this.noti_content = "";
      } else {
        this.noti_content = str1;
      } 
      str = paramBuilder.noti_url;
      if (str == null) {
        this.noti_url = "";
      } else {
        this.noti_url = str;
      } 
    } else {
      this.noti_content = ((Builder)str).noti_content;
      this.noti_url = ((Builder)str).noti_url;
    } 
  }
  
  public AlaLiveNotify(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaLiveNotify> {
    public String noti_content;
    
    public String noti_url;
    
    public Builder() {}
    
    public Builder(AlaLiveNotify param1AlaLiveNotify) {
      super(param1AlaLiveNotify);
      if (param1AlaLiveNotify == null)
        return; 
      this.noti_content = param1AlaLiveNotify.noti_content;
      this.noti_url = param1AlaLiveNotify.noti_url;
    }
    
    public AlaLiveNotify build(boolean param1Boolean) {
      return new AlaLiveNotify(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
