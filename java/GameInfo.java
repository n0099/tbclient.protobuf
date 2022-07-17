package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GameInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_ANDR_PK_NAME = "";
  
  public static final String DEFAULT_APPLE_ID = "";
  
  public static final Integer DEFAULT_APP_ID;
  
  public static final String DEFAULT_BUNDLE_ID = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final String DEFAULT_CATEGORY_NAME_SIM = "";
  
  public static final Integer DEFAULT_DAY_DOWNLOADS;
  
  public static final Long DEFAULT_DEADLINE;
  
  public static final String DEFAULT_EDITOR_REC = "";
  
  public static final String DEFAULT_GAME_DESC = "";
  
  public static final String DEFAULT_GAME_DETAILS_URL = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_LINK = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  public static final List<String> DEFAULT_GAME_PIC;
  
  public static final Integer DEFAULT_GAME_TYPE;
  
  public static final String DEFAULT_ICON_PIC1 = "";
  
  public static final String DEFAULT_ICON_PIC2 = "";
  
  public static final String DEFAULT_ICON_PIC3 = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_INTRODUCE = "";
  
  public static final String DEFAULT_LAUNCHCOMPONENT = "";
  
  public static final String DEFAULT_LAUNCH_COMPONENT = "";
  
  public static final Integer DEFAULT_MARK;
  
  public static final String DEFAULT_PACKAGE_LINK = "";
  
  public static final String DEFAULT_PACKAGE_SIZE = "";
  
  public static final Integer DEFAULT_PLAYER_NUM;
  
  public static final String DEFAULT_SCHEMA_URL = "";
  
  public static final Integer DEFAULT_SCORE;
  
  public static final String DEFAULT_SECRET_KEY = "";
  
  public static final Integer DEFAULT_STAR;
  
  public static final String DEFAULT_SUBSCRIPT_COLOR = "";
  
  public static final String DEFAULT_SUPERSCRIPT_COLOR = "";
  
  public static final String DEFAULT_VERSION = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String andr_pk_name;
  
  @ProtoField(tag = 28, type = Message.Datatype.UINT32)
  public final Integer app_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String apple_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String bundle_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String category_name_sim;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer day_downloads;
  
  @ProtoField(tag = 24, type = Message.Datatype.UINT64)
  public final Long deadline;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String editor_rec;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String game_desc;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String game_details_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String game_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
  public final List<String> game_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer game_type;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String icon_pic1;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String icon_pic2;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String icon_pic3;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String introduce;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String launchComponent;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String launch_component;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer mark;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String package_link;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String package_size;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer player_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String schema_url;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer score;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String secret_key;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer star;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String subscript_color;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String superscript_color;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String version;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(884009681, "Ltbclient/GameInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(884009681, "Ltbclient/GameInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_GAME_TYPE = integer;
    DEFAULT_PLAYER_NUM = integer;
    DEFAULT_MARK = integer;
    DEFAULT_GAME_PIC = Collections.emptyList();
    DEFAULT_DAY_DOWNLOADS = integer;
    DEFAULT_STAR = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_DEADLINE = Long.valueOf(0L);
    DEFAULT_APP_ID = integer;
    DEFAULT_SCORE = integer;
  }
  
  public GameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str9 = paramBuilder.game_id;
      if (str9 == null) {
        this.game_id = "";
      } else {
        this.game_id = str9;
      } 
      str9 = paramBuilder.game_name;
      if (str9 == null) {
        this.game_name = "";
      } else {
        this.game_name = str9;
      } 
      Integer integer6 = paramBuilder.game_type;
      if (integer6 == null) {
        this.game_type = DEFAULT_GAME_TYPE;
      } else {
        this.game_type = integer6;
      } 
      String str8 = paramBuilder.icon_url;
      if (str8 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str8;
      } 
      Integer integer5 = paramBuilder.player_num;
      if (integer5 == null) {
        this.player_num = DEFAULT_PLAYER_NUM;
      } else {
        this.player_num = integer5;
      } 
      String str7 = paramBuilder.package_link;
      if (str7 == null) {
        this.package_link = "";
      } else {
        this.package_link = str7;
      } 
      str7 = paramBuilder.package_size;
      if (str7 == null) {
        this.package_size = "";
      } else {
        this.package_size = str7;
      } 
      str7 = paramBuilder.game_link;
      if (str7 == null) {
        this.game_link = "";
      } else {
        this.game_link = str7;
      } 
      Integer integer4 = paramBuilder.mark;
      if (integer4 == null) {
        this.mark = DEFAULT_MARK;
      } else {
        this.mark = integer4;
      } 
      String str6 = paramBuilder.apple_id;
      if (str6 == null) {
        this.apple_id = "";
      } else {
        this.apple_id = str6;
      } 
      str6 = paramBuilder.bundle_id;
      if (str6 == null) {
        this.bundle_id = "";
      } else {
        this.bundle_id = str6;
      } 
      str6 = paramBuilder.schema_url;
      if (str6 == null) {
        this.schema_url = "";
      } else {
        this.schema_url = str6;
      } 
      List<String> list = paramBuilder.game_pic;
      if (list == null) {
        this.game_pic = DEFAULT_GAME_PIC;
      } else {
        this.game_pic = Message.immutableCopyOf(list);
      } 
      String str5 = paramBuilder.introduce;
      if (str5 == null) {
        this.introduce = "";
      } else {
        this.introduce = str5;
      } 
      str5 = paramBuilder.launch_component;
      if (str5 == null) {
        this.launch_component = "";
      } else {
        this.launch_component = str5;
      } 
      str5 = paramBuilder.andr_pk_name;
      if (str5 == null) {
        this.andr_pk_name = "";
      } else {
        this.andr_pk_name = str5;
      } 
      Integer integer3 = paramBuilder.day_downloads;
      if (integer3 == null) {
        this.day_downloads = DEFAULT_DAY_DOWNLOADS;
      } else {
        this.day_downloads = integer3;
      } 
      String str4 = paramBuilder.secret_key;
      if (str4 == null) {
        this.secret_key = "";
      } else {
        this.secret_key = str4;
      } 
      str4 = paramBuilder.superscript_color;
      if (str4 == null) {
        this.superscript_color = "";
      } else {
        this.superscript_color = str4;
      } 
      Integer integer2 = paramBuilder.star;
      if (integer2 == null) {
        this.star = DEFAULT_STAR;
      } else {
        this.star = integer2;
      } 
      integer2 = paramBuilder.category_id;
      if (integer2 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer2;
      } 
      String str3 = paramBuilder.category_name;
      if (str3 == null) {
        this.category_name = "";
      } else {
        this.category_name = str3;
      } 
      str3 = paramBuilder.version;
      if (str3 == null) {
        this.version = "";
      } else {
        this.version = str3;
      } 
      Long long_ = paramBuilder.deadline;
      if (long_ == null) {
        this.deadline = DEFAULT_DEADLINE;
      } else {
        this.deadline = long_;
      } 
      String str2 = paramBuilder.editor_rec;
      if (str2 == null) {
        this.editor_rec = "";
      } else {
        this.editor_rec = str2;
      } 
      str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      str2 = paramBuilder.game_details_url;
      if (str2 == null) {
        this.game_details_url = "";
      } else {
        this.game_details_url = str2;
      } 
      Integer integer1 = paramBuilder.app_id;
      if (integer1 == null) {
        this.app_id = DEFAULT_APP_ID;
      } else {
        this.app_id = integer1;
      } 
      String str1 = paramBuilder.icon_pic1;
      if (str1 == null) {
        this.icon_pic1 = "";
      } else {
        this.icon_pic1 = str1;
      } 
      str1 = paramBuilder.icon_pic2;
      if (str1 == null) {
        this.icon_pic2 = "";
      } else {
        this.icon_pic2 = str1;
      } 
      str1 = paramBuilder.icon_pic3;
      if (str1 == null) {
        this.icon_pic3 = "";
      } else {
        this.icon_pic3 = str1;
      } 
      str1 = paramBuilder.game_desc;
      if (str1 == null) {
        this.game_desc = "";
      } else {
        this.game_desc = str1;
      } 
      str1 = paramBuilder.subscript_color;
      if (str1 == null) {
        this.subscript_color = "";
      } else {
        this.subscript_color = str1;
      } 
      str1 = paramBuilder.launchComponent;
      if (str1 == null) {
        this.launchComponent = "";
      } else {
        this.launchComponent = str1;
      } 
      str1 = paramBuilder.category_name_sim;
      if (str1 == null) {
        this.category_name_sim = "";
      } else {
        this.category_name_sim = str1;
      } 
      integer = paramBuilder.score;
      if (integer == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = integer;
      } 
    } else {
      this.game_id = ((Builder)integer).game_id;
      this.game_name = ((Builder)integer).game_name;
      this.game_type = ((Builder)integer).game_type;
      this.icon_url = ((Builder)integer).icon_url;
      this.player_num = ((Builder)integer).player_num;
      this.package_link = ((Builder)integer).package_link;
      this.package_size = ((Builder)integer).package_size;
      this.game_link = ((Builder)integer).game_link;
      this.mark = ((Builder)integer).mark;
      this.apple_id = ((Builder)integer).apple_id;
      this.bundle_id = ((Builder)integer).bundle_id;
      this.schema_url = ((Builder)integer).schema_url;
      this.game_pic = Message.immutableCopyOf(((Builder)integer).game_pic);
      this.introduce = ((Builder)integer).introduce;
      this.launch_component = ((Builder)integer).launch_component;
      this.andr_pk_name = ((Builder)integer).andr_pk_name;
      this.day_downloads = ((Builder)integer).day_downloads;
      this.secret_key = ((Builder)integer).secret_key;
      this.superscript_color = ((Builder)integer).superscript_color;
      this.star = ((Builder)integer).star;
      this.category_id = ((Builder)integer).category_id;
      this.category_name = ((Builder)integer).category_name;
      this.version = ((Builder)integer).version;
      this.deadline = ((Builder)integer).deadline;
      this.editor_rec = ((Builder)integer).editor_rec;
      this._abstract = ((Builder)integer)._abstract;
      this.game_details_url = ((Builder)integer).game_details_url;
      this.app_id = ((Builder)integer).app_id;
      this.icon_pic1 = ((Builder)integer).icon_pic1;
      this.icon_pic2 = ((Builder)integer).icon_pic2;
      this.icon_pic3 = ((Builder)integer).icon_pic3;
      this.game_desc = ((Builder)integer).game_desc;
      this.subscript_color = ((Builder)integer).subscript_color;
      this.launchComponent = ((Builder)integer).launchComponent;
      this.category_name_sim = ((Builder)integer).category_name_sim;
      this.score = ((Builder)integer).score;
    } 
  }
  
  public GameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GameInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String _abstract;
    
    public String andr_pk_name;
    
    public Integer app_id;
    
    public String apple_id;
    
    public String bundle_id;
    
    public Integer category_id;
    
    public String category_name;
    
    public String category_name_sim;
    
    public Integer day_downloads;
    
    public Long deadline;
    
    public String editor_rec;
    
    public String game_desc;
    
    public String game_details_url;
    
    public String game_id;
    
    public String game_link;
    
    public String game_name;
    
    public List<String> game_pic;
    
    public Integer game_type;
    
    public String icon_pic1;
    
    public String icon_pic2;
    
    public String icon_pic3;
    
    public String icon_url;
    
    public String introduce;
    
    public String launchComponent;
    
    public String launch_component;
    
    public Integer mark;
    
    public String package_link;
    
    public String package_size;
    
    public Integer player_num;
    
    public String schema_url;
    
    public Integer score;
    
    public String secret_key;
    
    public Integer star;
    
    public String subscript_color;
    
    public String superscript_color;
    
    public String version;
    
    public Builder() {}
    
    public Builder(GameInfo param1GameInfo) {
      super(param1GameInfo);
      if (param1GameInfo == null)
        return; 
      this.game_id = param1GameInfo.game_id;
      this.game_name = param1GameInfo.game_name;
      this.game_type = param1GameInfo.game_type;
      this.icon_url = param1GameInfo.icon_url;
      this.player_num = param1GameInfo.player_num;
      this.package_link = param1GameInfo.package_link;
      this.package_size = param1GameInfo.package_size;
      this.game_link = param1GameInfo.game_link;
      this.mark = param1GameInfo.mark;
      this.apple_id = param1GameInfo.apple_id;
      this.bundle_id = param1GameInfo.bundle_id;
      this.schema_url = param1GameInfo.schema_url;
      this.game_pic = Message.copyOf(param1GameInfo.game_pic);
      this.introduce = param1GameInfo.introduce;
      this.launch_component = param1GameInfo.launch_component;
      this.andr_pk_name = param1GameInfo.andr_pk_name;
      this.day_downloads = param1GameInfo.day_downloads;
      this.secret_key = param1GameInfo.secret_key;
      this.superscript_color = param1GameInfo.superscript_color;
      this.star = param1GameInfo.star;
      this.category_id = param1GameInfo.category_id;
      this.category_name = param1GameInfo.category_name;
      this.version = param1GameInfo.version;
      this.deadline = param1GameInfo.deadline;
      this.editor_rec = param1GameInfo.editor_rec;
      this._abstract = param1GameInfo._abstract;
      this.game_details_url = param1GameInfo.game_details_url;
      this.app_id = param1GameInfo.app_id;
      this.icon_pic1 = param1GameInfo.icon_pic1;
      this.icon_pic2 = param1GameInfo.icon_pic2;
      this.icon_pic3 = param1GameInfo.icon_pic3;
      this.game_desc = param1GameInfo.game_desc;
      this.subscript_color = param1GameInfo.subscript_color;
      this.launchComponent = param1GameInfo.launchComponent;
      this.category_name_sim = param1GameInfo.category_name_sim;
      this.score = param1GameInfo.score;
    }
    
    public GameInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GameInfo)interceptResult.objValue; 
      } 
      return new GameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
