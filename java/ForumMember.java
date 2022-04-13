import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ForumMember;

public final class ForumMember extends Message {
  public static final Integer DEFAULT_CUR_SCORE;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_LEVELUP_SCORE;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer cur_score;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer levelup_score;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1496119702, "Ltbclient/ForumMember;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1496119702, "Ltbclient/ForumMember;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_CUR_SCORE = integer;
    DEFAULT_LEVELUP_SCORE = integer;
  }
  
  public ForumMember(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_like;
      if (integer2 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer2;
      } 
      integer2 = paramBuilder.user_level;
      if (integer2 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer2;
      } 
      String str = paramBuilder.level_name;
      if (str == null) {
        this.level_name = "";
      } else {
        this.level_name = str;
      } 
      Integer integer1 = paramBuilder.cur_score;
      if (integer1 == null) {
        this.cur_score = DEFAULT_CUR_SCORE;
      } else {
        this.cur_score = integer1;
      } 
      integer = paramBuilder.levelup_score;
      if (integer == null) {
        this.levelup_score = DEFAULT_LEVELUP_SCORE;
      } else {
        this.levelup_score = integer;
      } 
    } else {
      this.is_like = ((Builder)integer).is_like;
      this.user_level = ((Builder)integer).user_level;
      this.level_name = ((Builder)integer).level_name;
      this.cur_score = ((Builder)integer).cur_score;
      this.levelup_score = ((Builder)integer).levelup_score;
    } 
  }
}
