package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaChallengeInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_CHALLENGE_ID;
  
  public static final String DEFAULT_EXT = "";
  
  public static final String DEFAULT_RIVAL_HLS_URL = "";
  
  public static final String DEFAULT_RIVAL_RTMP_URL = "";
  
  public static final String DEFAULT_RIVAL_SESSION = "";
  
  public static final Long DEFAULT_WINNING_NUM;
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
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
  
  public AlaChallengeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaChallengeInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long challenge_id;
    
    public String ext;
    
    public String rival_hls_url;
    
    public String rival_rtmp_url;
    
    public String rival_session;
    
    public Long winning_num;
    
    public Builder() {}
    
    public Builder(AlaChallengeInfo param1AlaChallengeInfo) {
      super(param1AlaChallengeInfo);
      if (param1AlaChallengeInfo == null)
        return; 
      this.challenge_id = param1AlaChallengeInfo.challenge_id;
      this.winning_num = param1AlaChallengeInfo.winning_num;
      this.rival_session = param1AlaChallengeInfo.rival_session;
      this.rival_rtmp_url = param1AlaChallengeInfo.rival_rtmp_url;
      this.rival_hls_url = param1AlaChallengeInfo.rival_hls_url;
      this.ext = param1AlaChallengeInfo.ext;
    }
    
    public AlaChallengeInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AlaChallengeInfo)interceptResult.objValue; 
      } 
      return new AlaChallengeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
