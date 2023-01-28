package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SkinInfo extends Message {
  public static final String DEFAULT_MONITOR_ID = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_SKIN = "";
  
  public static final String DEFAULT_SKIN_SIZE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String monitor_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String skin;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String skin_size;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public SkinInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.skin;
      if (str1 == null) {
        this.skin = "";
      } else {
        this.skin = str1;
      } 
      str1 = paramBuilder.skin_size;
      if (str1 == null) {
        this.skin_size = "";
      } else {
        this.skin_size = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.obj_id;
      if (str1 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str1;
      } 
      str = paramBuilder.monitor_id;
      if (str == null) {
        this.monitor_id = "";
      } else {
        this.monitor_id = str;
      } 
    } else {
      this.skin = ((Builder)str).skin;
      this.skin_size = ((Builder)str).skin_size;
      this.url = ((Builder)str).url;
      this.obj_id = ((Builder)str).obj_id;
      this.monitor_id = ((Builder)str).monitor_id;
    } 
  }
  
  public SkinInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SkinInfo> {
    public String monitor_id;
    
    public String obj_id;
    
    public String skin;
    
    public String skin_size;
    
    public String url;
    
    public Builder() {}
    
    public Builder(SkinInfo param1SkinInfo) {
      super(param1SkinInfo);
      if (param1SkinInfo == null)
        return; 
      this.skin = param1SkinInfo.skin;
      this.skin_size = param1SkinInfo.skin_size;
      this.url = param1SkinInfo.url;
      this.obj_id = param1SkinInfo.obj_id;
      this.monitor_id = param1SkinInfo.monitor_id;
    }
    
    public SkinInfo build(boolean param1Boolean) {
      return new SkinInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
