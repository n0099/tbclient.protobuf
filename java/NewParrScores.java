import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NewParrScores;

public final class NewParrScores extends Message {
  public static final Long DEFAULT_I_TOTAL;
  
  public static final Long DEFAULT_SCORES_TOTAL;
  
  public static final Integer DEFAULT_UPDATE_TIME = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long i_total;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long scores_total;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  static {
    DEFAULT_I_TOTAL = long_;
  }
  
  public NewParrScores(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.scores_total;
      if (long_1 == null) {
        this.scores_total = DEFAULT_SCORES_TOTAL;
      } else {
        this.scores_total = long_1;
      } 
      Integer integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
      long_ = paramBuilder.i_total;
      if (long_ == null) {
        this.i_total = DEFAULT_I_TOTAL;
      } else {
        this.i_total = long_;
      } 
    } else {
      this.scores_total = ((Builder)long_).scores_total;
      this.update_time = ((Builder)long_).update_time;
      this.i_total = ((Builder)long_).i_total;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2128087885, "Ltbclient/NewParrScores;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2128087885, "Ltbclient/NewParrScores;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_SCORES_TOTAL = long_;
  }
}
