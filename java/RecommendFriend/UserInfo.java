package RecommendFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RecommendFriend.LbsInfo;
import tbclient.RecommendFriend.ShowIcon;

public final class UserInfo extends Message {
  public static final Integer DEFAULT_DISTANCE;
  
  public static final Long DEFAULT_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_SEX;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer distance;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 8)
  public final LbsInfo location;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer sex;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 7)
  public final ShowIcon tshow_icon;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SEX = integer;
    DEFAULT_DISTANCE = integer;
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Integer integer = paramBuilder.sex;
      if (integer == null) {
        this.sex = DEFAULT_SEX;
      } else {
        this.sex = integer;
      } 
      integer = paramBuilder.distance;
      if (integer == null) {
        this.distance = DEFAULT_DISTANCE;
      } else {
        this.distance = integer;
      } 
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      this.tshow_icon = paramBuilder.tshow_icon;
      this.location = paramBuilder.location;
      str1 = paramBuilder.tag_name;
      if (str1 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str1;
      } 
      str1 = paramBuilder.st_type;
      if (str1 == null) {
        this.st_type = "";
      } else {
        this.st_type = str1;
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.portrait = ((Builder)str).portrait;
      this.name = ((Builder)str).name;
      this.sex = ((Builder)str).sex;
      this.distance = ((Builder)str).distance;
      this.intro = ((Builder)str).intro;
      this.tshow_icon = ((Builder)str).tshow_icon;
      this.location = ((Builder)str).location;
      this.tag_name = ((Builder)str).tag_name;
      this.st_type = ((Builder)str).st_type;
      this.message = ((Builder)str).message;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1868889379, "Ltbclient/RecommendFriend/UserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1868889379, "Ltbclient/RecommendFriend/UserInfo;");
          return;
        } 
      } 
    } 
  }
}
