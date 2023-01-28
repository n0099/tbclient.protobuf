package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopbarEntrance extends Message {
  public static final String DEFAULT_GUIDE_TIP_FIRST_TEXT = "";
  
  public static final String DEFAULT_GUIDE_TIP_TEXT = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String guide_tip_first_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String guide_tip_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  public TopbarEntrance(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.guide_tip_first_text;
      if (str1 == null) {
        this.guide_tip_first_text = "";
      } else {
        this.guide_tip_first_text = str1;
      } 
      str1 = paramBuilder.guide_tip_text;
      if (str1 == null) {
        this.guide_tip_text = "";
      } else {
        this.guide_tip_text = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.guide_tip_first_text = ((Builder)str).guide_tip_first_text;
      this.guide_tip_text = ((Builder)str).guide_tip_text;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public TopbarEntrance(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopbarEntrance> {
    public String guide_tip_first_text;
    
    public String guide_tip_text;
    
    public String jump_url;
    
    public Builder() {}
    
    public Builder(TopbarEntrance param1TopbarEntrance) {
      super(param1TopbarEntrance);
      if (param1TopbarEntrance == null)
        return; 
      this.guide_tip_first_text = param1TopbarEntrance.guide_tip_first_text;
      this.guide_tip_text = param1TopbarEntrance.guide_tip_text;
      this.jump_url = param1TopbarEntrance.jump_url;
    }
    
    public TopbarEntrance build(boolean param1Boolean) {
      return new TopbarEntrance(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
