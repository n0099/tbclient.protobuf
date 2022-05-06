import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Ranking;
import tbclient.RankingParam;

public final class Ranking extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_RANK_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank_num;
  
  @ProtoField(tag = 3)
  public final RankingParam ranking_param;
  
  public Ranking(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      Integer integer = paramBuilder.rank_num;
      if (integer == null) {
        this.rank_num = DEFAULT_RANK_NUM;
      } else {
        this.rank_num = integer;
      } 
      this.ranking_param = paramBuilder.ranking_param;
    } else {
      this.name = paramBuilder.name;
      this.rank_num = paramBuilder.rank_num;
      this.ranking_param = paramBuilder.ranking_param;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(530663855, "Ltbclient/Ranking;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(530663855, "Ltbclient/Ranking;");
          return;
        } 
      } 
    } 
  }
}
