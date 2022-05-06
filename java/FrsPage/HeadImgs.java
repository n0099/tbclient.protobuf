package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HeadImgs extends Message {
  public static final String DEFAULT_BTN_TEXT = "";
  
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
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final String DEFAULT_SUBTITLE = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_text;
  
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
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_SECOND_PAGE = integer;
    DEFAULT_DOWNLOAD_IS_THIRDPAGE = integer;
    DEFAULT_DOWNLOAD_ITEM_ID = integer;
  }
  
  public HeadImgs(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.img_url;
      if (str3 == null) {
        this.img_url = "";
      } else {
        this.img_url = str3;
      } 
      str3 = paramBuilder.pc_url;
      if (str3 == null) {
        this.pc_url = "";
      } else {
        this.pc_url = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.subtitle;
      if (str3 == null) {
        this.subtitle = "";
      } else {
        this.subtitle = str3;
      } 
      str3 = paramBuilder.btn_text;
      if (str3 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str3;
      } 
      str3 = paramBuilder.tag_name_url;
      if (str3 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str3;
      } 
      str3 = paramBuilder.tag_name_wh;
      if (str3 == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str3;
      } 
      str3 = paramBuilder.schema;
      if (str3 == null) {
        this.schema = "";
      } else {
        this.schema = str3;
      } 
      List list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
      Integer integer3 = paramBuilder.has_second_page;
      if (integer3 == null) {
        this.has_second_page = DEFAULT_HAS_SECOND_PAGE;
      } else {
        this.has_second_page = integer3;
      } 
      String str2 = paramBuilder.package_name;
      if (str2 == null) {
        this.package_name = "";
      } else {
        this.package_name = str2;
      } 
      Integer integer2 = paramBuilder.download_is_thirdpage;
      if (integer2 == null) {
        this.download_is_thirdpage = DEFAULT_DOWNLOAD_IS_THIRDPAGE;
      } else {
        this.download_is_thirdpage = integer2;
      } 
      String str1 = paramBuilder.download_appname;
      if (str1 == null) {
        this.download_appname = "";
      } else {
        this.download_appname = str1;
      } 
      str1 = paramBuilder.download_developer;
      if (str1 == null) {
        this.download_developer = "";
      } else {
        this.download_developer = str1;
      } 
      str1 = paramBuilder.download_package_size;
      if (str1 == null) {
        this.download_package_size = "";
      } else {
        this.download_package_size = str1;
      } 
      str1 = paramBuilder.download_url;
      if (str1 == null) {
        this.download_url = "";
      } else {
        this.download_url = str1;
      } 
      str1 = paramBuilder.download_img;
      if (str1 == null) {
        this.download_img = "";
      } else {
        this.download_img = str1;
      } 
      str1 = paramBuilder.download_version;
      if (str1 == null) {
        this.download_version = "";
      } else {
        this.download_version = str1;
      } 
      str1 = paramBuilder.download_user_power;
      if (str1 == null) {
        this.download_user_power = "";
      } else {
        this.download_user_power = str1;
      } 
      str1 = paramBuilder.download_privacy_policy;
      if (str1 == null) {
        this.download_privacy_policy = "";
      } else {
        this.download_privacy_policy = str1;
      } 
      str1 = paramBuilder.download_package_name;
      if (str1 == null) {
        this.download_package_name = "";
      } else {
        this.download_package_name = str1;
      } 
      Integer integer1 = paramBuilder.download_item_id;
      if (integer1 == null) {
        this.download_item_id = DEFAULT_DOWNLOAD_ITEM_ID;
      } else {
        this.download_item_id = integer1;
      } 
      str = paramBuilder.download_appid;
      if (str == null) {
        this.download_appid = "";
      } else {
        this.download_appid = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.pc_url = ((Builder)str).pc_url;
      this.title = ((Builder)str).title;
      this.subtitle = ((Builder)str).subtitle;
      this.btn_text = ((Builder)str).btn_text;
      this.tag_name_url = ((Builder)str).tag_name_url;
      this.tag_name_wh = ((Builder)str).tag_name_wh;
      this.schema = ((Builder)str).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)str).third_statistics_url);
      this.has_second_page = ((Builder)str).has_second_page;
      this.package_name = ((Builder)str).package_name;
      this.download_is_thirdpage = ((Builder)str).download_is_thirdpage;
      this.download_appname = ((Builder)str).download_appname;
      this.download_developer = ((Builder)str).download_developer;
      this.download_package_size = ((Builder)str).download_package_size;
      this.download_url = ((Builder)str).download_url;
      this.download_img = ((Builder)str).download_img;
      this.download_version = ((Builder)str).download_version;
      this.download_user_power = ((Builder)str).download_user_power;
      this.download_privacy_policy = ((Builder)str).download_privacy_policy;
      this.download_package_name = ((Builder)str).download_package_name;
      this.download_item_id = ((Builder)str).download_item_id;
      this.download_appid = ((Builder)str).download_appid;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(412332264, "Ltbclient/FrsPage/HeadImgs;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(412332264, "Ltbclient/FrsPage/HeadImgs;");
          return;
        } 
      } 
    } 
  }
}
