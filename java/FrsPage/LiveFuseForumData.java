package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LiveFuseForumData extends Message {
  public static final String DEFAULT_BJIMG_DARK_BIG = "";
  
  public static final String DEFAULT_BJIMG_DARK_SMALL = "";
  
  public static final String DEFAULT_BJIMG_LIGHT_BIG = "";
  
  public static final String DEFAULT_BJIMG_LIGHT_SMALL = "";
  
  public static final List<String> DEFAULT_HEAD_IMG = Collections.emptyList();
  
  public static final Integer DEFAULT_HEAD_IMG_STYLE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_ONLINE_USERS = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<String> DEFAULT_TITLE = Collections.emptyList();
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_YYEXT = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String bjimg_dark_big;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String bjimg_dark_small;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String bjimg_light_big;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String bjimg_light_small;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> head_img;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer head_img_style;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String online_users;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> title;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String yyext;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_HEAD_IMG_STYLE = integer;
  }
  
  public LiveFuseForumData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str3 = paramBuilder.online_users;
      if (str3 == null) {
        this.online_users = "";
      } else {
        this.online_users = str3;
      } 
      List<String> list = paramBuilder.head_img;
      if (list == null) {
        this.head_img = DEFAULT_HEAD_IMG;
      } else {
        this.head_img = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.title;
      if (list == null) {
        this.title = DEFAULT_TITLE;
      } else {
        this.title = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.schema;
      if (str2 == null) {
        this.schema = "";
      } else {
        this.schema = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      String str1 = paramBuilder.yyext;
      if (str1 == null) {
        this.yyext = "";
      } else {
        this.yyext = str1;
      } 
      str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.bjimg_dark_big;
      if (str1 == null) {
        this.bjimg_dark_big = "";
      } else {
        this.bjimg_dark_big = str1;
      } 
      str1 = paramBuilder.bjimg_light_big;
      if (str1 == null) {
        this.bjimg_light_big = "";
      } else {
        this.bjimg_light_big = str1;
      } 
      str1 = paramBuilder.bjimg_dark_small;
      if (str1 == null) {
        this.bjimg_dark_small = "";
      } else {
        this.bjimg_dark_small = str1;
      } 
      str1 = paramBuilder.bjimg_light_small;
      if (str1 == null) {
        this.bjimg_light_small = "";
      } else {
        this.bjimg_light_small = str1;
      } 
      integer = paramBuilder.head_img_style;
      if (integer == null) {
        this.head_img_style = DEFAULT_HEAD_IMG_STYLE;
      } else {
        this.head_img_style = integer;
      } 
    } else {
      this.online_users = ((Builder)integer).online_users;
      this.head_img = Message.immutableCopyOf(((Builder)integer).head_img);
      this.title = Message.immutableCopyOf(((Builder)integer).title);
      this.schema = ((Builder)integer).schema;
      this.type = ((Builder)integer).type;
      this.yyext = ((Builder)integer).yyext;
      this.icon_url = ((Builder)integer).icon_url;
      this.bjimg_dark_big = ((Builder)integer).bjimg_dark_big;
      this.bjimg_light_big = ((Builder)integer).bjimg_light_big;
      this.bjimg_dark_small = ((Builder)integer).bjimg_dark_small;
      this.bjimg_light_small = ((Builder)integer).bjimg_light_small;
      this.head_img_style = ((Builder)integer).head_img_style;
    } 
  }
  
  public LiveFuseForumData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LiveFuseForumData> {
    public String bjimg_dark_big;
    
    public String bjimg_dark_small;
    
    public String bjimg_light_big;
    
    public String bjimg_light_small;
    
    public List<String> head_img;
    
    public Integer head_img_style;
    
    public String icon_url;
    
    public String online_users;
    
    public String schema;
    
    public List<String> title;
    
    public Integer type;
    
    public String yyext;
    
    public Builder() {}
    
    public Builder(LiveFuseForumData param1LiveFuseForumData) {
      super(param1LiveFuseForumData);
      if (param1LiveFuseForumData == null)
        return; 
      this.online_users = param1LiveFuseForumData.online_users;
      this.head_img = Message.copyOf(param1LiveFuseForumData.head_img);
      this.title = Message.copyOf(param1LiveFuseForumData.title);
      this.schema = param1LiveFuseForumData.schema;
      this.type = param1LiveFuseForumData.type;
      this.yyext = param1LiveFuseForumData.yyext;
      this.icon_url = param1LiveFuseForumData.icon_url;
      this.bjimg_dark_big = param1LiveFuseForumData.bjimg_dark_big;
      this.bjimg_light_big = param1LiveFuseForumData.bjimg_light_big;
      this.bjimg_dark_small = param1LiveFuseForumData.bjimg_dark_small;
      this.bjimg_light_small = param1LiveFuseForumData.bjimg_light_small;
      this.head_img_style = param1LiveFuseForumData.head_img_style;
    }
    
    public LiveFuseForumData build(boolean param1Boolean) {
      return new LiveFuseForumData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
