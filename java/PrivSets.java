import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PrivSets;

public final class PrivSets extends Message {
  public static final Integer DEFAULT_BAZHU_SHOW_INSIDE;
  
  public static final Integer DEFAULT_BAZHU_SHOW_OUTSIDE;
  
  public static final Integer DEFAULT_FRIEND;
  
  public static final Integer DEFAULT_GROUP;
  
  public static final Integer DEFAULT_LIKE;
  
  public static final Integer DEFAULT_LIVE;
  
  public static final Integer DEFAULT_LOCATION;
  
  public static final Integer DEFAULT_POST;
  
  public static final Integer DEFAULT_REPLY;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer bazhu_show_inside;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer bazhu_show_outside;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer friend;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer group;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer like;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer live;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer location;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer post;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer reply;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1694545167, "Ltbclient/PrivSets;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1694545167, "Ltbclient/PrivSets;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOCATION = integer;
    DEFAULT_LIKE = integer;
    DEFAULT_GROUP = integer;
    DEFAULT_POST = integer;
    DEFAULT_FRIEND = integer;
    DEFAULT_LIVE = integer;
    DEFAULT_REPLY = integer;
    DEFAULT_BAZHU_SHOW_INSIDE = integer;
    DEFAULT_BAZHU_SHOW_OUTSIDE = integer;
  }
  
  public PrivSets(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.location;
      if (integer1 == null) {
        this.location = DEFAULT_LOCATION;
      } else {
        this.location = integer1;
      } 
      integer1 = paramBuilder.like;
      if (integer1 == null) {
        this.like = DEFAULT_LIKE;
      } else {
        this.like = integer1;
      } 
      integer1 = paramBuilder.group;
      if (integer1 == null) {
        this.group = DEFAULT_GROUP;
      } else {
        this.group = integer1;
      } 
      integer1 = paramBuilder.post;
      if (integer1 == null) {
        this.post = DEFAULT_POST;
      } else {
        this.post = integer1;
      } 
      integer1 = paramBuilder.friend;
      if (integer1 == null) {
        this.friend = DEFAULT_FRIEND;
      } else {
        this.friend = integer1;
      } 
      integer1 = paramBuilder.live;
      if (integer1 == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = integer1;
      } 
      integer1 = paramBuilder.reply;
      if (integer1 == null) {
        this.reply = DEFAULT_REPLY;
      } else {
        this.reply = integer1;
      } 
      integer1 = paramBuilder.bazhu_show_inside;
      if (integer1 == null) {
        this.bazhu_show_inside = DEFAULT_BAZHU_SHOW_INSIDE;
      } else {
        this.bazhu_show_inside = integer1;
      } 
      integer = paramBuilder.bazhu_show_outside;
      if (integer == null) {
        this.bazhu_show_outside = DEFAULT_BAZHU_SHOW_OUTSIDE;
      } else {
        this.bazhu_show_outside = integer;
      } 
    } else {
      this.location = ((Builder)integer).location;
      this.like = ((Builder)integer).like;
      this.group = ((Builder)integer).group;
      this.post = ((Builder)integer).post;
      this.friend = ((Builder)integer).friend;
      this.live = ((Builder)integer).live;
      this.reply = ((Builder)integer).reply;
      this.bazhu_show_inside = ((Builder)integer).bazhu_show_inside;
      this.bazhu_show_outside = ((Builder)integer).bazhu_show_outside;
    } 
  }
}
