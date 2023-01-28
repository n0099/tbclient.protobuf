package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PresetMyGiftPage extends Message {
  public static final Integer DEFAULT_CUR_PAGE;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer cur_page;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer total;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CUR_PAGE = integer;
    DEFAULT_HAS_MORE = integer;
    DEFAULT_TOTAL = integer;
  }
  
  public PresetMyGiftPage(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.cur_page;
      if (integer1 == null) {
        this.cur_page = DEFAULT_CUR_PAGE;
      } else {
        this.cur_page = integer1;
      } 
      integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer = paramBuilder.total;
      if (integer == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer;
      } 
    } else {
      this.cur_page = ((Builder)integer).cur_page;
      this.has_more = ((Builder)integer).has_more;
      this.total = ((Builder)integer).total;
    } 
  }
  
  public PresetMyGiftPage(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PresetMyGiftPage> {
    public Integer cur_page;
    
    public Integer has_more;
    
    public Integer total;
    
    public Builder() {}
    
    public Builder(PresetMyGiftPage param1PresetMyGiftPage) {
      super(param1PresetMyGiftPage);
      if (param1PresetMyGiftPage == null)
        return; 
      this.cur_page = param1PresetMyGiftPage.cur_page;
      this.has_more = param1PresetMyGiftPage.has_more;
      this.total = param1PresetMyGiftPage.total;
    }
    
    public PresetMyGiftPage build(boolean param1Boolean) {
      return new PresetMyGiftPage(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
