package tbclient.GetNewGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NewGameInfo extends Message {
  public static final String DEFAULT_ANDR_PK_NAME = "";
  
  public static final String DEFAULT_API_KEY = "";
  
  public static final String DEFAULT_APPLE_ID = "";
  
  public static final String DEFAULT_APP_ID = "";
  
  public static final String DEFAULT_BUNDLE_ID = "";
  
  public static final String DEFAULT_CANVAS_NAME = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final String DEFAULT_CATEGORY_NAME_SIM = "";
  
  public static final Integer DEFAULT_CHANNEL;
  
  public static final Long DEFAULT_DEADLINE;
  
  public static final String DEFAULT_DEVELOPER = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_GAME_DESC = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_LINK = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final List<String> DEFAULT_GAME_PIC;
  
  public static final Integer DEFAULT_GAME_PLATFORM;
  
  public static final Integer DEFAULT_GAME_TYPE;
  
  public static final String DEFAULT_GIFT_CODE = "";
  
  public static final String DEFAULT_ICON_PIC1 = "";
  
  public static final String DEFAULT_ICON_PIC2 = "";
  
  public static final String DEFAULT_ICON_PIC3 = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_INTER_VERSION = "";
  
  public static final String DEFAULT_INTER_VERSION_IOS = "";
  
  public static final String DEFAULT_LAUNCHCOMPONENT = "";
  
  public static final Integer DEFAULT_MARK;
  
  public static final String DEFAULT_PACKAGE_LINK = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_PACKAGE_SIZE = "";
  
  public static final Integer DEFAULT_PLAY_COUNT;
  
  public static final String DEFAULT_PRAISE = "";
  
  public static final List<String> DEFAULT_RECOMMEND_PLATFORM;
  
  public static final String DEFAULT_SCHEMA_URL = "";
  
  public static final Integer DEFAULT_SCORE;
  
  public static final String DEFAULT_SECRET_KEY = "";
  
  public static final String DEFAULT_SERVER_ID = "";
  
  public static final String DEFAULT_SERVER_NAME = "";
  
  public static final Integer DEFAULT_SERVER_OPEN_TIME;
  
  public static final Integer DEFAULT_SERVER_TYPE;
  
  public static final String DEFAULT_SIGN = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_SUBSCRIPT_COLOR = "";
  
  public static final String DEFAULT_TEST_USERIDS = "";
  
  public static final String DEFAULT_THREAD_FORUM_NAME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_THREAD_THEME_ID;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_VERSION = "";
  
  public static final String DEFAULT_VERSION_IOS = "";
  
  @ProtoField(tag = 51, type = Message.Datatype.STRING)
  public final String andr_pk_name;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String api_key;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String app_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String apple_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String bundle_id;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String canvas_name;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 52, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String category_name_sim;
  
  @ProtoField(tag = 40, type = Message.Datatype.UINT32)
  public final Integer channel;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT64)
  public final Long deadline;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String developer;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String game_desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String game_link;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
  public final List<String> game_pic;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer game_platform;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer game_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String gift_code;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String icon_pic1;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String icon_pic2;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String icon_pic3;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String inter_version;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String inter_version_ios;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String launchComponent;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer mark;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String package_link;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String package_size;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer play_count;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String praise;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16, type = Message.Datatype.STRING)
  public final List<String> recommend_platform;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String schema_url;
  
  @ProtoField(tag = 35, type = Message.Datatype.INT32)
  public final Integer score;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String secret_key;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String server_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String server_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer server_open_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer server_type;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String subscript_color;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String test_userids;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String thread_forum_name;
  
  @ProtoField(tag = 33, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 32, type = Message.Datatype.UINT64)
  public final Long thread_theme_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String version;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String version_ios;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SERVER_OPEN_TIME = integer;
    DEFAULT_SERVER_TYPE = integer;
    DEFAULT_TIME = integer;
    DEFAULT_GAME_PIC = Collections.emptyList();
    DEFAULT_RECOMMEND_PLATFORM = Collections.emptyList();
    DEFAULT_THREAD_THEME_ID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_SCORE = integer;
    DEFAULT_DEADLINE = long_;
    DEFAULT_PLAY_COUNT = integer;
    DEFAULT_GAME_TYPE = integer;
    DEFAULT_GAME_PLATFORM = integer;
    DEFAULT_CHANNEL = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_MARK = integer;
  }
  
  public NewGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      String str6 = paramBuilder.game_id;
      if (str6 == null) {
        this.game_id = "";
      } else {
        this.game_id = str6;
      } 
      str6 = paramBuilder.server_id;
      if (str6 == null) {
        this.server_id = "";
      } else {
        this.server_id = str6;
      } 
      str6 = paramBuilder.server_name;
      if (str6 == null) {
        this.server_name = "";
      } else {
        this.server_name = str6;
      } 
      Integer integer4 = paramBuilder.server_open_time;
      if (integer4 == null) {
        this.server_open_time = DEFAULT_SERVER_OPEN_TIME;
      } else {
        this.server_open_time = integer4;
      } 
      integer4 = paramBuilder.server_type;
      if (integer4 == null) {
        this.server_type = DEFAULT_SERVER_TYPE;
      } else {
        this.server_type = integer4;
      } 
      integer4 = paramBuilder.time;
      if (integer4 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer4;
      } 
      String str5 = paramBuilder.gift_code;
      if (str5 == null) {
        this.gift_code = "";
      } else {
        this.gift_code = str5;
      } 
      str5 = paramBuilder.game_link;
      if (str5 == null) {
        this.game_link = "";
      } else {
        this.game_link = str5;
      } 
      str5 = paramBuilder.praise;
      if (str5 == null) {
        this.praise = "";
      } else {
        this.praise = str5;
      } 
      str5 = paramBuilder.test_userids;
      if (str5 == null) {
        this.test_userids = "";
      } else {
        this.test_userids = str5;
      } 
      str5 = paramBuilder.game_desc;
      if (str5 == null) {
        this.game_desc = "";
      } else {
        this.game_desc = str5;
      } 
      List<String> list2 = paramBuilder.game_pic;
      if (list2 == null) {
        this.game_pic = DEFAULT_GAME_PIC;
      } else {
        this.game_pic = Message.immutableCopyOf(list2);
      } 
      String str4 = paramBuilder.game_name;
      if (str4 == null) {
        this.game_name = "";
      } else {
        this.game_name = str4;
      } 
      str4 = paramBuilder.developer;
      if (str4 == null) {
        this.developer = "";
      } else {
        this.developer = str4;
      } 
      List<String> list1 = paramBuilder.recommend_platform;
      if (list1 == null) {
        this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
      } else {
        this.recommend_platform = Message.immutableCopyOf(list1);
      } 
      String str3 = paramBuilder.package_name;
      if (str3 == null) {
        this.package_name = "";
      } else {
        this.package_name = str3;
      } 
      str3 = paramBuilder.sign;
      if (str3 == null) {
        this.sign = "";
      } else {
        this.sign = str3;
      } 
      str3 = paramBuilder.launchComponent;
      if (str3 == null) {
        this.launchComponent = "";
      } else {
        this.launchComponent = str3;
      } 
      str3 = paramBuilder.package_size;
      if (str3 == null) {
        this.package_size = "";
      } else {
        this.package_size = str3;
      } 
      str3 = paramBuilder.apple_id;
      if (str3 == null) {
        this.apple_id = "";
      } else {
        this.apple_id = str3;
      } 
      str3 = paramBuilder.bundle_id;
      if (str3 == null) {
        this.bundle_id = "";
      } else {
        this.bundle_id = str3;
      } 
      str3 = paramBuilder.schema_url;
      if (str3 == null) {
        this.schema_url = "";
      } else {
        this.schema_url = str3;
      } 
      str3 = paramBuilder.app_id;
      if (str3 == null) {
        this.app_id = "";
      } else {
        this.app_id = str3;
      } 
      str3 = paramBuilder.canvas_name;
      if (str3 == null) {
        this.canvas_name = "";
      } else {
        this.canvas_name = str3;
      } 
      str3 = paramBuilder.thread_forum_name;
      if (str3 == null) {
        this.thread_forum_name = "";
      } else {
        this.thread_forum_name = str3;
      } 
      str3 = paramBuilder.forum_name;
      if (str3 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str3;
      } 
      str3 = paramBuilder.icon_pic1;
      if (str3 == null) {
        this.icon_pic1 = "";
      } else {
        this.icon_pic1 = str3;
      } 
      str3 = paramBuilder.icon_pic2;
      if (str3 == null) {
        this.icon_pic2 = "";
      } else {
        this.icon_pic2 = str3;
      } 
      str3 = paramBuilder.icon_pic3;
      if (str3 == null) {
        this.icon_pic3 = "";
      } else {
        this.icon_pic3 = str3;
      } 
      str3 = paramBuilder.secret_key;
      if (str3 == null) {
        this.secret_key = "";
      } else {
        this.secret_key = str3;
      } 
      Long long_2 = paramBuilder.thread_theme_id;
      if (long_2 == null) {
        this.thread_theme_id = DEFAULT_THREAD_THEME_ID;
      } else {
        this.thread_theme_id = long_2;
      } 
      long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      Integer integer3 = paramBuilder.score;
      if (integer3 == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer3;
      } 
      Long long_1 = paramBuilder.deadline;
      if (long_1 == null) {
        this.deadline = DEFAULT_DEADLINE;
      } else {
        this.deadline = long_1;
      } 
      Integer integer2 = paramBuilder.play_count;
      if (integer2 == null) {
        this.play_count = DEFAULT_PLAY_COUNT;
      } else {
        this.play_count = integer2;
      } 
      integer2 = paramBuilder.game_type;
      if (integer2 == null) {
        this.game_type = DEFAULT_GAME_TYPE;
      } else {
        this.game_type = integer2;
      } 
      integer2 = paramBuilder.game_platform;
      if (integer2 == null) {
        this.game_platform = DEFAULT_GAME_PLATFORM;
      } else {
        this.game_platform = integer2;
      } 
      integer2 = paramBuilder.channel;
      if (integer2 == null) {
        this.channel = DEFAULT_CHANNEL;
      } else {
        this.channel = integer2;
      } 
      String str2 = paramBuilder.version;
      if (str2 == null) {
        this.version = "";
      } else {
        this.version = str2;
      } 
      str2 = paramBuilder.api_key;
      if (str2 == null) {
        this.api_key = "";
      } else {
        this.api_key = str2;
      } 
      str2 = paramBuilder.inter_version;
      if (str2 == null) {
        this.inter_version = "";
      } else {
        this.inter_version = str2;
      } 
      str2 = paramBuilder.version_ios;
      if (str2 == null) {
        this.version_ios = "";
      } else {
        this.version_ios = str2;
      } 
      str2 = paramBuilder.inter_version_ios;
      if (str2 == null) {
        this.inter_version_ios = "";
      } else {
        this.inter_version_ios = str2;
      } 
      str2 = paramBuilder.subscript_color;
      if (str2 == null) {
        this.subscript_color = "";
      } else {
        this.subscript_color = str2;
      } 
      Integer integer1 = paramBuilder.category_id;
      if (integer1 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer1;
      } 
      integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      integer1 = paramBuilder.mark;
      if (integer1 == null) {
        this.mark = DEFAULT_MARK;
      } else {
        this.mark = integer1;
      } 
      String str1 = paramBuilder.package_link;
      if (str1 == null) {
        this.package_link = "";
      } else {
        this.package_link = str1;
      } 
      str1 = paramBuilder.andr_pk_name;
      if (str1 == null) {
        this.andr_pk_name = "";
      } else {
        this.andr_pk_name = str1;
      } 
      str1 = paramBuilder.category_name;
      if (str1 == null) {
        this.category_name = "";
      } else {
        this.category_name = str1;
      } 
      str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str = paramBuilder.category_name_sim;
      if (str == null) {
        this.category_name_sim = "";
      } else {
        this.category_name_sim = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.game_id = ((Builder)str).game_id;
      this.server_id = ((Builder)str).server_id;
      this.server_name = ((Builder)str).server_name;
      this.server_open_time = ((Builder)str).server_open_time;
      this.server_type = ((Builder)str).server_type;
      this.time = ((Builder)str).time;
      this.gift_code = ((Builder)str).gift_code;
      this.game_link = ((Builder)str).game_link;
      this.praise = ((Builder)str).praise;
      this.test_userids = ((Builder)str).test_userids;
      this.game_desc = ((Builder)str).game_desc;
      this.game_pic = Message.immutableCopyOf(((Builder)str).game_pic);
      this.game_name = ((Builder)str).game_name;
      this.developer = ((Builder)str).developer;
      this.recommend_platform = Message.immutableCopyOf(((Builder)str).recommend_platform);
      this.package_name = ((Builder)str).package_name;
      this.sign = ((Builder)str).sign;
      this.launchComponent = ((Builder)str).launchComponent;
      this.package_size = ((Builder)str).package_size;
      this.apple_id = ((Builder)str).apple_id;
      this.bundle_id = ((Builder)str).bundle_id;
      this.schema_url = ((Builder)str).schema_url;
      this.app_id = ((Builder)str).app_id;
      this.canvas_name = ((Builder)str).canvas_name;
      this.thread_forum_name = ((Builder)str).thread_forum_name;
      this.forum_name = ((Builder)str).forum_name;
      this.icon_pic1 = ((Builder)str).icon_pic1;
      this.icon_pic2 = ((Builder)str).icon_pic2;
      this.icon_pic3 = ((Builder)str).icon_pic3;
      this.secret_key = ((Builder)str).secret_key;
      this.thread_theme_id = ((Builder)str).thread_theme_id;
      this.thread_id = ((Builder)str).thread_id;
      this.forum_id = ((Builder)str).forum_id;
      this.score = ((Builder)str).score;
      this.deadline = ((Builder)str).deadline;
      this.play_count = ((Builder)str).play_count;
      this.game_type = ((Builder)str).game_type;
      this.game_platform = ((Builder)str).game_platform;
      this.channel = ((Builder)str).channel;
      this.version = ((Builder)str).version;
      this.api_key = ((Builder)str).api_key;
      this.inter_version = ((Builder)str).inter_version;
      this.version_ios = ((Builder)str).version_ios;
      this.inter_version_ios = ((Builder)str).inter_version_ios;
      this.subscript_color = ((Builder)str).subscript_color;
      this.category_id = ((Builder)str).category_id;
      this.status = ((Builder)str).status;
      this.mark = ((Builder)str).mark;
      this.package_link = ((Builder)str).package_link;
      this.andr_pk_name = ((Builder)str).andr_pk_name;
      this.category_name = ((Builder)str).category_name;
      this.icon_url = ((Builder)str).icon_url;
      this.category_name_sim = ((Builder)str).category_name_sim;
    } 
  }
  
  public NewGameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewGameInfo> {
    public String andr_pk_name;
    
    public String api_key;
    
    public String app_id;
    
    public String apple_id;
    
    public String bundle_id;
    
    public String canvas_name;
    
    public Integer category_id;
    
    public String category_name;
    
    public String category_name_sim;
    
    public Integer channel;
    
    public Long deadline;
    
    public String developer;
    
    public Long forum_id;
    
    public String forum_name;
    
    public String game_desc;
    
    public String game_id;
    
    public String game_link;
    
    public String game_name;
    
    public List<String> game_pic;
    
    public Integer game_platform;
    
    public Integer game_type;
    
    public String gift_code;
    
    public String icon_pic1;
    
    public String icon_pic2;
    
    public String icon_pic3;
    
    public String icon_url;
    
    public Long id;
    
    public String inter_version;
    
    public String inter_version_ios;
    
    public String launchComponent;
    
    public Integer mark;
    
    public String package_link;
    
    public String package_name;
    
    public String package_size;
    
    public Integer play_count;
    
    public String praise;
    
    public List<String> recommend_platform;
    
    public String schema_url;
    
    public Integer score;
    
    public String secret_key;
    
    public String server_id;
    
    public String server_name;
    
    public Integer server_open_time;
    
    public Integer server_type;
    
    public String sign;
    
    public Integer status;
    
    public String subscript_color;
    
    public String test_userids;
    
    public String thread_forum_name;
    
    public Long thread_id;
    
    public Long thread_theme_id;
    
    public Integer time;
    
    public String version;
    
    public String version_ios;
    
    public Builder() {}
    
    public Builder(NewGameInfo param1NewGameInfo) {
      super(param1NewGameInfo);
      if (param1NewGameInfo == null)
        return; 
      this.id = param1NewGameInfo.id;
      this.game_id = param1NewGameInfo.game_id;
      this.server_id = param1NewGameInfo.server_id;
      this.server_name = param1NewGameInfo.server_name;
      this.server_open_time = param1NewGameInfo.server_open_time;
      this.server_type = param1NewGameInfo.server_type;
      this.time = param1NewGameInfo.time;
      this.gift_code = param1NewGameInfo.gift_code;
      this.game_link = param1NewGameInfo.game_link;
      this.praise = param1NewGameInfo.praise;
      this.test_userids = param1NewGameInfo.test_userids;
      this.game_desc = param1NewGameInfo.game_desc;
      this.game_pic = Message.copyOf(param1NewGameInfo.game_pic);
      this.game_name = param1NewGameInfo.game_name;
      this.developer = param1NewGameInfo.developer;
      this.recommend_platform = Message.copyOf(param1NewGameInfo.recommend_platform);
      this.package_name = param1NewGameInfo.package_name;
      this.sign = param1NewGameInfo.sign;
      this.launchComponent = param1NewGameInfo.launchComponent;
      this.package_size = param1NewGameInfo.package_size;
      this.apple_id = param1NewGameInfo.apple_id;
      this.bundle_id = param1NewGameInfo.bundle_id;
      this.schema_url = param1NewGameInfo.schema_url;
      this.app_id = param1NewGameInfo.app_id;
      this.canvas_name = param1NewGameInfo.canvas_name;
      this.thread_forum_name = param1NewGameInfo.thread_forum_name;
      this.forum_name = param1NewGameInfo.forum_name;
      this.icon_pic1 = param1NewGameInfo.icon_pic1;
      this.icon_pic2 = param1NewGameInfo.icon_pic2;
      this.icon_pic3 = param1NewGameInfo.icon_pic3;
      this.secret_key = param1NewGameInfo.secret_key;
      this.thread_theme_id = param1NewGameInfo.thread_theme_id;
      this.thread_id = param1NewGameInfo.thread_id;
      this.forum_id = param1NewGameInfo.forum_id;
      this.score = param1NewGameInfo.score;
      this.deadline = param1NewGameInfo.deadline;
      this.play_count = param1NewGameInfo.play_count;
      this.game_type = param1NewGameInfo.game_type;
      this.game_platform = param1NewGameInfo.game_platform;
      this.channel = param1NewGameInfo.channel;
      this.version = param1NewGameInfo.version;
      this.api_key = param1NewGameInfo.api_key;
      this.inter_version = param1NewGameInfo.inter_version;
      this.version_ios = param1NewGameInfo.version_ios;
      this.inter_version_ios = param1NewGameInfo.inter_version_ios;
      this.subscript_color = param1NewGameInfo.subscript_color;
      this.category_id = param1NewGameInfo.category_id;
      this.status = param1NewGameInfo.status;
      this.mark = param1NewGameInfo.mark;
      this.package_link = param1NewGameInfo.package_link;
      this.andr_pk_name = param1NewGameInfo.andr_pk_name;
      this.category_name = param1NewGameInfo.category_name;
      this.icon_url = param1NewGameInfo.icon_url;
      this.category_name_sim = param1NewGameInfo.category_name_sim;
    }
    
    public NewGameInfo build(boolean param1Boolean) {
      return new NewGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
