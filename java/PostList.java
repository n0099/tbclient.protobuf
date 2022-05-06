import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Abstract;
import tbclient.Agree;
import tbclient.Media;
import tbclient.MediaNum;
import tbclient.PostList;
import tbclient.User;
import tbclient.Voice;

public final class PostList extends Message {
  public static final List<Abstract> DEFAULT_ABSTRACT;
  
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final Long DEFAULT_ID;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final List<MediaNum> DEFAULT_MEDIA_NUM;
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Abstract> _abstract;
  
  @ProtoField(tag = 8)
  public final Agree agree;
  
  @ProtoField(tag = 2)
  public final User author;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<Media> media;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<MediaNum> media_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<Voice> voice_info;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1888455923, "Ltbclient/PostList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1888455923, "Ltbclient/PostList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_ABSTRACT = Collections.emptyList();
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_MEDIA_NUM = Collections.emptyList();
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_AUTHOR_ID = long_;
  }
  
  public PostList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      this.author = paramBuilder.author;
      List list = paramBuilder._abstract;
      if (list == null) {
        this._abstract = DEFAULT_ABSTRACT;
      } else {
        this._abstract = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.media_num;
      if (list == null) {
        this.media_num = DEFAULT_MEDIA_NUM;
      } else {
        this.media_num = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.voice_info;
      if (list == null) {
        this.voice_info = DEFAULT_VOICE_INFO;
      } else {
        this.voice_info = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.author_id;
      if (long_1 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_1;
      } 
      this.agree = paramBuilder.agree;
    } else {
      this.id = paramBuilder.id;
      this.author = paramBuilder.author;
      this._abstract = Message.immutableCopyOf(paramBuilder._abstract);
      this.media = Message.immutableCopyOf(paramBuilder.media);
      this.media_num = Message.immutableCopyOf(paramBuilder.media_num);
      this.voice_info = Message.immutableCopyOf(paramBuilder.voice_info);
      this.author_id = paramBuilder.author_id;
      this.agree = paramBuilder.agree;
    } 
  }
}
