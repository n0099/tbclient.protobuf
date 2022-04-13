import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CreationData;

public final class CreationData extends Message {
  public static final Integer DEFAULT_AGREE_COUNT;
  
  public static final Integer DEFAULT_AGREE_COUNT_TREND;
  
  public static final Integer DEFAULT_COMMENT_COUNT;
  
  public static final Integer DEFAULT_COMMENT_TREND;
  
  public static final Integer DEFAULT_VALID_PLAY_COUNT;
  
  public static final Integer DEFAULT_VALID_PLAY_COUNT_TREND;
  
  public static final Integer DEFAULT_VIEW_COUNT;
  
  public static final Integer DEFAULT_VIEW_COUNT_TREND;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer agree_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer agree_count_trend;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer comment_count;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer comment_trend;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer valid_play_count;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer valid_play_count_trend;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer view_count;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer view_count_trend;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1430932872, "Ltbclient/CreationData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1430932872, "Ltbclient/CreationData;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_VIEW_COUNT = integer;
    DEFAULT_AGREE_COUNT = integer;
    DEFAULT_VIEW_COUNT_TREND = integer;
    DEFAULT_AGREE_COUNT_TREND = integer;
    DEFAULT_COMMENT_COUNT = integer;
    DEFAULT_COMMENT_TREND = integer;
    DEFAULT_VALID_PLAY_COUNT = integer;
    DEFAULT_VALID_PLAY_COUNT_TREND = integer;
  }
  
  public CreationData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.view_count;
      if (integer1 == null) {
        this.view_count = DEFAULT_VIEW_COUNT;
      } else {
        this.view_count = integer1;
      } 
      integer1 = paramBuilder.agree_count;
      if (integer1 == null) {
        this.agree_count = DEFAULT_AGREE_COUNT;
      } else {
        this.agree_count = integer1;
      } 
      integer1 = paramBuilder.view_count_trend;
      if (integer1 == null) {
        this.view_count_trend = DEFAULT_VIEW_COUNT_TREND;
      } else {
        this.view_count_trend = integer1;
      } 
      integer1 = paramBuilder.agree_count_trend;
      if (integer1 == null) {
        this.agree_count_trend = DEFAULT_AGREE_COUNT_TREND;
      } else {
        this.agree_count_trend = integer1;
      } 
      integer1 = paramBuilder.comment_count;
      if (integer1 == null) {
        this.comment_count = DEFAULT_COMMENT_COUNT;
      } else {
        this.comment_count = integer1;
      } 
      integer1 = paramBuilder.comment_trend;
      if (integer1 == null) {
        this.comment_trend = DEFAULT_COMMENT_TREND;
      } else {
        this.comment_trend = integer1;
      } 
      integer1 = paramBuilder.valid_play_count;
      if (integer1 == null) {
        this.valid_play_count = DEFAULT_VALID_PLAY_COUNT;
      } else {
        this.valid_play_count = integer1;
      } 
      integer = paramBuilder.valid_play_count_trend;
      if (integer == null) {
        this.valid_play_count_trend = DEFAULT_VALID_PLAY_COUNT_TREND;
      } else {
        this.valid_play_count_trend = integer;
      } 
    } else {
      this.view_count = ((Builder)integer).view_count;
      this.agree_count = ((Builder)integer).agree_count;
      this.view_count_trend = ((Builder)integer).view_count_trend;
      this.agree_count_trend = ((Builder)integer).agree_count_trend;
      this.comment_count = ((Builder)integer).comment_count;
      this.comment_trend = ((Builder)integer).comment_trend;
      this.valid_play_count = ((Builder)integer).valid_play_count;
      this.valid_play_count_trend = ((Builder)integer).valid_play_count_trend;
    } 
  }
}
