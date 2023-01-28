package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendGame extends Message {
  public static final String DEFAULT_ANDR_PK_NAME = "";
  
  public static final String DEFAULT_APPLE_ID = "";
  
  public static final String DEFAULT_BUNDLE_ID = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final Integer DEFAULT_DAY_DOWNLOADS;
  
  public static final Long DEFAULT_DEADLINE;
  
  public static final String DEFAULT_EDITOR_REC = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_LINK = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final List<String> DEFAULT_GAME_PIC;
  
  public static final Integer DEFAULT_GAME_TYPE;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_INTRODUCE = "";
  
  public static final String DEFAULT_LAUNCH_COMPONENT = "";
  
  public static final Integer DEFAULT_MARK;
  
  public static final String DEFAULT_PACKAGE_LINK = "";
  
  public static final String DEFAULT_PACKAGE_SIZE = "";
  
  public static final Integer DEFAULT_PLAYER_NUM;
  
  public static final String DEFAULT_SCHEMA_URL = "";
  
  public static final String DEFAULT_SECRET_KEY = "";
  
  public static final Integer DEFAULT_STAR;
  
  public static final String DEFAULT_SUPERSCRIPT_COLOR = "";
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String andr_pk_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String apple_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String bundle_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer day_downloads;
  
  @ProtoField(tag = 24, type = Message.Datatype.UINT64)
  public final Long deadline;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String editor_rec;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String game_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14, type = Message.Datatype.STRING)
  public final List<String> game_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer game_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String introduce;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String launch_component;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer mark;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String package_link;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String package_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer player_num;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String schema_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String secret_key;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer star;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String superscript_color;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_GAME_TYPE = integer;
    DEFAULT_PLAYER_NUM = integer;
    DEFAULT_MARK = integer;
    DEFAULT_GAME_PIC = Collections.emptyList();
    DEFAULT_DAY_DOWNLOADS = integer;
    DEFAULT_STAR = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_DEADLINE = Long.valueOf(0L);
  }
  
  public RecommendGame(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str7 = paramBuilder.game_id;
      if (str7 == null) {
        this.game_id = "";
      } else {
        this.game_id = str7;
      } 
      str7 = paramBuilder.game_name;
      if (str7 == null) {
        this.game_name = "";
      } else {
        this.game_name = str7;
      } 
      Integer integer5 = paramBuilder.game_type;
      if (integer5 == null) {
        this.game_type = DEFAULT_GAME_TYPE;
      } else {
        this.game_type = integer5;
      } 
      String str6 = paramBuilder.icon_url;
      if (str6 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str6;
      } 
      str6 = paramBuilder.secret_key;
      if (str6 == null) {
        this.secret_key = "";
      } else {
        this.secret_key = str6;
      } 
      Integer integer4 = paramBuilder.player_num;
      if (integer4 == null) {
        this.player_num = DEFAULT_PLAYER_NUM;
      } else {
        this.player_num = integer4;
      } 
      String str5 = paramBuilder.package_link;
      if (str5 == null) {
        this.package_link = "";
      } else {
        this.package_link = str5;
      } 
      str5 = paramBuilder.package_size;
      if (str5 == null) {
        this.package_size = "";
      } else {
        this.package_size = str5;
      } 
      str5 = paramBuilder.game_link;
      if (str5 == null) {
        this.game_link = "";
      } else {
        this.game_link = str5;
      } 
      Integer integer3 = paramBuilder.mark;
      if (integer3 == null) {
        this.mark = DEFAULT_MARK;
      } else {
        this.mark = integer3;
      } 
      String str4 = paramBuilder.apple_id;
      if (str4 == null) {
        this.apple_id = "";
      } else {
        this.apple_id = str4;
      } 
      str4 = paramBuilder.bundle_id;
      if (str4 == null) {
        this.bundle_id = "";
      } else {
        this.bundle_id = str4;
      } 
      str4 = paramBuilder.schema_url;
      if (str4 == null) {
        this.schema_url = "";
      } else {
        this.schema_url = str4;
      } 
      List<String> list = paramBuilder.game_pic;
      if (list == null) {
        this.game_pic = DEFAULT_GAME_PIC;
      } else {
        this.game_pic = Message.immutableCopyOf(list);
      } 
      String str3 = paramBuilder.introduce;
      if (str3 == null) {
        this.introduce = "";
      } else {
        this.introduce = str3;
      } 
      str3 = paramBuilder.launch_component;
      if (str3 == null) {
        this.launch_component = "";
      } else {
        this.launch_component = str3;
      } 
      str3 = paramBuilder.andr_pk_name;
      if (str3 == null) {
        this.andr_pk_name = "";
      } else {
        this.andr_pk_name = str3;
      } 
      Integer integer2 = paramBuilder.day_downloads;
      if (integer2 == null) {
        this.day_downloads = DEFAULT_DAY_DOWNLOADS;
      } else {
        this.day_downloads = integer2;
      } 
      String str2 = paramBuilder.superscript_color;
      if (str2 == null) {
        this.superscript_color = "";
      } else {
        this.superscript_color = str2;
      } 
      Integer integer1 = paramBuilder.star;
      if (integer1 == null) {
        this.star = DEFAULT_STAR;
      } else {
        this.star = integer1;
      } 
      integer1 = paramBuilder.category_id;
      if (integer1 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer1;
      } 
      String str1 = paramBuilder.category_name;
      if (str1 == null) {
        this.category_name = "";
      } else {
        this.category_name = str1;
      } 
      str1 = paramBuilder.version;
      if (str1 == null) {
        this.version = "";
      } else {
        this.version = str1;
      } 
      Long long_ = paramBuilder.deadline;
      if (long_ == null) {
        this.deadline = DEFAULT_DEADLINE;
      } else {
        this.deadline = long_;
      } 
      str = paramBuilder.editor_rec;
      if (str == null) {
        this.editor_rec = "";
      } else {
        this.editor_rec = str;
      } 
    } else {
      this.game_id = ((Builder)str).game_id;
      this.game_name = ((Builder)str).game_name;
      this.game_type = ((Builder)str).game_type;
      this.icon_url = ((Builder)str).icon_url;
      this.secret_key = ((Builder)str).secret_key;
      this.player_num = ((Builder)str).player_num;
      this.package_link = ((Builder)str).package_link;
      this.package_size = ((Builder)str).package_size;
      this.game_link = ((Builder)str).game_link;
      this.mark = ((Builder)str).mark;
      this.apple_id = ((Builder)str).apple_id;
      this.bundle_id = ((Builder)str).bundle_id;
      this.schema_url = ((Builder)str).schema_url;
      this.game_pic = Message.immutableCopyOf(((Builder)str).game_pic);
      this.introduce = ((Builder)str).introduce;
      this.launch_component = ((Builder)str).launch_component;
      this.andr_pk_name = ((Builder)str).andr_pk_name;
      this.day_downloads = ((Builder)str).day_downloads;
      this.superscript_color = ((Builder)str).superscript_color;
      this.star = ((Builder)str).star;
      this.category_id = ((Builder)str).category_id;
      this.category_name = ((Builder)str).category_name;
      this.version = ((Builder)str).version;
      this.deadline = ((Builder)str).deadline;
      this.editor_rec = ((Builder)str).editor_rec;
    } 
  }
  
  public RecommendGame(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendGame> {
    public String andr_pk_name;
    
    public String apple_id;
    
    public String bundle_id;
    
    public Integer category_id;
    
    public String category_name;
    
    public Integer day_downloads;
    
    public Long deadline;
    
    public String editor_rec;
    
    public String game_id;
    
    public String game_link;
    
    public String game_name;
    
    public List<String> game_pic;
    
    public Integer game_type;
    
    public String icon_url;
    
    public String introduce;
    
    public String launch_component;
    
    public Integer mark;
    
    public String package_link;
    
    public String package_size;
    
    public Integer player_num;
    
    public String schema_url;
    
    public String secret_key;
    
    public Integer star;
    
    public String superscript_color;
    
    public String version;
    
    public Builder() {}
    
    public Builder(RecommendGame param1RecommendGame) {
      super(param1RecommendGame);
      if (param1RecommendGame == null)
        return; 
      this.game_id = param1RecommendGame.game_id;
      this.game_name = param1RecommendGame.game_name;
      this.game_type = param1RecommendGame.game_type;
      this.icon_url = param1RecommendGame.icon_url;
      this.secret_key = param1RecommendGame.secret_key;
      this.player_num = param1RecommendGame.player_num;
      this.package_link = param1RecommendGame.package_link;
      this.package_size = param1RecommendGame.package_size;
      this.game_link = param1RecommendGame.game_link;
      this.mark = param1RecommendGame.mark;
      this.apple_id = param1RecommendGame.apple_id;
      this.bundle_id = param1RecommendGame.bundle_id;
      this.schema_url = param1RecommendGame.schema_url;
      this.game_pic = Message.copyOf(param1RecommendGame.game_pic);
      this.introduce = param1RecommendGame.introduce;
      this.launch_component = param1RecommendGame.launch_component;
      this.andr_pk_name = param1RecommendGame.andr_pk_name;
      this.day_downloads = param1RecommendGame.day_downloads;
      this.superscript_color = param1RecommendGame.superscript_color;
      this.star = param1RecommendGame.star;
      this.category_id = param1RecommendGame.category_id;
      this.category_name = param1RecommendGame.category_name;
      this.version = param1RecommendGame.version;
      this.deadline = param1RecommendGame.deadline;
      this.editor_rec = param1RecommendGame.editor_rec;
    }
    
    public RecommendGame build(boolean param1Boolean) {
      return new RecommendGame(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
