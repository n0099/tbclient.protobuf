package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

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
  
  public static final class Builder extends Message.Builder<Ranking> {
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
      return new Ranking(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
