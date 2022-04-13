import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Agree;
import tbclient.Lbs;
import tbclient.PbContent;
import tbclient.SubPostList;
import tbclient.User;

public final class SubPostList extends Message {
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final Integer DEFAULT_IS_FAKE_TOP;
  
  public static final Integer DEFAULT_IS_GIFTPOST;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 9)
  public final Agree agree;
  
  @ProtoField(tag = 7)
  public final User author;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbContent> content;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_fake_top;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_giftpost;
  
  @ProtoField(tag = 10)
  public final Lbs location;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1754025433, "Ltbclient/SubPostList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1754025433, "Ltbclient/SubPostList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    DEFAULT_CONTENT = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_FLOOR = integer;
    DEFAULT_IS_GIFTPOST = integer;
    DEFAULT_IS_FAKE_TOP = integer;
    DEFAULT_IS_AUTHOR_VIEW = integer;
  }
  
  public SubPostList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.id;
      if (long_2 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_2;
      } 
      List list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      Integer integer2 = paramBuilder.time;
      if (integer2 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer2;
      } 
      Long long_1 = paramBuilder.author_id;
      if (long_1 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_1;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Integer integer1 = paramBuilder.floor;
      if (integer1 == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer1;
      } 
      this.author = paramBuilder.author;
      integer1 = paramBuilder.is_giftpost;
      if (integer1 == null) {
        this.is_giftpost = DEFAULT_IS_GIFTPOST;
      } else {
        this.is_giftpost = integer1;
      } 
      this.agree = paramBuilder.agree;
      this.location = paramBuilder.location;
      integer1 = paramBuilder.is_fake_top;
      if (integer1 == null) {
        this.is_fake_top = DEFAULT_IS_FAKE_TOP;
      } else {
        this.is_fake_top = integer1;
      } 
      integer = paramBuilder.is_author_view;
      if (integer == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer;
      } 
    } else {
      this.id = ((Builder)integer).id;
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.time = ((Builder)integer).time;
      this.author_id = ((Builder)integer).author_id;
      this.title = ((Builder)integer).title;
      this.floor = ((Builder)integer).floor;
      this.author = ((Builder)integer).author;
      this.is_giftpost = ((Builder)integer).is_giftpost;
      this.agree = ((Builder)integer).agree;
      this.location = ((Builder)integer).location;
      this.is_fake_top = ((Builder)integer).is_fake_top;
      this.is_author_view = ((Builder)integer).is_author_view;
    } 
  }
}
