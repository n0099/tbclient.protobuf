package GetForumClassList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecommendForumClass extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_FORUM_CLASS_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_RECOMMEND_IMAGE_URL = "";
  
  public static final String DEFAULT_RECOMMEND_TITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long forum_class_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recommend_image_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recommend_title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  public RecommendForumClass(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.recommend_title;
      if (str2 == null) {
        this.recommend_title = "";
      } else {
        this.recommend_title = str2;
      } 
      str2 = paramBuilder.recommend_image_url;
      if (str2 == null) {
        this.recommend_image_url = "";
      } else {
        this.recommend_image_url = str2;
      } 
      str2 = paramBuilder.link_url;
      if (str2 == null) {
        this.link_url = "";
      } else {
        this.link_url = str2;
      } 
      Long long_ = paramBuilder.forum_class_id;
      if (long_ == null) {
        this.forum_class_id = DEFAULT_FORUM_CLASS_ID;
      } else {
        this.forum_class_id = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      str = paramBuilder.image_url;
      if (str == null) {
        this.image_url = "";
      } else {
        this.image_url = str;
      } 
    } else {
      this.recommend_title = ((Builder)str).recommend_title;
      this.recommend_image_url = ((Builder)str).recommend_image_url;
      this.link_url = ((Builder)str).link_url;
      this.forum_class_id = ((Builder)str).forum_class_id;
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.image_url = ((Builder)str).image_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1706871286, "Ltbclient/GetForumClassList/RecommendForumClass;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1706871286, "Ltbclient/GetForumClassList/RecommendForumClass;");
          return;
        } 
      } 
    } 
  }
}
