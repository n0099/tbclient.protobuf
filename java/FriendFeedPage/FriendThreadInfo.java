package FriendFeedPage;

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
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.Media;
import tbclient.MediaNum;
import tbclient.User;
import tbclient.Voice;
import tbclient.Zan;

public final class FriendThreadInfo extends Message {
  public static final List<Abstract> DEFAULT_ABSTRACT;
  
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final Long DEFAULT_FID;
  
  public static final Long DEFAULT_FIRST_POST_ID;
  
  public static final String DEFAULT_FNAME = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_GOOD;
  
  public static final Integer DEFAULT_IS_LIVEPOST;
  
  public static final Integer DEFAULT_IS_MEMBERTOP;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_TOP;
  
  public static final Integer DEFAULT_IS_VOICE_THREAD;
  
  public static final Integer DEFAULT_LAST_TIME_INT;
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final List<MediaNum> DEFAULT_MEDIA_NUM;
  
  public static final Integer DEFAULT_REPLY_NUM;
  
  public static final Long DEFAULT_THREAD_TYPE;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TIMELINE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final List<Voice> DEFAULT_VOICE_INFO;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 14)
  public final List<Abstract> _abstract;
  
  @ProtoField(tag = 23)
  public final AnchorInfo anchor_info;
  
  @ProtoField(tag = 20)
  public final Anti anti;
  
  @ProtoField(tag = 11)
  public final User author;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 21, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT64)
  public final Long first_post_id;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String fname;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_good;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_livepost;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_membertop;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_top;
  
  @ProtoField(tag = 24, type = Message.Datatype.INT32)
  public final Integer is_voice_thread;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer last_time_int;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 15)
  public final List<Media> media;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<MediaNum> media_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer reply_num;
  
  @ProtoField(tag = 25, type = Message.Datatype.UINT64)
  public final Long thread_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String timeline;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<Voice> voice_info;
  
  @ProtoField(tag = 19)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(270462379, "Ltbclient/FriendFeedPage/FriendThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(270462379, "Ltbclient/FriendFeedPage/FriendThreadInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_TID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_REPLY_NUM = integer;
    DEFAULT_LAST_TIME_INT = integer;
    DEFAULT_IS_TOP = integer;
    DEFAULT_IS_MEMBERTOP = integer;
    DEFAULT_IS_GOOD = integer;
    DEFAULT_IS_LIVEPOST = integer;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_ABSTRACT = Collections.emptyList();
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_MEDIA_NUM = Collections.emptyList();
    DEFAULT_VOICE_INFO = Collections.emptyList();
    DEFAULT_FIRST_POST_ID = long_;
    DEFAULT_FID = long_;
    DEFAULT_IS_VOICE_THREAD = integer;
    DEFAULT_THREAD_TYPE = long_;
  }
  
  public FriendThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      long_3 = paramBuilder.tid;
      if (long_3 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_3;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Integer integer3 = paramBuilder.reply_num;
      if (integer3 == null) {
        this.reply_num = DEFAULT_REPLY_NUM;
      } else {
        this.reply_num = integer3;
      } 
      integer3 = paramBuilder.last_time_int;
      if (integer3 == null) {
        this.last_time_int = DEFAULT_LAST_TIME_INT;
      } else {
        this.last_time_int = integer3;
      } 
      integer3 = paramBuilder.is_top;
      if (integer3 == null) {
        this.is_top = DEFAULT_IS_TOP;
      } else {
        this.is_top = integer3;
      } 
      integer3 = paramBuilder.is_membertop;
      if (integer3 == null) {
        this.is_membertop = DEFAULT_IS_MEMBERTOP;
      } else {
        this.is_membertop = integer3;
      } 
      integer3 = paramBuilder.is_good;
      if (integer3 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer3;
      } 
      integer3 = paramBuilder.is_livepost;
      if (integer3 == null) {
        this.is_livepost = DEFAULT_IS_LIVEPOST;
      } else {
        this.is_livepost = integer3;
      } 
      Long long_2 = paramBuilder.author_id;
      if (long_2 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_2;
      } 
      this.author = paramBuilder.author;
      Integer integer2 = paramBuilder.is_ntitle;
      if (integer2 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer2;
      } 
      String str2 = paramBuilder.timeline;
      if (str2 == null) {
        this.timeline = "";
      } else {
        this.timeline = str2;
      } 
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
      Long long_1 = paramBuilder.first_post_id;
      if (long_1 == null) {
        this.first_post_id = DEFAULT_FIRST_POST_ID;
      } else {
        this.first_post_id = long_1;
      } 
      this.zan = paramBuilder.zan;
      this.anti = paramBuilder.anti;
      long_1 = paramBuilder.fid;
      if (long_1 == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_1;
      } 
      String str1 = paramBuilder.fname;
      if (str1 == null) {
        this.fname = "";
      } else {
        this.fname = str1;
      } 
      this.anchor_info = paramBuilder.anchor_info;
      Integer integer1 = paramBuilder.is_voice_thread;
      if (integer1 == null) {
        this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
      } else {
        this.is_voice_thread = integer1;
      } 
      long_ = paramBuilder.thread_type;
      if (long_ == null) {
        this.thread_type = DEFAULT_THREAD_TYPE;
      } else {
        this.thread_type = long_;
      } 
    } else {
      this.id = ((Builder)long_).id;
      this.tid = ((Builder)long_).tid;
      this.title = ((Builder)long_).title;
      this.reply_num = ((Builder)long_).reply_num;
      this.last_time_int = ((Builder)long_).last_time_int;
      this.is_top = ((Builder)long_).is_top;
      this.is_membertop = ((Builder)long_).is_membertop;
      this.is_good = ((Builder)long_).is_good;
      this.is_livepost = ((Builder)long_).is_livepost;
      this.author_id = ((Builder)long_).author_id;
      this.author = ((Builder)long_).author;
      this.is_ntitle = ((Builder)long_).is_ntitle;
      this.timeline = ((Builder)long_).timeline;
      this._abstract = Message.immutableCopyOf(((Builder)long_)._abstract);
      this.media = Message.immutableCopyOf(((Builder)long_).media);
      this.media_num = Message.immutableCopyOf(((Builder)long_).media_num);
      this.voice_info = Message.immutableCopyOf(((Builder)long_).voice_info);
      this.first_post_id = ((Builder)long_).first_post_id;
      this.zan = ((Builder)long_).zan;
      this.anti = ((Builder)long_).anti;
      this.fid = ((Builder)long_).fid;
      this.fname = ((Builder)long_).fname;
      this.anchor_info = ((Builder)long_).anchor_info;
      this.is_voice_thread = ((Builder)long_).is_voice_thread;
      this.thread_type = ((Builder)long_).thread_type;
    } 
  }
}
