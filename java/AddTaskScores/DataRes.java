package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_SCORES;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scores;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FINISH = integer;
    DEFAULT_SCORES = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      integer = paramBuilder.scores;
      if (integer == null) {
        this.scores = DEFAULT_SCORES;
      } else {
        this.scores = integer;
      } 
    } else {
      this.is_finish = ((Builder)integer).is_finish;
      this.scores = ((Builder)integer).scores;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer is_finish;
    
    public Integer scores;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.is_finish = param1DataRes.is_finish;
      this.scores = param1DataRes.scores;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
