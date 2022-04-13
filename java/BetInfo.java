import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BetInfo;

public final class BetInfo extends Message {
  public static final String DEFAULT_BET = "";
  
  public static final Integer DEFAULT_NO;
  
  public static final Long DEFAULT_SCORE = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bet;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer no;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long score;
  
  static {
    DEFAULT_NO = Integer.valueOf(0);
  }
  
  public BetInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.bet;
      if (str == null) {
        this.bet = "";
      } else {
        this.bet = str;
      } 
      Long long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
      integer = paramBuilder.no;
      if (integer == null) {
        this.no = DEFAULT_NO;
      } else {
        this.no = integer;
      } 
    } else {
      this.bet = ((Builder)integer).bet;
      this.score = ((Builder)integer).score;
      this.no = ((Builder)integer).no;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2106033702, "Ltbclient/BetInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2106033702, "Ltbclient/BetInfo;");
          return;
        } 
      } 
    } 
  }
}
