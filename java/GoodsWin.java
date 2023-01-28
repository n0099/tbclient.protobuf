package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GoodsWin extends Message {
  public static final String DEFAULT_GOODS_URL = "";
  
  public static final Integer DEFAULT_SHOW = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String goods_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show;
  
  public GoodsWin(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.show;
      if (integer == null) {
        this.show = DEFAULT_SHOW;
      } else {
        this.show = integer;
      } 
      str = paramBuilder.goods_url;
      if (str == null) {
        this.goods_url = "";
      } else {
        this.goods_url = str;
      } 
    } else {
      this.show = ((Builder)str).show;
      this.goods_url = ((Builder)str).goods_url;
    } 
  }
  
  public GoodsWin(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GoodsWin> {
    public String goods_url;
    
    public Integer show;
    
    public Builder() {}
    
    public Builder(GoodsWin param1GoodsWin) {
      super(param1GoodsWin);
      if (param1GoodsWin == null)
        return; 
      this.show = param1GoodsWin.show;
      this.goods_url = param1GoodsWin.goods_url;
    }
    
    public GoodsWin build(boolean param1Boolean) {
      return new GoodsWin(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
