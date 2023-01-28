package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HeadImgs extends Message {
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_COVER_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_APPID = "";
  
  public static final String DEFAULT_DOWNLOAD_APPNAME = "";
  
  public static final String DEFAULT_DOWNLOAD_DEVELOPER = "";
  
  public static final String DEFAULT_DOWNLOAD_IMG = "";
  
  public static final Integer DEFAULT_DOWNLOAD_IS_THIRDPAGE;
  
  public static final Integer DEFAULT_DOWNLOAD_ITEM_ID;
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_NAME = "";
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_SIZE = "";
  
  public static final String DEFAULT_DOWNLOAD_PRIVACY_POLICY = "";
  
  public static final String DEFAULT_DOWNLOAD_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_USER_POWER = "";
  
  public static final String DEFAULT_DOWNLOAD_VERSION = "";
  
  public static final Integer DEFAULT_HAS_SECOND_PAGE;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_PC_URL = "";
  
  public static final String DEFAULT_PLAY_URL = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SUBTITLE = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final List<VideoImageColor> DEFAULT_VIDEO_IMAGE_COLOR;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 26)
  public final CoverImageColor cover_image_color;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String cover_url;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String download_appid;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String download_appname;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String download_developer;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String download_img;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer download_is_thirdpage;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer download_item_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String download_package_name;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String download_package_size;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String download_privacy_policy;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String download_url;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String download_user_power;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String download_version;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer has_second_page;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pc_url;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String play_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String subtitle;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tag_name_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String tag_name_wh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 27)
  public final List<VideoImageColor> video_image_color;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_SECOND_PAGE = integer;
    DEFAULT_DOWNLOAD_IS_THIRDPAGE = integer;
    DEFAULT_DOWNLOAD_ITEM_ID = integer;
    DEFAULT_VIDEO_IMAGE_COLOR = Collections.emptyList();
  }
  
  public HeadImgs(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<VideoImageColor> list;
    if (paramBoolean == true) {
      String str4 = paramBuilder.img_url;
      if (str4 == null) {
        this.img_url = "";
      } else {
        this.img_url = str4;
      } 
      str4 = paramBuilder.pc_url;
      if (str4 == null) {
        this.pc_url = "";
      } else {
        this.pc_url = str4;
      } 
      str4 = paramBuilder.title;
      if (str4 == null) {
        this.title = "";
      } else {
        this.title = str4;
      } 
      str4 = paramBuilder.subtitle;
      if (str4 == null) {
        this.subtitle = "";
      } else {
        this.subtitle = str4;
      } 
      str4 = paramBuilder.btn_text;
      if (str4 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str4;
      } 
      str4 = paramBuilder.tag_name_url;
      if (str4 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str4;
      } 
      str4 = paramBuilder.tag_name_wh;
      if (str4 == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str4;
      } 
      str4 = paramBuilder.schema;
      if (str4 == null) {
        this.schema = "";
      } else {
        this.schema = str4;
      } 
      List<String> list1 = paramBuilder.third_statistics_url;
      if (list1 == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list1);
      } 
      Integer integer3 = paramBuilder.has_second_page;
      if (integer3 == null) {
        this.has_second_page = DEFAULT_HAS_SECOND_PAGE;
      } else {
        this.has_second_page = integer3;
      } 
      String str3 = paramBuilder.package_name;
      if (str3 == null) {
        this.package_name = "";
      } else {
        this.package_name = str3;
      } 
      Integer integer2 = paramBuilder.download_is_thirdpage;
      if (integer2 == null) {
        this.download_is_thirdpage = DEFAULT_DOWNLOAD_IS_THIRDPAGE;
      } else {
        this.download_is_thirdpage = integer2;
      } 
      String str2 = paramBuilder.download_appname;
      if (str2 == null) {
        this.download_appname = "";
      } else {
        this.download_appname = str2;
      } 
      str2 = paramBuilder.download_developer;
      if (str2 == null) {
        this.download_developer = "";
      } else {
        this.download_developer = str2;
      } 
      str2 = paramBuilder.download_package_size;
      if (str2 == null) {
        this.download_package_size = "";
      } else {
        this.download_package_size = str2;
      } 
      str2 = paramBuilder.download_url;
      if (str2 == null) {
        this.download_url = "";
      } else {
        this.download_url = str2;
      } 
      str2 = paramBuilder.download_img;
      if (str2 == null) {
        this.download_img = "";
      } else {
        this.download_img = str2;
      } 
      str2 = paramBuilder.download_version;
      if (str2 == null) {
        this.download_version = "";
      } else {
        this.download_version = str2;
      } 
      str2 = paramBuilder.download_user_power;
      if (str2 == null) {
        this.download_user_power = "";
      } else {
        this.download_user_power = str2;
      } 
      str2 = paramBuilder.download_privacy_policy;
      if (str2 == null) {
        this.download_privacy_policy = "";
      } else {
        this.download_privacy_policy = str2;
      } 
      str2 = paramBuilder.download_package_name;
      if (str2 == null) {
        this.download_package_name = "";
      } else {
        this.download_package_name = str2;
      } 
      Integer integer1 = paramBuilder.download_item_id;
      if (integer1 == null) {
        this.download_item_id = DEFAULT_DOWNLOAD_ITEM_ID;
      } else {
        this.download_item_id = integer1;
      } 
      String str1 = paramBuilder.download_appid;
      if (str1 == null) {
        this.download_appid = "";
      } else {
        this.download_appid = str1;
      } 
      str1 = paramBuilder.cover_url;
      if (str1 == null) {
        this.cover_url = "";
      } else {
        this.cover_url = str1;
      } 
      str1 = paramBuilder.play_url;
      if (str1 == null) {
        this.play_url = "";
      } else {
        this.play_url = str1;
      } 
      this.cover_image_color = paramBuilder.cover_image_color;
      list = paramBuilder.video_image_color;
      if (list == null) {
        this.video_image_color = DEFAULT_VIDEO_IMAGE_COLOR;
      } else {
        this.video_image_color = Message.immutableCopyOf(list);
      } 
    } else {
      this.img_url = ((Builder)list).img_url;
      this.pc_url = ((Builder)list).pc_url;
      this.title = ((Builder)list).title;
      this.subtitle = ((Builder)list).subtitle;
      this.btn_text = ((Builder)list).btn_text;
      this.tag_name_url = ((Builder)list).tag_name_url;
      this.tag_name_wh = ((Builder)list).tag_name_wh;
      this.schema = ((Builder)list).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)list).third_statistics_url);
      this.has_second_page = ((Builder)list).has_second_page;
      this.package_name = ((Builder)list).package_name;
      this.download_is_thirdpage = ((Builder)list).download_is_thirdpage;
      this.download_appname = ((Builder)list).download_appname;
      this.download_developer = ((Builder)list).download_developer;
      this.download_package_size = ((Builder)list).download_package_size;
      this.download_url = ((Builder)list).download_url;
      this.download_img = ((Builder)list).download_img;
      this.download_version = ((Builder)list).download_version;
      this.download_user_power = ((Builder)list).download_user_power;
      this.download_privacy_policy = ((Builder)list).download_privacy_policy;
      this.download_package_name = ((Builder)list).download_package_name;
      this.download_item_id = ((Builder)list).download_item_id;
      this.download_appid = ((Builder)list).download_appid;
      this.cover_url = ((Builder)list).cover_url;
      this.play_url = ((Builder)list).play_url;
      this.cover_image_color = ((Builder)list).cover_image_color;
      this.video_image_color = Message.immutableCopyOf(((Builder)list).video_image_color);
    } 
  }
  
  public HeadImgs(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HeadImgs> {
    public String btn_text;
    
    public CoverImageColor cover_image_color;
    
    public String cover_url;
    
    public String download_appid;
    
    public String download_appname;
    
    public String download_developer;
    
    public String download_img;
    
    public Integer download_is_thirdpage;
    
    public Integer download_item_id;
    
    public String download_package_name;
    
    public String download_package_size;
    
    public String download_privacy_policy;
    
    public String download_url;
    
    public String download_user_power;
    
    public String download_version;
    
    public Integer has_second_page;
    
    public String img_url;
    
    public String package_name;
    
    public String pc_url;
    
    public String play_url;
    
    public String schema;
    
    public String subtitle;
    
    public String tag_name_url;
    
    public String tag_name_wh;
    
    public List<String> third_statistics_url;
    
    public String title;
    
    public List<VideoImageColor> video_image_color;
    
    public Builder() {}
    
    public Builder(HeadImgs param1HeadImgs) {
      super(param1HeadImgs);
      if (param1HeadImgs == null)
        return; 
      this.img_url = param1HeadImgs.img_url;
      this.pc_url = param1HeadImgs.pc_url;
      this.title = param1HeadImgs.title;
      this.subtitle = param1HeadImgs.subtitle;
      this.btn_text = param1HeadImgs.btn_text;
      this.tag_name_url = param1HeadImgs.tag_name_url;
      this.tag_name_wh = param1HeadImgs.tag_name_wh;
      this.schema = param1HeadImgs.schema;
      this.third_statistics_url = Message.copyOf(param1HeadImgs.third_statistics_url);
      this.has_second_page = param1HeadImgs.has_second_page;
      this.package_name = param1HeadImgs.package_name;
      this.download_is_thirdpage = param1HeadImgs.download_is_thirdpage;
      this.download_appname = param1HeadImgs.download_appname;
      this.download_developer = param1HeadImgs.download_developer;
      this.download_package_size = param1HeadImgs.download_package_size;
      this.download_url = param1HeadImgs.download_url;
      this.download_img = param1HeadImgs.download_img;
      this.download_version = param1HeadImgs.download_version;
      this.download_user_power = param1HeadImgs.download_user_power;
      this.download_privacy_policy = param1HeadImgs.download_privacy_policy;
      this.download_package_name = param1HeadImgs.download_package_name;
      this.download_item_id = param1HeadImgs.download_item_id;
      this.download_appid = param1HeadImgs.download_appid;
      this.cover_url = param1HeadImgs.cover_url;
      this.play_url = param1HeadImgs.play_url;
      this.cover_image_color = param1HeadImgs.cover_image_color;
      this.video_image_color = Message.copyOf(param1HeadImgs.video_image_color);
    }
    
    public HeadImgs build(boolean param1Boolean) {
      return new HeadImgs(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
