package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbFollowTip extends Message {
  public static final Integer DEFAULT_IS_TOAST_TIP = Integer.valueOf(0);
  
  public static final String DEFAULT_TIP_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_toast_tip;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_text;
  
  public PbFollowTip(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_toast_tip;
      if (integer == null) {
        this.is_toast_tip = DEFAULT_IS_TOAST_TIP;
      } else {
        this.is_toast_tip = integer;
      } 
      str = paramBuilder.tip_text;
      if (str == null) {
        this.tip_text = "";
      } else {
        this.tip_text = str;
      } 
    } else {
      this.is_toast_tip = ((Builder)str).is_toast_tip;
      this.tip_text = ((Builder)str).tip_text;
    } 
  }
  
  public PbFollowTip(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbFollowTip> {
    public Integer is_toast_tip;
    
    public String tip_text;
    
    public Builder() {}
    
    public Builder(PbFollowTip param1PbFollowTip) {
      super(param1PbFollowTip);
      if (param1PbFollowTip == null)
        return; 
      this.is_toast_tip = param1PbFollowTip.is_toast_tip;
      this.tip_text = param1PbFollowTip.tip_text;
    }
    
    public PbFollowTip build(boolean param1Boolean) {
      return new PbFollowTip(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
