package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SugRankingInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_RANK_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final RankingParam rank_param;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String rank_title;
  
  public SugRankingInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.rank_title;
      if (str == null) {
        this.rank_title = "";
      } else {
        this.rank_title = str;
      } 
      this.rank_param = paramBuilder.rank_param;
    } else {
      this.rank_title = paramBuilder.rank_title;
      this.rank_param = paramBuilder.rank_param;
    } 
  }
  
  public SugRankingInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SugRankingInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public RankingParam rank_param;
    
    public String rank_title;
    
    public Builder() {}
    
    public Builder(SugRankingInfo param1SugRankingInfo) {
      super(param1SugRankingInfo);
      if (param1SugRankingInfo == null)
        return; 
      this.rank_title = param1SugRankingInfo.rank_title;
      this.rank_param = param1SugRankingInfo.rank_param;
    }
    
    public SugRankingInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SugRankingInfo)interceptResult.objValue; 
      } 
      return new SugRankingInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
