package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BusinessPromot extends Message {
  public static Interceptable $ic;
  
  public static final List<BusinessPromotCommentList> DEFAULT_COMMENT_LIST;
  
  public static final String DEFAULT_COVER_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_APPID = "";
  
  public static final String DEFAULT_DOWNLOAD_APPNAME = "";
  
  public static final String DEFAULT_DOWNLOAD_DEVELOPER = "";
  
  public static final String DEFAULT_DOWNLOAD_IMG = "";
  
  public static final String DEFAULT_DOWNLOAD_ITEM_ID = "";
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_NAME = "";
  
  public static final String DEFAULT_DOWNLOAD_PACKAGE_SIZE = "";
  
  public static final String DEFAULT_DOWNLOAD_PRIVACY_POLICY = "";
  
  public static final String DEFAULT_DOWNLOAD_URL = "";
  
  public static final String DEFAULT_DOWNLOAD_USER_POWER = "";
  
  public static final String DEFAULT_DOWNLOAD_VERSION = "";
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_IMG_POPUP = "";
  
  public static final Boolean DEFAULT_IS_AD;
  
  public static final Boolean DEFAULT_IS_ALLOW_SHAKE;
  
  public static final Boolean DEFAULT_IS_DOWNLOAD;
  
  public static final Integer DEFAULT_JOIN_NUM;
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  public static final List<String> DEFAULT_THIRD_STATISTICS_URL;
  
  public static final String DEFAULT_THREAD_ID = "";
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<BusinessPromotCommentList> comment_list;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String cover_url;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String download_appid;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String download_appname;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String download_developer;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String download_img;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String download_item_id;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String download_package_name;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String download_package_size;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String download_privacy_policy;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String download_url;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String download_user_power;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String download_version;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_popup;
  
  @ProtoField(tag = 14, type = Message.Datatype.BOOL)
  public final Boolean is_ad;
  
  @ProtoField(tag = 13, type = Message.Datatype.BOOL)
  public final Boolean is_allow_shake;
  
  @ProtoField(tag = 24, type = Message.Datatype.BOOL)
  public final Boolean is_download;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer join_num;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String schema;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
  public final List<String> third_statistics_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String video_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1003384755, "Ltbclient/FrsPage/BusinessPromot;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1003384755, "Ltbclient/FrsPage/BusinessPromot;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_JOIN_NUM = integer;
    DEFAULT_COMMENT_LIST = Collections.emptyList();
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
    Boolean bool = Boolean.FALSE;
    DEFAULT_IS_ALLOW_SHAKE = bool;
    DEFAULT_IS_AD = bool;
    DEFAULT_IS_DOWNLOAD = bool;
  }
  
  public BusinessPromot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str5 = paramBuilder.title;
      if (str5 == null) {
        this.title = "";
      } else {
        this.title = str5;
      } 
      str5 = paramBuilder.img;
      if (str5 == null) {
        this.img = "";
      } else {
        this.img = str5;
      } 
      str5 = paramBuilder.img_popup;
      if (str5 == null) {
        this.img_popup = "";
      } else {
        this.img_popup = str5;
      } 
      Integer integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      String str4 = paramBuilder.thread_id;
      if (str4 == null) {
        this.thread_id = "";
      } else {
        this.thread_id = str4;
      } 
      str4 = paramBuilder.url;
      if (str4 == null) {
        this.url = "";
      } else {
        this.url = str4;
      } 
      Integer integer2 = paramBuilder.join_num;
      if (integer2 == null) {
        this.join_num = DEFAULT_JOIN_NUM;
      } else {
        this.join_num = integer2;
      } 
      List<BusinessPromotCommentList> list1 = paramBuilder.comment_list;
      if (list1 == null) {
        this.comment_list = DEFAULT_COMMENT_LIST;
      } else {
        this.comment_list = Message.immutableCopyOf(list1);
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      Integer integer1 = paramBuilder.thread_type;
      if (integer1 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer1;
      } 
      String str3 = paramBuilder.schema;
      if (str3 == null) {
        this.schema = "";
      } else {
        this.schema = str3;
      } 
      List<String> list = paramBuilder.third_statistics_url;
      if (list == null) {
        this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
      } else {
        this.third_statistics_url = Message.immutableCopyOf(list);
      } 
      Boolean bool2 = paramBuilder.is_allow_shake;
      if (bool2 == null) {
        this.is_allow_shake = DEFAULT_IS_ALLOW_SHAKE;
      } else {
        this.is_allow_shake = bool2;
      } 
      bool2 = paramBuilder.is_ad;
      if (bool2 == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = bool2;
      } 
      String str2 = paramBuilder.package_name;
      if (str2 == null) {
        this.package_name = "";
      } else {
        this.package_name = str2;
      } 
      str2 = paramBuilder.download_appname;
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
      str2 = paramBuilder.download_privacy_policy;
      if (str2 == null) {
        this.download_privacy_policy = "";
      } else {
        this.download_privacy_policy = str2;
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
      Boolean bool1 = paramBuilder.is_download;
      if (bool1 == null) {
        this.is_download = DEFAULT_IS_DOWNLOAD;
      } else {
        this.is_download = bool1;
      } 
      String str1 = paramBuilder.download_item_id;
      if (str1 == null) {
        this.download_item_id = "";
      } else {
        this.download_item_id = str1;
      } 
      str1 = paramBuilder.download_package_name;
      if (str1 == null) {
        this.download_package_name = "";
      } else {
        this.download_package_name = str1;
      } 
      str1 = paramBuilder.download_appid;
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
      str = paramBuilder.video_url;
      if (str == null) {
        this.video_url = "";
      } else {
        this.video_url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.img = ((Builder)str).img;
      this.img_popup = ((Builder)str).img_popup;
      this.type = ((Builder)str).type;
      this.thread_id = ((Builder)str).thread_id;
      this.url = ((Builder)str).url;
      this.join_num = ((Builder)str).join_num;
      this.comment_list = Message.immutableCopyOf(((Builder)str).comment_list);
      this.id = ((Builder)str).id;
      this.thread_type = ((Builder)str).thread_type;
      this.schema = ((Builder)str).schema;
      this.third_statistics_url = Message.immutableCopyOf(((Builder)str).third_statistics_url);
      this.is_allow_shake = ((Builder)str).is_allow_shake;
      this.is_ad = ((Builder)str).is_ad;
      this.package_name = ((Builder)str).package_name;
      this.download_appname = ((Builder)str).download_appname;
      this.download_developer = ((Builder)str).download_developer;
      this.download_package_size = ((Builder)str).download_package_size;
      this.download_privacy_policy = ((Builder)str).download_privacy_policy;
      this.download_url = ((Builder)str).download_url;
      this.download_img = ((Builder)str).download_img;
      this.download_version = ((Builder)str).download_version;
      this.download_user_power = ((Builder)str).download_user_power;
      this.is_download = ((Builder)str).is_download;
      this.download_item_id = ((Builder)str).download_item_id;
      this.download_package_name = ((Builder)str).download_package_name;
      this.download_appid = ((Builder)str).download_appid;
      this.cover_url = ((Builder)str).cover_url;
      this.video_url = ((Builder)str).video_url;
    } 
  }
  
  public BusinessPromot(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BusinessPromot> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<BusinessPromotCommentList> comment_list;
    
    public String cover_url;
    
    public String download_appid;
    
    public String download_appname;
    
    public String download_developer;
    
    public String download_img;
    
    public String download_item_id;
    
    public String download_package_name;
    
    public String download_package_size;
    
    public String download_privacy_policy;
    
    public String download_url;
    
    public String download_user_power;
    
    public String download_version;
    
    public Long id;
    
    public String img;
    
    public String img_popup;
    
    public Boolean is_ad;
    
    public Boolean is_allow_shake;
    
    public Boolean is_download;
    
    public Integer join_num;
    
    public String package_name;
    
    public String schema;
    
    public List<String> third_statistics_url;
    
    public String thread_id;
    
    public Integer thread_type;
    
    public String title;
    
    public Integer type;
    
    public String url;
    
    public String video_url;
    
    public Builder() {}
    
    public Builder(BusinessPromot param1BusinessPromot) {
      super(param1BusinessPromot);
      if (param1BusinessPromot == null)
        return; 
      this.title = param1BusinessPromot.title;
      this.img = param1BusinessPromot.img;
      this.img_popup = param1BusinessPromot.img_popup;
      this.type = param1BusinessPromot.type;
      this.thread_id = param1BusinessPromot.thread_id;
      this.url = param1BusinessPromot.url;
      this.join_num = param1BusinessPromot.join_num;
      this.comment_list = Message.copyOf(param1BusinessPromot.comment_list);
      this.id = param1BusinessPromot.id;
      this.thread_type = param1BusinessPromot.thread_type;
      this.schema = param1BusinessPromot.schema;
      this.third_statistics_url = Message.copyOf(param1BusinessPromot.third_statistics_url);
      this.is_allow_shake = param1BusinessPromot.is_allow_shake;
      this.is_ad = param1BusinessPromot.is_ad;
      this.package_name = param1BusinessPromot.package_name;
      this.download_appname = param1BusinessPromot.download_appname;
      this.download_developer = param1BusinessPromot.download_developer;
      this.download_package_size = param1BusinessPromot.download_package_size;
      this.download_privacy_policy = param1BusinessPromot.download_privacy_policy;
      this.download_url = param1BusinessPromot.download_url;
      this.download_img = param1BusinessPromot.download_img;
      this.download_version = param1BusinessPromot.download_version;
      this.download_user_power = param1BusinessPromot.download_user_power;
      this.is_download = param1BusinessPromot.is_download;
      this.download_item_id = param1BusinessPromot.download_item_id;
      this.download_package_name = param1BusinessPromot.download_package_name;
      this.download_appid = param1BusinessPromot.download_appid;
      this.cover_url = param1BusinessPromot.cover_url;
      this.video_url = param1BusinessPromot.video_url;
    }
    
    public BusinessPromot build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BusinessPromot)interceptResult.objValue; 
      } 
      return new BusinessPromot(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
