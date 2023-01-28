package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ItemInfo extends Message {
  public static final String DEFAULT_APK_NAME = "";
  
  public static final String DEFAULT_BRIEF = "";
  
  public static final String DEFAULT_BUTTON_LINK = "";
  
  public static final Integer DEFAULT_BUTTON_LINK_TYPE;
  
  public static final String DEFAULT_BUTTON_NAME = "";
  
  public static final String DEFAULT_CATEGORY1 = "";
  
  public static final String DEFAULT_CATEGORY2 = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Double DEFAULT_ICON_SIZE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_SCHOOL;
  
  public static final String DEFAULT_ITEM_APPID = "";
  
  public static final List<ItemOptions> DEFAULT_ITEM_OPTIONS;
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<String> DEFAULT_TAGS = Collections.emptyList();
  
  public static final List<TagInfo> DEFAULT_TAG_INFO;
  
  public static final String DEFAULT_TEMPLATE_NAME = "";
  
  @ProtoField(tag = 24)
  public final ApkDetail apk_detail;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String apk_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String brief;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String button_link;
  
  @ProtoField(tag = 22, type = Message.Datatype.INT32)
  public final Integer button_link_type;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String button_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String category1;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String category2;
  
  @ProtoField(tag = 16)
  public final ItemDetail detail;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double icon_size;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer id;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer is_school;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String item_appid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ItemOptions> item_options;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 17)
  public final Ranking ranking;
  
  @ProtoField(tag = 8)
  public final ItemTable score;
  
  @ProtoField(tag = 18)
  public final ItemService service;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<TagInfo> tag_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String template_name;
  
  @ProtoField(tag = 10)
  public final ItemThemeColor theme_color;
  
  static {
    DEFAULT_ICON_SIZE = Double.valueOf(0.0D);
    DEFAULT_ITEM_OPTIONS = Collections.emptyList();
    DEFAULT_IS_SCHOOL = integer;
    DEFAULT_TAG_INFO = Collections.emptyList();
    DEFAULT_BUTTON_LINK_TYPE = integer;
  }
  
  public ItemInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.id;
      if (integer3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer3;
      } 
      String str4 = paramBuilder.name;
      if (str4 == null) {
        this.name = "";
      } else {
        this.name = str4;
      } 
      str4 = paramBuilder.icon_url;
      if (str4 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str4;
      } 
      str4 = paramBuilder.brief;
      if (str4 == null) {
        this.brief = "";
      } else {
        this.brief = str4;
      } 
      List<String> list2 = paramBuilder.tags;
      if (list2 == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list2);
      } 
      Double double_ = paramBuilder.icon_size;
      if (double_ == null) {
        this.icon_size = DEFAULT_ICON_SIZE;
      } else {
        this.icon_size = double_;
      } 
      List<ItemOptions> list1 = paramBuilder.item_options;
      if (list1 == null) {
        this.item_options = DEFAULT_ITEM_OPTIONS;
      } else {
        this.item_options = Message.immutableCopyOf(list1);
      } 
      this.score = paramBuilder.score;
      Integer integer2 = paramBuilder.is_school;
      if (integer2 == null) {
        this.is_school = DEFAULT_IS_SCHOOL;
      } else {
        this.is_school = integer2;
      } 
      this.theme_color = paramBuilder.theme_color;
      String str3 = paramBuilder.template_name;
      if (str3 == null) {
        this.template_name = "";
      } else {
        this.template_name = str3;
      } 
      str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      List<TagInfo> list = paramBuilder.tag_info;
      if (list == null) {
        this.tag_info = DEFAULT_TAG_INFO;
      } else {
        this.tag_info = Message.immutableCopyOf(list);
      } 
      String str2 = paramBuilder.category1;
      if (str2 == null) {
        this.category1 = "";
      } else {
        this.category1 = str2;
      } 
      str2 = paramBuilder.category2;
      if (str2 == null) {
        this.category2 = "";
      } else {
        this.category2 = str2;
      } 
      this.detail = paramBuilder.detail;
      this.ranking = paramBuilder.ranking;
      this.service = paramBuilder.service;
      str2 = paramBuilder.button_name;
      if (str2 == null) {
        this.button_name = "";
      } else {
        this.button_name = str2;
      } 
      str2 = paramBuilder.button_link;
      if (str2 == null) {
        this.button_link = "";
      } else {
        this.button_link = str2;
      } 
      str2 = paramBuilder.item_appid;
      if (str2 == null) {
        this.item_appid = "";
      } else {
        this.item_appid = str2;
      } 
      Integer integer1 = paramBuilder.button_link_type;
      if (integer1 == null) {
        this.button_link_type = DEFAULT_BUTTON_LINK_TYPE;
      } else {
        this.button_link_type = integer1;
      } 
      String str1 = paramBuilder.apk_name;
      if (str1 == null) {
        this.apk_name = "";
      } else {
        this.apk_name = str1;
      } 
      this.apk_detail = paramBuilder.apk_detail;
    } else {
      this.id = paramBuilder.id;
      this.name = paramBuilder.name;
      this.icon_url = paramBuilder.icon_url;
      this.brief = paramBuilder.brief;
      this.tags = Message.immutableCopyOf(paramBuilder.tags);
      this.icon_size = paramBuilder.icon_size;
      this.item_options = Message.immutableCopyOf(paramBuilder.item_options);
      this.score = paramBuilder.score;
      this.is_school = paramBuilder.is_school;
      this.theme_color = paramBuilder.theme_color;
      this.template_name = paramBuilder.template_name;
      this.forum_name = paramBuilder.forum_name;
      this.tag_info = Message.immutableCopyOf(paramBuilder.tag_info);
      this.category1 = paramBuilder.category1;
      this.category2 = paramBuilder.category2;
      this.detail = paramBuilder.detail;
      this.ranking = paramBuilder.ranking;
      this.service = paramBuilder.service;
      this.button_name = paramBuilder.button_name;
      this.button_link = paramBuilder.button_link;
      this.item_appid = paramBuilder.item_appid;
      this.button_link_type = paramBuilder.button_link_type;
      this.apk_name = paramBuilder.apk_name;
      this.apk_detail = paramBuilder.apk_detail;
    } 
  }
  
  public ItemInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
  }
  
  public static final class Builder extends Message.Builder<ItemInfo> {
    public ApkDetail apk_detail;
    
    public String apk_name;
    
    public String brief;
    
    public String button_link;
    
    public Integer button_link_type;
    
    public String button_name;
    
    public String category1;
    
    public String category2;
    
    public ItemDetail detail;
    
    public String forum_name;
    
    public Double icon_size;
    
    public String icon_url;
    
    public Integer id;
    
    public Integer is_school;
    
    public String item_appid;
    
    public List<ItemOptions> item_options;
    
    public String name;
    
    public Ranking ranking;
    
    public ItemTable score;
    
    public ItemService service;
    
    public List<TagInfo> tag_info;
    
    public List<String> tags;
    
    public String template_name;
    
    public ItemThemeColor theme_color;
    
    public Builder() {}
    
    public Builder(ItemInfo param1ItemInfo) {
      super(param1ItemInfo);
      if (param1ItemInfo == null)
        return; 
      this.id = param1ItemInfo.id;
      this.name = param1ItemInfo.name;
      this.icon_url = param1ItemInfo.icon_url;
      this.brief = param1ItemInfo.brief;
      this.tags = Message.copyOf(param1ItemInfo.tags);
      this.icon_size = param1ItemInfo.icon_size;
      this.item_options = Message.copyOf(param1ItemInfo.item_options);
      this.score = param1ItemInfo.score;
      this.is_school = param1ItemInfo.is_school;
      this.theme_color = param1ItemInfo.theme_color;
      this.template_name = param1ItemInfo.template_name;
      this.forum_name = param1ItemInfo.forum_name;
      this.tag_info = Message.copyOf(param1ItemInfo.tag_info);
      this.category1 = param1ItemInfo.category1;
      this.category2 = param1ItemInfo.category2;
      this.detail = param1ItemInfo.detail;
      this.ranking = param1ItemInfo.ranking;
      this.service = param1ItemInfo.service;
      this.button_name = param1ItemInfo.button_name;
      this.button_link = param1ItemInfo.button_link;
      this.item_appid = param1ItemInfo.item_appid;
      this.button_link_type = param1ItemInfo.button_link_type;
      this.apk_name = param1ItemInfo.apk_name;
      this.apk_detail = param1ItemInfo.apk_detail;
    }
    
    public ItemInfo build(boolean param1Boolean) {
      return new ItemInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
