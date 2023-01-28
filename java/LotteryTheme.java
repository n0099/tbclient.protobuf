package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LotteryTheme extends Message {
  public static final String DEFAULT_BGCOLOR = "";
  
  public static final String DEFAULT_BGIMAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bgcolor;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bgimage;
  
  public LotteryTheme(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.bgcolor;
      if (str1 == null) {
        this.bgcolor = "";
      } else {
        this.bgcolor = str1;
      } 
      str = paramBuilder.bgimage;
      if (str == null) {
        this.bgimage = "";
      } else {
        this.bgimage = str;
      } 
    } else {
      this.bgcolor = ((Builder)str).bgcolor;
      this.bgimage = ((Builder)str).bgimage;
    } 
  }
  
  public LotteryTheme(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LotteryTheme> {
    public String bgcolor;
    
    public String bgimage;
    
    public Builder() {}
    
    public Builder(LotteryTheme param1LotteryTheme) {
      super(param1LotteryTheme);
      if (param1LotteryTheme == null)
        return; 
      this.bgcolor = param1LotteryTheme.bgcolor;
      this.bgimage = param1LotteryTheme.bgimage;
    }
    
    public LotteryTheme build(boolean param1Boolean) {
      return new LotteryTheme(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
