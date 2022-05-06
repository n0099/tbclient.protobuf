package ElectionInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ElectionInfo.NoticeContent;

public final class Basic extends Message {
  public static final String DEFAULT_BEGIN_APPLY_TIME = "";
  
  public static final String DEFAULT_BEGIN_PUBLIC_TIME = "";
  
  public static final String DEFAULT_BEGIN_VOTE_TIME = "";
  
  public static final Integer DEFAULT_CANDIDATE_NUM;
  
  public static final Boolean DEFAULT_IS_VOTED;
  
  public static final String DEFAULT_REMIND_TIME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TOTAL_VOTE_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String begin_apply_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String begin_public_time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String begin_vote_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer candidate_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.BOOL)
  public final Boolean is_voted;
  
  @ProtoField(tag = 9)
  public final NoticeContent notice;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String remind_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer total_vote_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1323323541, "Ltbclient/ElectionInfo/Basic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1323323541, "Ltbclient/ElectionInfo/Basic;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_CANDIDATE_NUM = integer;
    DEFAULT_TOTAL_VOTE_NUM = integer;
    DEFAULT_IS_VOTED = Boolean.FALSE;
  }
  
  public Basic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.begin_apply_time;
      if (str2 == null) {
        this.begin_apply_time = "";
      } else {
        this.begin_apply_time = str2;
      } 
      str2 = paramBuilder.begin_vote_time;
      if (str2 == null) {
        this.begin_vote_time = "";
      } else {
        this.begin_vote_time = str2;
      } 
      str2 = paramBuilder.begin_public_time;
      if (str2 == null) {
        this.begin_public_time = "";
      } else {
        this.begin_public_time = str2;
      } 
      Integer integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      String str1 = paramBuilder.remind_time;
      if (str1 == null) {
        this.remind_time = "";
      } else {
        this.remind_time = str1;
      } 
      Integer integer1 = paramBuilder.candidate_num;
      if (integer1 == null) {
        this.candidate_num = DEFAULT_CANDIDATE_NUM;
      } else {
        this.candidate_num = integer1;
      } 
      integer1 = paramBuilder.total_vote_num;
      if (integer1 == null) {
        this.total_vote_num = DEFAULT_TOTAL_VOTE_NUM;
      } else {
        this.total_vote_num = integer1;
      } 
      Boolean bool = paramBuilder.is_voted;
      if (bool == null) {
        this.is_voted = DEFAULT_IS_VOTED;
      } else {
        this.is_voted = bool;
      } 
      this.notice = paramBuilder.notice;
    } else {
      this.begin_apply_time = paramBuilder.begin_apply_time;
      this.begin_vote_time = paramBuilder.begin_vote_time;
      this.begin_public_time = paramBuilder.begin_public_time;
      this.status = paramBuilder.status;
      this.remind_time = paramBuilder.remind_time;
      this.candidate_num = paramBuilder.candidate_num;
      this.total_vote_num = paramBuilder.total_vote_num;
      this.is_voted = paramBuilder.is_voted;
      this.notice = paramBuilder.notice;
    } 
  }
}
