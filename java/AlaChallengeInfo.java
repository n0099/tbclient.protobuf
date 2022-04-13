import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaChallengeInfo;

public final class AlaChallengeInfo extends Message {
  public static final Long DEFAULT_CHALLENGE_ID;
  
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_RIVAL_HLS_URL = "";
  
  public static final String DEFAULT_RIVAL_RTMP_URL = "";
  
  public static final String DEFAULT_RIVAL_SESSION = "";
  
  public static final Long DEFAULT_WINNING_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long challenge_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ext;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String rival_hls_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String rival_rtmp_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String rival_session;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long winning_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1021810122, "Ltbclient/AlaChallengeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1021810122, "Ltbclient/AlaChallengeInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_CHALLENGE_ID = long_;
    DEFAULT_WINNING_NUM = long_;
  }
  
  public AlaChallengeInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.challenge_id;
      if (long_ == null) {
        this.challenge_id = DEFAULT_CHALLENGE_ID;
      } else {
        this.challenge_id = long_;
      } 
      long_ = paramBuilder.winning_num;
      if (long_ == null) {
        this.winning_num = DEFAULT_WINNING_NUM;
      } else {
        this.winning_num = long_;
      } 
      String str1 = paramBuilder.rival_session;
      if (str1 == null) {
        this.rival_session = "";
      } else {
        this.rival_session = str1;
      } 
      str1 = paramBuilder.rival_rtmp_url;
      if (str1 == null) {
        this.rival_rtmp_url = "";
      } else {
        this.rival_rtmp_url = str1;
      } 
      str1 = paramBuilder.rival_hls_url;
      if (str1 == null) {
        this.rival_hls_url = "";
      } else {
        this.rival_hls_url = str1;
      } 
      str = paramBuilder.ext;
      if (str == null) {
        this.ext = "";
      } else {
        this.ext = str;
      } 
    } else {
      this.challenge_id = ((Builder)str).challenge_id;
      this.winning_num = ((Builder)str).winning_num;
      this.rival_session = ((Builder)str).rival_session;
      this.rival_rtmp_url = ((Builder)str).rival_rtmp_url;
      this.rival_hls_url = ((Builder)str).rival_hls_url;
      this.ext = ((Builder)str).ext;
    } 
  }
}
