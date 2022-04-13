package GetThreadListByUid;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Media;

public final class FineThreadInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Long DEFAULT_FTID = Long.valueOf(0L);
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<Media> media;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_PUBLISH_TIME = integer;
  }
  
  public FineThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.ftid;
      if (long_ == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      String str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      List list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.publish_time;
      if (integer == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer;
      } 
    } else {
      this.ftid = ((Builder)integer).ftid;
      this.title = ((Builder)integer).title;
      this.type = ((Builder)integer).type;
      this._abstract = ((Builder)integer)._abstract;
      this.media = Message.immutableCopyOf(((Builder)integer).media);
      this.publish_time = ((Builder)integer).publish_time;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-559919905, "Ltbclient/GetThreadListByUid/FineThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-559919905, "Ltbclient/GetThreadListByUid/FineThreadInfo;");
          return;
        } 
      } 
    } 
  }
}
