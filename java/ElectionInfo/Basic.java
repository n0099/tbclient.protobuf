package tbclient.ElectionInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Basic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BEGIN_APPLY_TIME = "";
  
  public static final String DEFAULT_BEGIN_AUDIT_TIME = "";
  
  public static final String DEFAULT_BEGIN_PUBLIC_TIME = "";
  
  public static final String DEFAULT_BEGIN_VOTE_TIME = "";
  
  public static final Integer DEFAULT_CANDIDATE_NUM;
  
  public static final Boolean DEFAULT_IS_VOTED;
  
  public static final String DEFAULT_REMIND_TIME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TOTAL_VOTE_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String begin_apply_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String begin_audit_time;
  
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
    super(paramBuilder);
    String str;
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
      str = paramBuilder.begin_audit_time;
      if (str == null) {
        this.begin_audit_time = "";
      } else {
        this.begin_audit_time = str;
      } 
    } else {
      this.begin_apply_time = ((Builder)str).begin_apply_time;
      this.begin_vote_time = ((Builder)str).begin_vote_time;
      this.begin_public_time = ((Builder)str).begin_public_time;
      this.status = ((Builder)str).status;
      this.remind_time = ((Builder)str).remind_time;
      this.candidate_num = ((Builder)str).candidate_num;
      this.total_vote_num = ((Builder)str).total_vote_num;
      this.is_voted = ((Builder)str).is_voted;
      this.notice = ((Builder)str).notice;
      this.begin_audit_time = ((Builder)str).begin_audit_time;
    } 
  }
  
  public Basic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Basic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String begin_apply_time;
    
    public String begin_audit_time;
    
    public String begin_public_time;
    
    public String begin_vote_time;
    
    public Integer candidate_num;
    
    public Boolean is_voted;
    
    public NoticeContent notice;
    
    public String remind_time;
    
    public Integer status;
    
    public Integer total_vote_num;
    
    public Builder() {}
    
    public Builder(Basic param1Basic) {
      super(param1Basic);
      if (param1Basic == null)
        return; 
      this.begin_apply_time = param1Basic.begin_apply_time;
      this.begin_vote_time = param1Basic.begin_vote_time;
      this.begin_public_time = param1Basic.begin_public_time;
      this.status = param1Basic.status;
      this.remind_time = param1Basic.remind_time;
      this.candidate_num = param1Basic.candidate_num;
      this.total_vote_num = param1Basic.total_vote_num;
      this.is_voted = param1Basic.is_voted;
      this.notice = param1Basic.notice;
      this.begin_audit_time = param1Basic.begin_audit_time;
    }
    
    public Basic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Basic)interceptResult.objValue; 
      } 
      return new Basic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
