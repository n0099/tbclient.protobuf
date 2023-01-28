package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

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
    super(paramBuilder);
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
  
  public NewParrScores(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_SCORES_TOTAL = long_;
  }
  
  public static final class Builder extends Message.Builder<NewParrScores> {
    public Long i_total;
    
    public Long scores_total;
    
    public Integer update_time;
    
    public Builder() {}
    
    public Builder(NewParrScores param1NewParrScores) {
      super(param1NewParrScores);
      if (param1NewParrScores == null)
        return; 
      this.scores_total = param1NewParrScores.scores_total;
      this.update_time = param1NewParrScores.update_time;
      this.i_total = param1NewParrScores.i_total;
    }
    
    public NewParrScores build(boolean param1Boolean) {
      return new NewParrScores(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
