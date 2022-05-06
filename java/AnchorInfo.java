import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AnchorInfo;
import tbclient.ZhiBoInfoTW;

public final class AnchorInfo extends Message {
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final String DEFAULT_AUTHOR_NAME = "";
  
  public static final String DEFAULT_FORUMNAME = "";
  
  public static final Integer DEFAULT_FROM_TYPE;
  
  public static final Long DEFAULT_GROUP_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final Integer DEFAULT_IS_VIP;
  
  public static final Integer DEFAULT_LABEL_ID;
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final Integer DEFAULT_LIKERS;
  
  public static final Integer DEFAULT_LISTENERS;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_PUBLISHERID;
  
  public static final String DEFAULT_PUBLISHERNAME = "";
  
  public static final String DEFAULT_PUBLISHERPORTRAIT = "";
  
  public static final Integer DEFAULT_START_TIME;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String author_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String forumName;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer from_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT64)
  public final Long group_id;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT32)
  public final Integer is_vip;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT32)
  public final Integer label_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer likers;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer listeners;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long publisherId;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String publisherName;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String publisherPortrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer start_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 20)
  public final ZhiBoInfoTW twzhibo_info;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(48167022, "Ltbclient/AnchorInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(48167022, "Ltbclient/AnchorInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_START_TIME = integer;
    DEFAULT_STATUS = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_LISTENERS = integer;
    DEFAULT_LIKERS = integer;
    DEFAULT_GROUP_ID = long_;
    DEFAULT_PUBLISHERID = long_;
    DEFAULT_FROM_TYPE = integer;
    DEFAULT_IS_VIP = integer;
    DEFAULT_LABEL_ID = integer;
    DEFAULT_TYPE = integer;
  }
  
  public AnchorInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str5 = paramBuilder.portrait;
      if (str5 == null) {
        this.portrait = "";
      } else {
        this.portrait = str5;
      } 
      str5 = paramBuilder.name;
      if (str5 == null) {
        this.name = "";
      } else {
        this.name = str5;
      } 
      Integer integer4 = paramBuilder.start_time;
      if (integer4 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer4;
      } 
      integer4 = paramBuilder.status;
      if (integer4 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer4;
      } 
      Long long_3 = paramBuilder.author_id;
      if (long_3 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_3;
      } 
      String str4 = paramBuilder.author_name;
      if (str4 == null) {
        this.author_name = "";
      } else {
        this.author_name = str4;
      } 
      Integer integer3 = paramBuilder.listeners;
      if (integer3 == null) {
        this.listeners = DEFAULT_LISTENERS;
      } else {
        this.listeners = integer3;
      } 
      integer3 = paramBuilder.likers;
      if (integer3 == null) {
        this.likers = DEFAULT_LIKERS;
      } else {
        this.likers = integer3;
      } 
      Long long_2 = paramBuilder.group_id;
      if (long_2 == null) {
        this.group_id = DEFAULT_GROUP_ID;
      } else {
        this.group_id = long_2;
      } 
      String str3 = paramBuilder.intro;
      if (str3 == null) {
        this.intro = "";
      } else {
        this.intro = str3;
      } 
      str3 = paramBuilder.publisherPortrait;
      if (str3 == null) {
        this.publisherPortrait = "";
      } else {
        this.publisherPortrait = str3;
      } 
      str3 = paramBuilder.publisherName;
      if (str3 == null) {
        this.publisherName = "";
      } else {
        this.publisherName = str3;
      } 
      Long long_1 = paramBuilder.publisherId;
      if (long_1 == null) {
        this.publisherId = DEFAULT_PUBLISHERID;
      } else {
        this.publisherId = long_1;
      } 
      String str2 = paramBuilder.forumName;
      if (str2 == null) {
        this.forumName = "";
      } else {
        this.forumName = str2;
      } 
      Integer integer2 = paramBuilder.from_type;
      if (integer2 == null) {
        this.from_type = DEFAULT_FROM_TYPE;
      } else {
        this.from_type = integer2;
      } 
      integer2 = paramBuilder.is_vip;
      if (integer2 == null) {
        this.is_vip = DEFAULT_IS_VIP;
      } else {
        this.is_vip = integer2;
      } 
      integer2 = paramBuilder.label_id;
      if (integer2 == null) {
        this.label_id = DEFAULT_LABEL_ID;
      } else {
        this.label_id = integer2;
      } 
      String str1 = paramBuilder.label_name;
      if (str1 == null) {
        this.label_name = "";
      } else {
        this.label_name = str1;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      this.twzhibo_info = paramBuilder.twzhibo_info;
    } else {
      this.portrait = paramBuilder.portrait;
      this.name = paramBuilder.name;
      this.start_time = paramBuilder.start_time;
      this.status = paramBuilder.status;
      this.author_id = paramBuilder.author_id;
      this.author_name = paramBuilder.author_name;
      this.listeners = paramBuilder.listeners;
      this.likers = paramBuilder.likers;
      this.group_id = paramBuilder.group_id;
      this.intro = paramBuilder.intro;
      this.publisherPortrait = paramBuilder.publisherPortrait;
      this.publisherName = paramBuilder.publisherName;
      this.publisherId = paramBuilder.publisherId;
      this.forumName = paramBuilder.forumName;
      this.from_type = paramBuilder.from_type;
      this.is_vip = paramBuilder.is_vip;
      this.label_id = paramBuilder.label_id;
      this.label_name = paramBuilder.label_name;
      this.type = paramBuilder.type;
      this.twzhibo_info = paramBuilder.twzhibo_info;
    } 
  }
}
