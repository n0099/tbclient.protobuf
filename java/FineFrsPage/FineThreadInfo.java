package FineFrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ZhiBoInfoTW;

public final class FineThreadInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Integer DEFAULT_FORDER;
  
  public static final Long DEFAULT_FORUMID;
  
  public static final String DEFAULT_FROMFNAME = "";
  
  public static final Long DEFAULT_FTID;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final String DEFAULT_TAG = "";
  
  public static final Long DEFAULT_THREADSNUM;
  
  public static final Integer DEFAULT_THREAD_TYPE;
  
  public static final List<String> DEFAULT_THUMBNAIL;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_ZANSUM;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer forder;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT64)
  public final Long forumid;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String fromfname;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String tag;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer thread_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long threadsnum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> thumbnail;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 12)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long zansum;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1511499476, "Ltbclient/FineFrsPage/FineThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1511499476, "Ltbclient/FineFrsPage/FineThreadInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FTID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_THUMBNAIL = Collections.emptyList();
    DEFAULT_PUBLISH_TIME = integer;
    DEFAULT_ZANSUM = long_;
    DEFAULT_THREADSNUM = long_;
    DEFAULT_FORUMID = long_;
    DEFAULT_THREAD_TYPE = integer;
    DEFAULT_FORDER = integer;
  }
  
  public FineThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.ftid;
      if (long_3 == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_3;
      } 
      String str4 = paramBuilder.title;
      if (str4 == null) {
        this.title = "";
      } else {
        this.title = str4;
      } 
      Integer integer3 = paramBuilder.type;
      if (integer3 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer3;
      } 
      String str3 = paramBuilder._abstract;
      if (str3 == null) {
        this._abstract = "";
      } else {
        this._abstract = str3;
      } 
      List list = paramBuilder.thumbnail;
      if (list == null) {
        this.thumbnail = DEFAULT_THUMBNAIL;
      } else {
        this.thumbnail = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.publish_time;
      if (integer2 == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer2;
      } 
      String str2 = paramBuilder.tag;
      if (str2 == null) {
        this.tag = "";
      } else {
        this.tag = str2;
      } 
      Long long_2 = paramBuilder.zansum;
      if (long_2 == null) {
        this.zansum = DEFAULT_ZANSUM;
      } else {
        this.zansum = long_2;
      } 
      long_2 = paramBuilder.threadsnum;
      if (long_2 == null) {
        this.threadsnum = DEFAULT_THREADSNUM;
      } else {
        this.threadsnum = long_2;
      } 
      String str1 = paramBuilder.fromfname;
      if (str1 == null) {
        this.fromfname = "";
      } else {
        this.fromfname = str1;
      } 
      Long long_1 = paramBuilder.forumid;
      if (long_1 == null) {
        this.forumid = DEFAULT_FORUMID;
      } else {
        this.forumid = long_1;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
      Integer integer1 = paramBuilder.thread_type;
      if (integer1 == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = integer1;
      } 
      integer = paramBuilder.forder;
      if (integer == null) {
        this.forder = DEFAULT_FORDER;
      } else {
        this.forder = integer;
      } 
    } else {
      this.ftid = ((Builder)integer).ftid;
      this.title = ((Builder)integer).title;
      this.type = ((Builder)integer).type;
      this._abstract = ((Builder)integer)._abstract;
      this.thumbnail = Message.immutableCopyOf(((Builder)integer).thumbnail);
      this.publish_time = ((Builder)integer).publish_time;
      this.tag = ((Builder)integer).tag;
      this.zansum = ((Builder)integer).zansum;
      this.threadsnum = ((Builder)integer).threadsnum;
      this.fromfname = ((Builder)integer).fromfname;
      this.forumid = ((Builder)integer).forumid;
      this.twzhibo_info = ((Builder)integer).twzhibo_info;
      this.thread_type = ((Builder)integer).thread_type;
      this.forder = ((Builder)integer).forder;
    } 
  }
}
