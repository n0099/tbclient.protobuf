package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Ranking extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_RANK_NUM = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank_num;
  
  @ProtoField(tag = 3)
  public final RankingParam ranking_param;
  
  public Ranking(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
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
  
  public Ranking(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<Ranking> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String name;
    
    public Integer rank_num;
    
    public RankingParam ranking_param;
    
    public Builder() {}
    
    public Builder(Ranking param1Ranking) {
      super(param1Ranking);
      if (param1Ranking == null)
        return; 
      this.name = param1Ranking.name;
      this.rank_num = param1Ranking.rank_num;
      this.ranking_param = param1Ranking.ranking_param;
    }
    
    public Ranking build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Ranking)interceptResult.objValue; 
      } 
      return new Ranking(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
