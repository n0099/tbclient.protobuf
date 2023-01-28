package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LotteryRegular extends Message {
  public static final List<Integer> DEFAULT_CHANCE = Collections.emptyList();
  
  public static final String DEFAULT_REGULAR = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT32)
  public final List<Integer> chance;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String regular;
  
  public LotteryRegular(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      String str = paramBuilder.regular;
      if (str == null) {
        this.regular = "";
      } else {
        this.regular = str;
      } 
      list = paramBuilder.chance;
      if (list == null) {
        this.chance = DEFAULT_CHANCE;
      } else {
        this.chance = Message.immutableCopyOf(list);
      } 
    } else {
      this.regular = ((Builder)list).regular;
      this.chance = Message.immutableCopyOf(((Builder)list).chance);
    } 
  }
  
  public LotteryRegular(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LotteryRegular> {
    public List<Integer> chance;
    
    public String regular;
    
    public Builder() {}
    
    public Builder(LotteryRegular param1LotteryRegular) {
      super(param1LotteryRegular);
      if (param1LotteryRegular == null)
        return; 
      this.regular = param1LotteryRegular.regular;
      this.chance = Message.copyOf(param1LotteryRegular.chance);
    }
    
    public LotteryRegular build(boolean param1Boolean) {
      return new LotteryRegular(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
