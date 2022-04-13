package ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ExcPbPage.ExcContent;
import tbclient.ExcPbPage.ZanInfo;
import tbclient.ExcPbPage.postForumInfo;

public final class ExcellentPbThreadInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_ABTEST = "";
  
  public static final List<ExcContent> DEFAULT_CONTENT;
  
  public static final Long DEFAULT_EXCID;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final Integer DEFAULT_SOURCE;
  
  public static final Long DEFAULT_TAG_CODE;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String abtest;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ExcContent> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long excid;
  
  @ProtoField(tag = 8)
  public final postForumInfo forum;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT64)
  public final Long post_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer source;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tag_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 13)
  public final ZanInfo zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-918376829, "Ltbclient/ExcPbPage/ExcellentPbThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-918376829, "Ltbclient/ExcPbPage/ExcellentPbThreadInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_EXCID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_TAG_CODE = long_;
    DEFAULT_CONTENT = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_SOURCE = integer;
    DEFAULT_PUBLISH_TIME = integer;
    DEFAULT_POST_ID = long_;
    DEFAULT_POST_NUM = long_;
  }
  
  public ExcellentPbThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.excid;
      if (long_2 == null) {
        this.excid = DEFAULT_EXCID;
      } else {
        this.excid = long_2;
      } 
      long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.tag_code;
      if (long_2 == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_2;
      } 
      String str2 = paramBuilder.tag_name;
      if (str2 == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      List list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      this.forum = paramBuilder.forum;
      String str1 = paramBuilder.abtest;
      if (str1 == null) {
        this.abtest = "";
      } else {
        this.abtest = str1;
      } 
      Integer integer = paramBuilder.source;
      if (integer == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer;
      } 
      integer = paramBuilder.publish_time;
      if (integer == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer;
      } 
      Long long_1 = paramBuilder.post_id;
      if (long_1 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_1;
      } 
      this.zan = paramBuilder.zan;
      long_ = paramBuilder.post_num;
      if (long_ == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_;
      } 
    } else {
      this.excid = ((Builder)long_).excid;
      this.thread_id = ((Builder)long_).thread_id;
      this.tag_code = ((Builder)long_).tag_code;
      this.tag_name = ((Builder)long_).tag_name;
      this.title = ((Builder)long_).title;
      this._abstract = ((Builder)long_)._abstract;
      this.content = Message.immutableCopyOf(((Builder)long_).content);
      this.forum = ((Builder)long_).forum;
      this.abtest = ((Builder)long_).abtest;
      this.source = ((Builder)long_).source;
      this.publish_time = ((Builder)long_).publish_time;
      this.post_id = ((Builder)long_).post_id;
      this.zan = ((Builder)long_).zan;
      this.post_num = ((Builder)long_).post_num;
    } 
  }
}
