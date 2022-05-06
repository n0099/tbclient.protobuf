package HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotVideoItem extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_THUMBNAIL_URL = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VIDEO_DURATION = "";
  
  public static final String DEFAULT_VIDEO_MD5 = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String thumbnail_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String video_duration;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String video_md5;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_url;
  
  public HotVideoItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
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
      str1 = paramBuilder.thumbnail_url;
      if (str1 == null) {
        this.thumbnail_url = "";
      } else {
        this.thumbnail_url = str1;
      } 
      str1 = paramBuilder.video_url;
      if (str1 == null) {
        this.video_url = "";
      } else {
        this.video_url = str1;
      } 
      str1 = paramBuilder.video_duration;
      if (str1 == null) {
        this.video_duration = "";
      } else {
        this.video_duration = str1;
      } 
      str = paramBuilder.video_md5;
      if (str == null) {
        this.video_md5 = "";
      } else {
        this.video_md5 = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.thumbnail_url = ((Builder)str).thumbnail_url;
      this.video_url = ((Builder)str).video_url;
      this.video_duration = ((Builder)str).video_duration;
      this.video_md5 = ((Builder)str).video_md5;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1211506947, "Ltbclient/HomePage/HotVideoItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1211506947, "Ltbclient/HomePage/HotVideoItem;");
          return;
        } 
      } 
    } 
  }
}
