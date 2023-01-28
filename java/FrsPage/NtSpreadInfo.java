package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NtSpreadInfo extends Message {
  public static final String DEFAULT_LINK_URL = "";
  
  public static final List<String> DEFAULT_PICS = Collections.emptyList();
  
  public static final Integer DEFAULT_POSITION = Integer.valueOf(0);
  
  public static final String DEFAULT_PUBLISH_DATE = "";
  
  public static final String DEFAULT_TIPS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TYPE = "";
  
  public static final String DEFAULT_USER_AVATAR = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> pics;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer position;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String publish_date;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  public NtSpreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.user_avatar;
      if (str2 == null) {
        this.user_avatar = "";
      } else {
        this.user_avatar = str2;
      } 
      str2 = paramBuilder.tips;
      if (str2 == null) {
        this.tips = "";
      } else {
        this.tips = str2;
      } 
      str2 = paramBuilder.type;
      if (str2 == null) {
        this.type = "";
      } else {
        this.type = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      List<String> list = paramBuilder.pics;
      if (list == null) {
        this.pics = DEFAULT_PICS;
      } else {
        this.pics = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.link_url;
      if (str1 == null) {
        this.link_url = "";
      } else {
        this.link_url = str1;
      } 
      Integer integer = paramBuilder.position;
      if (integer == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer;
      } 
      str = paramBuilder.publish_date;
      if (str == null) {
        this.publish_date = "";
      } else {
        this.publish_date = str;
      } 
    } else {
      this.user_name = ((Builder)str).user_name;
      this.user_avatar = ((Builder)str).user_avatar;
      this.tips = ((Builder)str).tips;
      this.type = ((Builder)str).type;
      this.title = ((Builder)str).title;
      this.pics = Message.immutableCopyOf(((Builder)str).pics);
      this.link_url = ((Builder)str).link_url;
      this.position = ((Builder)str).position;
      this.publish_date = ((Builder)str).publish_date;
    } 
  }
  
  public NtSpreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NtSpreadInfo> {
    public String link_url;
    
    public List<String> pics;
    
    public Integer position;
    
    public String publish_date;
    
    public String tips;
    
    public String title;
    
    public String type;
    
    public String user_avatar;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(NtSpreadInfo param1NtSpreadInfo) {
      super(param1NtSpreadInfo);
      if (param1NtSpreadInfo == null)
        return; 
      this.user_name = param1NtSpreadInfo.user_name;
      this.user_avatar = param1NtSpreadInfo.user_avatar;
      this.tips = param1NtSpreadInfo.tips;
      this.type = param1NtSpreadInfo.type;
      this.title = param1NtSpreadInfo.title;
      this.pics = Message.copyOf(param1NtSpreadInfo.pics);
      this.link_url = param1NtSpreadInfo.link_url;
      this.position = param1NtSpreadInfo.position;
      this.publish_date = param1NtSpreadInfo.publish_date;
    }
    
    public NtSpreadInfo build(boolean param1Boolean) {
      return new NtSpreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
